package Laba8;
import java.util.*; 

public class GFG { 

	public static void main(String[] args) 
	{ 

		List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 7, 7, 19); 

		System.out.println("The distinct elements are :"); 
		list.stream().distinct().forEach(System.out::println); 
	} 
} 

