package com.bwie.xll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bwie.xll.entity.User;
import com.bwie.xll.mapper.UserMapper;

@RestController
public class UserController {
    @Autowired
    private UserMapper mapper;
    
    @RequestMapping("users")
    public List<User> user() {
    	
    	return this.mapper.findAll();
    }
    @RequestMapping("plsc")
    public boolean plsc(String uid) {
    	try {
    		  mapper.plsc(uid);
			  return true;
			   
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
    }
}
