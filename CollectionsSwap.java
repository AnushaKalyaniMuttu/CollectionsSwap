package com.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSwap {
	/*
	 * Collections.swap(list,indexofSrctoSwap,indexOfSrc2ToSwap);
	 */

	public static void main(String[] args) {
		 List<String> stringList = new ArrayList<>();
	        stringList.add("Apple");
	        stringList.add("Banana");
	        stringList.add("Cherry");	        
	        System.out.println("Before swapping: " + stringList);	        
	        Collections.swap(stringList, 0, 2);	        
	        System.out.println("After swapping: " + stringList);
}
		
	}
