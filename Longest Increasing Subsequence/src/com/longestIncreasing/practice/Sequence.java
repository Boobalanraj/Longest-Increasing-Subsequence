package com.longestIncreasing.practice;

import java.util.ArrayList;
import java.util.Random;

public class Sequence {

	public ArrayList<Integer> list;
	
	int length;
	
	public Sequence(int value) {
		length= value;
	}
	public void inputSequence() {
		Random number = new Random();
		list=new ArrayList<Integer>();
		for(int i=0;i<length;i++) {
			list.add(number.nextInt(100));
		}
	}
	
	public ArrayList<Integer> arranged(){
		return list;
	}
	
	public void sequencefinal() {
		System.out.println(list);
	}
	
}
