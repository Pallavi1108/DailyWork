package com.training.twenteight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList();
		addNames(names);
		// System.out.println(names);
		// 1. Print Names with length more than 6
		List<String> namesWithSize6 = names.stream().filter(s -> s.length() > 6).collect(Collectors.toList());
		namesWithSize6.forEach(System.out::println);

		// 2.Names in UpperCase
		List<String> namesInUpper = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		namesInUpper.forEach(System.out::println);
		
		// 3. SORT THE LIST
		
		List<String> defaultSorted = names.stream().sorted((s1,s2) -> s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("*****Default Sorting******");
		defaultSorted.forEach(System.out::println);
		
		List<String> customSorting = names.stream().sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("*****Descending Order Sorting******");
		customSorting.forEach(System.out::println);
		
		
		
		long count = names.stream().count();
		System.out.println("List Count is : " + count);
		Stream<Integer> data = Stream.of(1,11,111,1111,11111);
		System.out.println("Data Count : "+data.count());
		
		Stream<String> languages= Stream.of("C","C++","Java","Python","Angular");
	//	List<String> langLength = languages.filter(s ->s.length() > 4).collect(Collectors.toList());
	//	langLength.forEach(System.out::println);
		
		List<String> langadd = languages.map(s -> s.concat(" programming")).collect(Collectors.toList()); 
		langadd.forEach(System.out::println);
	}

	private static void addNames(ArrayList<String> names) {
		names.add("Pallavi");
		names.add("Abhinav");
		names.add("Mrinal");
		names.add("Satyam");
		names.add("Nikhil");

	}

}
