package dataStructures;

import java.util.*;


public class MyArrayList {
	
	static int sno ;
	static String name;
	static String gender;
	static int engScore;
	static int mathScore;

	public static void main(String[] args) {
		ArrayList<String> myArray = new ArrayList<String>( 
	            Arrays.asList()
			
	            ); 
	  
	       
	        System.out.println("ArrayList : " + myArray); 

	}
	
	public static void getData() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter student number: ");
		sno = input.nextInt();
		
		System.out.println("Enter student name: ");
		name = input.nextLine();
		
		System.out.println("Enter student gender: ");
		gender = input.next();
		
		System.out.println("Enter student English score: ");
		engScore = input.nextInt();
		
		
		System.out.println("Enter student Advanced Mathematics score: ");
		mathScore = input.nextInt();
		
	}

}
