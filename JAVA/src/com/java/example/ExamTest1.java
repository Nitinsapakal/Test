package com.java.example;

public class ExamTest1 {

	public static void main(String[] args) {
		// Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
		 int arr[]={1,2,3,4,5,6,7};
		    
	      for(int i=0;i<arr.length;i++){
	          for(int j=0; j<arr.length-2;j++){
	                  int temp=arr[j+2];
	                  arr[j+2]=arr[j];
	                  arr[j]=temp;
	              }
	          }
	          for(int i : arr){
	            System.out.print(" "+i);
	        }

	}

}
