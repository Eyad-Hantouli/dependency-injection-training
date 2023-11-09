package com.training.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext apc = SpringApplication.run(DependencyInjectionApplication.class, args);
		// Create list
		List<Integer> myList = new ArrayList<>();
		// Fill list with some elements
		myList.add(1);
		myList.add(2);
		myList.add(5);
		myList.add(3);
		// Create an object AlgorithmImpl
		AlgorithmImpl algorithmImpl = apc.getBean(AlgorithmImpl.class);
		// Sort list
		algorithmImpl.sort(myList);

		System.out.println(myList);
	}

}
