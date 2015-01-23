package com.wglee.spring.study.initializer;/**
 * Created by 1002371 on 15. 1. 23..
 */

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author wangeun.lee@sk.com
 */
public class WebXmlInitializer implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		addRootContext(servletContext);
		addServletContext(servletContext);
	}

	private void addRootContext(ServletContext servletContext) {
		XmlWebApplicationContext applicationContext = new XmlWebApplicationContext();

		applicationContext.setConfigLocation("classpath:applicationContext.xml");
		servletContext.addListener(new ContextLoaderListener(applicationContext));
	}

	private void addServletContext(ServletContext servletContext) {
		XmlWebApplicationContext mvcContext = new XmlWebApplicationContext();

		mvcContext.setConfigLocation("classpath:mvcConfig.xml");
		ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(mvcContext));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}
}