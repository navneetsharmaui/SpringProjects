/**
 * 
 */
package com.mindtree.springfive.beans;

/**
 * @author M1044357
 *
 */
public class Student {

	/**
	 * 
	 */
	private int rollNo;
	private String studentName;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param rollNo
	 * @param studentNam
	 */
	public Student(int rollNo, String studentName) {
		this.rollNo = rollNo;
		this.studentName = studentName;
	}

	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the studentNam
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentNam the studentNam to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return this.rollNo+" "+this.studentName;
	}
}
