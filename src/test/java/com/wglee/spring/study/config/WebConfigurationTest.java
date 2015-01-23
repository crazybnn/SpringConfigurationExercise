package com.wglee.spring.study.config;

import com.wglee.spring.study.model.Article;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertNotNull;

public class WebConfigurationTest {
	@Test
	public void getTagContainerBean_Annotation() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfiguration.class);

		Article article = context.getBean("article", Article.class);

		assertNotNull(article);
	}
}