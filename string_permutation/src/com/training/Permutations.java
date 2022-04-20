package com.training;

 public class Permutations {
		 		 
	 
	   
		 public static void main(String[] args)
		 	    {
		 	    
		 	        printPermutation("cat", " ");
		 	    }
		 	
	 
		 static void printPermutation(String cat, String empty)
		 	    {
		 	 
		 	        if (cat.length() == 0) {
		 	        	
		 	            System.out.println(empty + " ");          
		 	        }
		 	 
		 	        for (int i = 0; i < cat.length(); i++) {
		 	 
		 	            char letter = cat.charAt(i);
		 	 
		 	      String word = cat.substring(0, i) + cat.substring(i + 1);
		 	 
		 	            printPermutation(word, empty + letter);
		 	        }
		 	    }
		 }
		 	 
		


