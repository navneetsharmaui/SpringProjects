/**
 * 
 */
package com.mindtree.springfive.context;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.mindtree.springfive.model.Department;
import com.mindtree.springfive.model.Employee;
import com.mindtree.springfive.model.ListEmployees;
import com.mindtree.springfive.model.MapEmpTasks;
import com.mindtree.springfive.model.PropertiesAudition;
import com.mindtree.springfive.model.SetDepartments;

/**
 * @author M1044357
 *
 */
@Configuration
public class BeanConfig {
	
	@Bean(name="empRec1")
	@Scope("singleton")
	public Employee getEmpRecord1() {
		Employee empRec1 = new Employee();
		return empRec1;
	}
	
	@Bean(name="dept1")
	public Department getDept1() {
		Department dept1 = new Department();
		return dept1;
	}
	
	@SuppressWarnings("deprecation")
	@Bean(name="empRec2")
	@Scope("prototype")
	public Employee getEmpRecord2() {
		Employee empRec2 = new Employee();
		empRec2.setFirstName("Navneet");
		empRec2.setLastName("Sharma");
		empRec2.setBirthDate(new Date(2018, 8, 15));
		empRec2.setAge(23);
		empRec2.setSalary(325000.00);
		empRec2.setPosition("FSE");
		empRec2.setDepartment(getDept2());
		return empRec2;
	}
	
	@Bean(name="dept2")
	@Scope("prototype")
	public Department getDept2() {
		Department dept2 = new Department();
		dept2.setDeptNo(13456);
		dept2.setDeptName("Java FSE");
		return dept2;
	}
	
	@Bean(name="empRec3")
	public Employee getEmpRecord3(){
		@SuppressWarnings("deprecation")
		Employee empRec3 = new Employee("Jose","Rizal",new Date(50, 5, 19), 101, 90000.00, "scriber", getDept3());
		return empRec3;
	}
	
	@Bean(name="dept3")
	public Department getDept3(){
		Department dept3 = new Department(56748, "Communication Department");
		return dept3;
	}
	
	@SuppressWarnings("deprecation")
	@Lazy
	@Bean(name="empRec4")
	public Employee getEmpRecord4() {
		Employee empRec4 = new Employee("Diego","Silang",new Date(65, 11, 15), 55, 85000.00, "guitarist", getDept4());
		return empRec4;
	}
	
	@Lazy
	@Bean(name="dept4")
	public Department getDept4() {
		Department dept4 = new Department(11223, "Music Department");
		return dept4;
	}
	
	@Lazy
	@SuppressWarnings("deprecation")
	@Bean(name="empRec5")
	public Employee getEmpRecord5() {
		Employee empRec5 = new Employee();
		
		empRec5.setFirstName("Gabriela");
		empRec5.setLastName("Silang");
		empRec5.setAge(67);
		empRec5.setBirthDate(new Date(50, 5, 19));
		empRec5.setPosition("Writer");
		empRec5.setSalary(89700.00);
		empRec5.setDepartment(new Department() {
			String deptName = "Communication Department";
			Integer deptNo = 232456;
			@Override
			public String getDeptName() {
				return deptName;
			}
			@Override
			public Integer getDeptNo() {
				return deptNo;
			}
			@Override
			public void setDeptName(String deptName) {
				this.deptName=deptName;
			}
			@Override
			public void setDeptNo(Integer deptNo) {
				this.deptNo=deptNo;
			}
		});
		return empRec5;
	}
	
	@Bean
	public ListEmployees listEmployees() {
		ListEmployees listEmps = new ListEmployees();
		List<Employee> empRecs = new ArrayList<>();
		empRecs.add(getEmpRecord2());
		empRecs.add(getEmpRecord3());
		empRecs.add(getEmpRecord4());
		empRecs.add(getEmpRecord5());
		listEmps.setListEmps(empRecs);
		
		List<String> empNames = new ArrayList<>();
		empNames.add("Juan");
		empNames.add("Jose");
		
		listEmps.setListEmpNames(empNames);
		
		return listEmps;
	}
	
	@Bean
	public SetDepartments setDepartments() {
		SetDepartments setDepts = new SetDepartments();
		
		Set<Department> deptRecs = new HashSet<>();
		deptRecs.add(getDept2());
		deptRecs.add(getDept3());
		deptRecs.add(getDept4());
		setDepts.setSetDept(deptRecs);
		
		Set<String> deptNames = new HashSet<>();
		deptNames.add("Music");
		deptNames.add("Arts");
		setDepts.setDeptNames(deptNames);
		
		return setDepts;
	}
	
	@Bean
	public MapEmpTasks mapEmpTasks() {
		MapEmpTasks mapTasks = new MapEmpTasks();
		
		Map<String, Employee> empTasks = new HashMap<>();
		empTasks.put("expository", getEmpRecord2());
		empTasks.put("feature", getEmpRecord3());
		mapTasks.setMapEmpTask(empTasks);
		
		Map<String, String> mgrTasks = new HashMap<>();
		mgrTasks.put("expository", "Joan Arkos");
		mgrTasks.put("feature", "Billy Jean");
		mapTasks.setMapEmpMgr(mgrTasks);
		
		return mapTasks;
	}

	@Bean
	public PropertiesAudition auditionInfo(){
		PropertiesAudition auditionInfo = new PropertiesAudition();
		
		Properties addressProps = new Properties();
		addressProps.setProperty("country", "Philippines");
		addressProps.setProperty("city", "Makati");
		addressProps.setProperty("building", "Rufino Tower 2");
		addressProps.setProperty("zipcode", "1223");
		auditionInfo.setAuditionAddress(addressProps);
		
		Properties reqtProps = new Properties();
		reqtProps.setProperty("document", "curriculum vitae");
		reqtProps.setProperty("picture", "2x2 recent picture");
		reqtProps.setProperty("time", "8:00 AM");
		auditionInfo.setAuditionRequirement(reqtProps);
		
		return auditionInfo;
	}
}
