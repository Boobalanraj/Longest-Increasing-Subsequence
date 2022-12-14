package com.longestIncreasing.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestSubsequence {


	public static  List<Integer> longestIncreasingSubsequence(int nums[]) {
		if(nums == null || nums.length == 0) {
			return new ArrayList<Integer>();
		}
		int length = nums.length;
		int[] Table = new int[length];
		int[] sequence = new int[length];
		Arrays.fill(Table, 1);
		Arrays.fill(sequence, Integer.MIN_VALUE);
		int maxLengthIndex = 0;
		for(int i = 1; i < length; i++) {
			for(int j = 0; j < i; j++) {
				if(nums[j] < nums[i] && Table[j] + 1 > Table[i] ) {
					Table[i] = Table[j] + 1;
					sequence[i] = j;
				}
			}
			if(Table[i] > Table[maxLengthIndex]) {
				maxLengthIndex = i;
			}
		}
	
		List<Integer> result = buildSequence(nums, sequence, maxLengthIndex);
		return result;	
		
	}
	
	public static List<Integer> buildSequence(int[] nums, int[] sequence, int maxLengthIndex) {
		List<Integer> list = new ArrayList<Integer>();
		while(maxLengthIndex != Integer.MIN_VALUE) {
			list.add(0, nums[maxLengthIndex]);
			maxLengthIndex = sequence[maxLengthIndex];
		}
		return list;
	}


}
