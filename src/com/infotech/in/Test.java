package com.infotech.in;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		ArrayList<Product> product = new ArrayList<>();

		System.out.println("*****************");
		System.out.println("Entering the Product Data");

		Product product2 = new Product(101, "Dell", 896524.25, 8.8);
		Product product3 = new Product(102, "Apple", 47553.25, 9.1);
		Product product4 = new Product(105, "Lenova", 9653.758, 5.9);
		Product product5 = new Product(103, "Asus", 9896547.25, 6.8);
		Product product6 = new Product(104, "HP", 14525.64, 7.5);

		product.add(product2);
		product.add(product3);
		product.add(product4);
		product.add(product5);
		product.add(product6);

		System.out.println("Plese collect the Product data");

		List<Product> collect = product.stream().collect(Collectors.toList());
		collect.forEach(System.out::println);

		System.out.println("*****************");
		System.out.println("&&&&&&&&&&&&&&&&&");
		System.out.println("Entering the customer data");

		Set<Customer> customer = new LinkedHashSet<>();
		// customer.add(1, new Customer(900, "VINOD", "vinodh@gmail.com", "Gurugala",new
		Customer customer2 = new Customer(900, "Vinodh", "vinodh@gmail.com", "Gurujala", product2);
		Customer customer4 = new Customer(901, "chandu", "chandu@gmail.com", "sathuppaly", product3);
		Customer customer5 = new Customer(902, "bargav", "bargav@gmail.com", "hyd", product4);
		Customer customer6 = new Customer(903, "sudder", "sudder@gmail.com", "guntur", product5);
		Customer customer7 = new Customer(904, "anil", "anil@gmail.com", "nirmal", product6);

		customer.add(customer2);
		customer.add(customer4);
		customer.add(customer5);
		customer.add(customer6);
		customer.add(customer7);

		System.out.println("Pleease collect the customer data");

		List<Customer> collect2 = customer.stream().collect(Collectors.toList());
		for (Customer customer3 : collect2) {
			System.out.println(customer3);
		}

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("please enter the consumer data");

		ArrayList<Consumer> consumer = new ArrayList<>();

		HashMap<Integer, Customer> custMap = new HashMap<>();

		LinkedHashMap<Integer, Customer> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put(customer2.getCid(), customer2);

		custMap.put(customer2.getCid(), customer2);
		// consumer.add(new Consumer(600, "NARESHIt", "Amerpeta", 12345, new
		// Customer(cid, cname, cemail, cAddress, product2)))
		Consumer consumer2 = new Consumer();
		consumer2.setConId(12345);
		consumer2.setConName("jai simha");
		consumer2.setConAddress("sec");
		consumer2.setConPhoneNumber(568749L);
		consumer2.setCustomer(linkedHashMap);

		System.out.println(consumer2.toString());

	}
}
