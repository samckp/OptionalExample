package com.optional.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Optional;

public class Application {

	public static void main(String[] args) {

		Customer cust = new Customer(1, "ram",null, Arrays.asList("8338484","83839480"));

		Customer cust1 = new Customer(2, "rama","Delhi", Arrays.asList("8338484","83839480"));

		//empty
		//of
		//ofNullable

		Optional<Object> empty = Optional.empty();
		System.out.println(empty);

		//of method
		//Optional<String> result = Optional.of(cust.getAddr());
//		System.out.println(result);


		//if null value
		Optional<String> res = Optional.ofNullable(cust.getAddr());
		System.out.println(res);

		//if not null value
		Optional<String> res1 = Optional.ofNullable(cust1.getAddr());
		System.out.println(res1);

		// safe code
		if (res1.isPresent()) {
			System.out.println(res1);
		}

		// if value not present then put default value
		System.out.println(res.orElse("default value"));

		//if not present then throw exception
//		System.out.println(res.orElseThrow(()->new IllegalArgumentException("Address is null")));

//		System.out.println(res.map(String::toUpperCase).orElseGet(()->"default address"));
		System.out.println(res1.map(String::toUpperCase).orElseGet(()->"default address"));
	}

}
