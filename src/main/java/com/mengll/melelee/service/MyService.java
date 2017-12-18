package com.mengll.melelee.service;

import org.springframework.stereotype.Service;

/**
 * Service层
 *
 * @author mengll
 * @create 2017-12-18 14:04
 **/
@Service
public class MyService {
	public String saveInfo(String msg){
		System.out.println("save success");
		return "success";
	}
}
