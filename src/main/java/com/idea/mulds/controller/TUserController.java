package com.idea.mulds.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idea.mulds.persistent.entity.TUser;
import com.idea.mulds.service.TUserService;

@RestController
@RequestMapping("/tUser")
public class TUserController {
	private static final Logger logger = LoggerFactory.getLogger(TUserController.class);
	@Autowired
	private TUserService TUserService;
	
	@RequestMapping("/getById")
	public Object getUserById(Integer id) {
		logger.info("根据用户id查找某个用户");
		TUser user = TUserService.getUserById(id);
		return user;
	}
}