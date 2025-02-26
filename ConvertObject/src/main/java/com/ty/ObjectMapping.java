package com.ty;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapping {
	public static void main(String[] args) throws Exception {
		// ObjectMapping.convertJavaToJson();
		ObjectMapping.convertJsonToJava();
	}

	public static void convertJavaToJson() throws Exception {
		Customer customer = new Customer();
		customer.setId(101);
		customer.setName("Allen");
		customer.setEmail("allen@gmail.com");
		customer.setPhone(9394232191l);

		File file = new File("data.json");
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(file, customer);

		System.out.println("Done");

	}

	public static void convertJsonToJava() throws StreamReadException, DatabindException, IOException {
		File file = new File("data.json");
		ObjectMapper mapper = new ObjectMapper();

		Customer customer = mapper.readValue(file, Customer.class);
		
		System.out.println(customer);
	}
}
