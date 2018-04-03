/**
 * 
 */
package com.mindtree.springfive.model;

import java.util.Map;

/**
 * @author M1044357
 *
 */
public class MapEmpTasks {
	private Map<String, Employee> mapEmpTask;
	private Map<String, String> mapEmpMgr;
	/**
	 * 
	 */
	public MapEmpTasks() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param mapEmpTask
	 * @param mapEmpMgr
	 */
	public MapEmpTasks(Map<String, Employee> mapEmpTask, Map<String, String> mapEmpMgr) {
		this.mapEmpTask = mapEmpTask;
		this.mapEmpMgr = mapEmpMgr;
	}
	/**
	 * @return the mapEmpTask
	 */
	public Map<String, Employee> getMapEmpTask() {
		return mapEmpTask;
	}
	/**
	 * @param mapEmpTask the mapEmpTask to set
	 */
	public void setMapEmpTask(Map<String, Employee> mapEmpTask) {
		this.mapEmpTask = mapEmpTask;
	}
	/**
	 * @return the mapEmpMgr
	 */
	public Map<String, String> getMapEmpMgr() {
		return mapEmpMgr;
	}
	/**
	 * @param mapEmpMgr the mapEmpMgr to set
	 */
	public void setMapEmpMgr(Map<String, String> mapEmpMgr) {
		this.mapEmpMgr = mapEmpMgr;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MapEmpTasks [mapEmpTask=" + mapEmpTask + ", mapEmpMgr=" + mapEmpMgr + "]";
	}
}
