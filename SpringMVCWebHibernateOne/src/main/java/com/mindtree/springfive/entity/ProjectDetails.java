/**
 * 
 */
package com.mindtree.springfive.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author M1044357
 *
 */
@Entity
@Table
public class ProjectDetails {
	@Id
	private int projectId;
	@Column
	private String projectName;
	@Column
	private String projectDescription;
	@Column
	private int estimatedHours;
	
	
	public ProjectDetails(int projectId, String projectName, String projectDescription, int estimatedHours) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.estimatedHours = estimatedHours;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public int getEstimatedHours() {
		return estimatedHours;
	}
	public void setEstimatedHours(int estimatedHours) {
		this.estimatedHours = estimatedHours;
	}
	@Override
	public String toString() {
		return "ProjectDetails [projectId=" + projectId + ", projectName=" + projectName + ", projectDescription="
				+ projectDescription + ", estimatedHours=" + estimatedHours + "]";
	}

}