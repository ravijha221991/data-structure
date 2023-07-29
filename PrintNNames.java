package com.learn.algo.recursion;

public class PrintNNames {
	
	public static void main(String[] args) {
		
		printNames(5);
		System.out.println("--------------");
		printNamesinReverse(1, 5);
		
	}
	
	public static void printNames(int N) {
		if(N<=0) return;
		System.out.println((char)(64+N));
		printNames(N-1);
	}
	
	public static void printNamesinReverse(int i, int N) {
		if(i>N) return;
		System.out.println((char)(64+i));
		printNamesinReverse(i+1, N);
	}

}
