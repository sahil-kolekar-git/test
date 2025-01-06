package com.ty.FirstSpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@Controller
//@ResponseBody
@RestController
public class AppController {

	@GetMapping("/msg")
	public String getMessage() {
		return "Hi, Good Morning";
	}

	@PostMapping("/post")
	public String postData() {
		return "This data will be posted";
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	// Replace this with precise annotation
	public String getTest() {
		return "The data will be fetched";
	}

	@PatchMapping("/patch")
	public String patchData() {
		return "The single data will be updated in this case";
	}

	@PutMapping("put")
	public String putData() {
		return "Multiple data will be updated in this case";
	}

}
