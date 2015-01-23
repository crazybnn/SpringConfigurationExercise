package com.wglee.spring.study.controller;/**
 * Created by 1002371 on 15. 1. 23..
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wangeun.lee@sk.com
 */
@Controller
public class HelloController {
	@RequestMapping(name = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "/hello";
	}
}
