package com.mengll.melelee.controlor;

import com.mengll.melelee.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyControler {
	private static Logger logger = LoggerFactory.getLogger(MyControler.class);
	@Autowired
	private MyService myService;

	@RequestMapping(value = "/test")
	@ResponseBody
	public String test() {
		logger.info("测试正常");
		return myService.saveInfo("asdf");
	}
}
