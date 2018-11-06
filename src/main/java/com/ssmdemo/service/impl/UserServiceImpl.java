/**
 * Copyright(c) 2011-2015 by UCredit Inc.
 * All Rights Reserved
 */
package com.ssmdemo.service.impl;

import com.ssmdemo.dao.UserMapper;
import com.ssmdemo.model.User;
import com.ssmdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhouzhou
 * @date   2018年11月06日上午11:35:30
 */
@Service
public class UserServiceImpl implements UserService {
	private final static Logger LOGGER = LoggerFactory.getLogger(UserService.class);

	@Resource
	private UserMapper userMapper;

	@Override
	public User selectUser(User user) {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", user.getId());
		List<User> userList = (List<User>) this.userMapper.selectByMap(params);
		return userList.get(0);
	}
}
