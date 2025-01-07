package com.ty;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@GetMapping(value = "/book", produces = "application/xml", consumes = { "application/xml", "application/json" })
	public Book get(@RequestBody Book book) {
		System.out.println(book);
		return book;
	}

	@GetMapping(value = "/getbook", consumes = {"application/xml", "application/json" },
									produces = {"application/xml", "application/json" })
	public Book getBook(@RequestBody Book book) {
		return book;
	}

}
