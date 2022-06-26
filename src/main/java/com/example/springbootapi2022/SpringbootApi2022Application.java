package com.example.springbootapi2022;

import com.example.springbootapi2022.dependency.Address;
import com.example.springbootapi2022.dependency.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApi2022Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootApi2022Application.class, args);

		Customer customer = context.getBean(Customer.class);
		System.out.println("customer name: " + customer.getName());

//		Address address = context.getBean(Address.class);
		System.out.println("address no: " + customer.getAddress().getAddressNo());
		System.out.println("address name: " + customer.getAddress().getAddressName());
	}

}
