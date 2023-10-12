package com.java.example;

import java.util.HashMap;

public class ExamTest2 {

	public static void main(String[] args) {
		//Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
		
		 String A_Z="XLII";
		 HashMap<Character,Integer> map=new HashMap<>();
		 
		 map.put('I',1);
		 map.put('X',10);
		 map.put('V',5);
		 map.put('L',50);
		 map.put('C',100);
		 map.put('D',500);
		 map.put('M',1000);
		 int result=0;
		 int next=0;
		 for(int i=0;i<A_Z.length();i++){
		   next=map.get(A_Z.charAt(i));
		   if(result<next){
		       next-=result;
		       result=next;
		   }
		   else{
		       result+=next;
		   }
		   
		 }
		 System.out.println(result);

	}

}
