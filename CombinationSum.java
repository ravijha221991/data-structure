package com.learn.algo.recursion;

import java.util.ArrayList;

public class CombinationSum {
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		int[] array = new int[] {4,5,3,7,8,2};
		int target = 7;
		int N = 6;
		ArrayList<Integer> list = new ArrayList<>();
		sum(array,0, N, target, result,list);
		System.out.println(result);
		
	}
	
	public static void sum(int[] array, int i, int N, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list) {
		if(i>=N) {
			if(target==0) {
				ArrayList<Integer> l = new ArrayList<Integer>();
				l.addAll(list);
				result.add(l);
			}
			return;
		}
		
		list.add(array[i]);
		sum(array, i+1, N, target-array[i], result, list);
		list.remove(list.size()-1);
		sum(array, i+1, N, target, result, list);
		
	}

}
