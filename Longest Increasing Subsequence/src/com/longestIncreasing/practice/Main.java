package com.longestIncreasing.practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		

		System.out.print("Enter number of Elements: ");

		int length= input.nextInt();
		
		int array[]= new int[length+1];
		
		
		for(int i=0; i<length; i++)  
		{  
		array[i]=input.nextInt();  
		}
		
		System.out.print("The Longest Increasing Subsequence: "+LongestSubsequence.longestIncreasingSubsequence(array));
		
		input.close();
	}
}
