package com.ty.read;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("api")
public class ReadDataController {

	@GetMapping("/get")
	public String get() {
		return "This is get Mapping";
	}

	@GetMapping("/readquerystring")
	public String getRequest(@RequestParam(value = "uid") Integer id, @RequestParam(value = "uname") String name) {
		return "id : " + id + " " + "name :" + name;
	}

	@GetMapping("/readpath/{id}/{name}")
	public String getRequest1(@PathVariable Integer id, @PathVariable String name) {
		return "id : " + id + " " + "name :" + name;
	}

	@GetMapping("readpath/name/{uname}/email/{uemail}")
	public String getRequest2(@PathVariable(value = "uname") String name,
			@PathVariable(value = "uemail") String email) {
		return "name :" + name + " " + "email :" + email;

	}

	@PostMapping("/post")
	public String postRequest() {
		return "This is a Post request";
	}

	@PutMapping("/put")
	public String putRequest() {

		return "This is a Put request";
	}

	@PatchMapping("/patch")
	public String patchRequest() {
		return "This is a Patch request";
	}

	@DeleteMapping("/delete")
	public String deleteRequest() {
		return "This is a Delete request";
	}

	@GetMapping("/header")
	public String getHeader(@RequestHeader int id, @RequestHeader String Bearer, @RequestHeader String name) {
		System.out.println(Bearer);
		return "id : " + id + " " + "name : " + name;
	}

	@GetMapping("/cookie")
	public String getCookie(@CookieValue String email) {
		return "User email is : " + email;
	}

	@GetMapping("/jsondata")
	public Customer getJsonData(@RequestBody Customer customer) {
		System.out.println(customer);
		return customer;
	}

	@PostMapping("addcookie")
	public String addCookie(HttpServletResponse resp) {
		Cookie cookie = new Cookie("phone", "9388482883");
		resp.addCookie(cookie);
		return "Cookie added successfully";
	}

}
