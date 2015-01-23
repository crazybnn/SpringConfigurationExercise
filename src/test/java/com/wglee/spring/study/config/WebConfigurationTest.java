package com.wglee.spring.study.config;

import com.wglee.spring.study.model.Article;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class WebConfigurationTest {
	@Test
	public void getTagContainerBean_XML() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Article article = context.getBean("article", Article.class);

		assertNotNull(article);
	}
}