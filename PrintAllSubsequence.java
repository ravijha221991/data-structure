package com.learn.algo.recursion;

import java.util.Arrays;

public class PrintAllSubsequence {
	
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4,5,6,7};
		int N = 7;
		int[] result = new int[N];
		printSubsequence(array, 0, N, result);
		System.out.println("-----------------");
		printTargetSumSequence(array,0,N,result,10);
	}
	
	public static void printSubsequence(int[] array, int i, int N, int[] result) {
		if(i>=N) {
			System.out.println(Arrays.toString(result));
			return;
		}
		result[i] = array[i];
		printSubsequence(array, i+1, N, result);
		result[i]= 0;
		printSubsequence(array, i+1, N, result);
	}
	
	public static void printTargetSumSequence(int[] array, int i, int N, int[] result, int SUM) {
		
		if(i>=N) {
			if(SUM==0) {
				System.out.println(Arrays.toString(result));
			}
			return;
		}
		result[i] = array[i];
		printTargetSumSequence(array, i+1, N, result, SUM-result[i]);
		result[i]=0;
		printTargetSumSequence(array, i+1, N, result, SUM);
	}

}
