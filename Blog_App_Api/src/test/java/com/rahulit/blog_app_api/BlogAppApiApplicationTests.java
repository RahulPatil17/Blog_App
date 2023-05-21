package com.rahulit.blog_app_api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.rahulit.blog_app_api.BlogAppApiApplication;
import com.rahulit.blog_app_api.controller.AuthController;

@SpringBootTest(classes = BlogAppApiApplication.class)
class BlogAppApiApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testAuthcontroller() {
		
		AuthController authController=new AuthController();
	}
}
