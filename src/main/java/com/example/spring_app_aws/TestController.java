package com.example.spring_app_aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {

	@GetMapping("/newproduct")
	public String getData() {
	    return "New Product registered";
	}

	@GetMapping("/product-all")
	public String getMessage() {
		return "This is product list";
	}

}