package com.learn.algo.recursion;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		int N = 5;
		int[] array = new int[] {5,4,3,2,1};
		System.out.println("Before Reverse:"+Arrays.toString(array));
		reverse(array,0,N-1);
		System.out.println("Array Reverse:"+Arrays.toString(array));
	}
	
	public static void reverse(int[] array, int l, int r) {
		if(l>=r) return;
		int temp = array[l];
		array[l] = array[r];
		array[r] = temp;
		reverse(array, l+1, r-1);
	}

}
