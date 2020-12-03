package com.list.itemlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ItemList {

	public static void main(String[] args) {
		SpringApplication.run(ItemList.class, args);
		System.out.println("http://127.0.0.1:8080/");
	}
}
