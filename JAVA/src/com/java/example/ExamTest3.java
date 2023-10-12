package com.java.example;

import java.util.HashSet;
import java.util.Set;

public class ExamTest3 {
	
	public static void main(String[] args) {
         
		  String A_Z = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	        String sentence = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	 
	        Set<Character> charSet = new HashSet<>(); 
	 
	        // Populate the Set with characters from the sentence 
	        for (char ch : sentence.toCharArray()) { 
	            charSet.add(ch); 
	        } 
	 
	        boolean pangram = true; 
	 
	        // Check if all characters from A_Z are present in the Set 
	        for (char ch : A_Z.toCharArray()) { 
	            if (!charSet.contains(ch)) { 
	                pangram = false; 
	                break; 
	            } 
	        } 
	 
	        if (pangram) { 
	            System.out.println("Sentence is Pangram"); 
	        } else { 
	            System.out.println("Sentence is not Pangram"); 
	        } 
	}
	
}
