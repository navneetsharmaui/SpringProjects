/**
 * 
 */
package com.mindtree.springfive.dao;

import com.mindtree.springfive.entity.OrderDetails;

/**
 * @author M1044357
 *
 */
public interface DAO {
	public boolean addToDatabase(OrderDetails orderDetails);
	
	public boolean deleteOrder(int oid);
	
	public int findLatestOrderID();
}
