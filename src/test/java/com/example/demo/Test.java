package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hello");
		
		String a = "brag";
		String b = "grab";

		if(a.length() == (b.length())) {
		List<String> aList = new ArrayList<String>(Arrays.asList(a.split("")));

		for(int i=0; i<aList.size() ; i++) {
		if(b.contains(aList.get(i))) {
		aList.remove(i);
		i=0;
		}
		}
		if(aList.isEmpty()){
		System.out.println("is an anagram");;
		}
		}
		else {
			System.out.println("not an anagram");
		}
	}

}
