package com.idea.mulds.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idea.mulds.persistent.persistent2.dao.TCustomerMapper;
import com.idea.mulds.persistent.persistent2.entity.TCustomer;
import com.idea.mulds.persistent.persistent2.entity.TCustomerExample;
import com.idea.mulds.service.TCustomerService;
@Service
public class TCustomerServiceImpl implements TCustomerService {
	@Autowired
	private TCustomerMapper tCustomerMapper;
	@Override
	public List<TCustomer> getAllCustomers() {
		TCustomerExample example = new TCustomerExample();
		example.createCriteria();
		List<TCustomer> selectByExample = tCustomerMapper.selectByExample(example);
		return selectByExample;
	}

}
