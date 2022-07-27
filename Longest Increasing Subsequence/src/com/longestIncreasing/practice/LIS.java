package com.longestIncreasing.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class LIS {
	
	private Sequence sub;
	
	public Sequence getSub() {
		return sub;
	}
	
	public void arraylength() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length  of array: ");
		int value = input.nextInt();

		sub=new Sequence(value);
		sub.inputSequence();
	}
	
	public void lis() {
		System.out.print("Sequence: ");
		
		sub.sequencefinal();
		
		int begin =0 , end= 0, longest = 0,temp_Begin=0,temp_Longest=0;	
		ArrayList<Integer> subSequence = sub.arranged();
		
		for(int i=1;i<subSequence.size();i++) {
			
				if(subSequence.get(i)>subSequence.get(i-1)) {
				
				if(temp_Longest==0) {
					temp_Begin=i;
				}
				temp_Longest++;
			}
				else if(temp_Longest >longest) {
					begin = temp_Begin;
					longest=temp_Longest;
					temp_Longest = 0;
					end=i;
				}
				else {
					temp_Longest=0;
				}
		}
		System.out.print("Longest Increasing Subsequence: ");
			for(int j = begin-1;j<end;j++) {
				System.out.println(subSequence.get(j)+" ");
			}
		System.out.println();
	}
}

