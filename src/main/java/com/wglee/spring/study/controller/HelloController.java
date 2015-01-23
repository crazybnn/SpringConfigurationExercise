package com.wglee.spring.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wglee21g@gmail.com
 */
@Controller
public class HelloController {
	@RequestMapping(name = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "/hello";
	}
}
