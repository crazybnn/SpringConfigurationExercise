package com.wglee.spring.study.config;

import com.wglee.spring.study.model.Article;
import com.wglee.spring.study.model.Tag;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WebConfigurationTest {
	@Test
	public void getTagContainerBean_Annotation() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfiguration.class);

		Article article = context.getBean("article", Article.class);

		assertNotNull(article);
	}

	@Test
	public void getTagBean_Annotation() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfiguration.class);
		Article article = context.getBean("article", Article.class);

		List<Tag> tags = article.getTags();
		int size = tags.size();

		assertEquals(size, 1);
	}
}