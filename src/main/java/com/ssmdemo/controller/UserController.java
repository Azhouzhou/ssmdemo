/**
 * Copyright(c) 2011-2015 by UCredit Inc.
 * All Rights Reserved
 */
package com.ssmdemo.controller;
import com.ssmdemo.model.User;
import com.ssmdemo.service.UserService;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


/**
 * @author zhouzhou
 * @date   2018年11月06日上午11:35:30
 *          Auto generated, please update the author when you implementing this controller.
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	//http://localhost:8080/ssmdemo/user/showuser?id=1
	@RequestMapping(value="/showUser",method=RequestMethod.GET)
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		System.out.println("userId:"+userId);
        User user=new User();
        user.setId(userId);
		User userinfo = this.userService.selectUser(user);

		model.addAttribute("user", userinfo);
		return "showUser";
	}

}
