package com.idea.mulds.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idea.mulds.persistent.persistent2.entity.TCustomer;
import com.idea.mulds.service.TCustomerService;
/**
 * 数据源2的t_Customer
 * @date 2020-04-27 17:09:14
 * @author yang
 */
@RestController
@RequestMapping("/customer")
public class TCustomerController {
	private static final Logger logger = LoggerFactory.getLogger(TCustomerController.class);
	@Autowired
	private TCustomerService tCustomerService;
	
	@RequestMapping("/getAll")
	public Object getUserById(Integer id) {
		logger.info("查找数据源2所有的用户");
		List<TCustomer> allCustomers = tCustomerService.getAllCustomers();
		return allCustomers;
	}
}