package com.idea.mulds.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idea.mulds.persistent.dao.TUserMapper;
import com.idea.mulds.persistent.entity.TUser;
import com.idea.mulds.service.TUserService;
@Service
public class TUserServiceImpl implements TUserService {

	@Autowired
	private TUserMapper tUserMapper;

	@Override
	public TUser getUserById(Integer id) {
		TUser selectByPrimaryKey = tUserMapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

}
