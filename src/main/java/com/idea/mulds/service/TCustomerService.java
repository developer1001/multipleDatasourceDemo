package com.idea.mulds.service;

import java.util.List;

import com.idea.mulds.persistent.persistent2.entity.TCustomer;

/**
 * 数据源2 t_customer
 * @date 2020-04-27 17:10:21
 * @author yang
 */
public interface TCustomerService {
	/**
	 * 获得所有的客户
	 * @return
	 */
	List<TCustomer> getAllCustomers();
}
