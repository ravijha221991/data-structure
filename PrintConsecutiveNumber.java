package com.learn.algo.recursion;

public class PrintConsecutiveNumber {
	
	public static void main(String[] args) {
		try {
		print1ToN(1, 90000);
		}catch(StackOverflowError e) {
			System.out.println("Stack Size:"+e.getStackTrace().length);
			System.out.println(e.getCause());
			System.out.println(e.toString());
		}
		System.out.println("-----------");
		printNTo1(5);
		
	}
	
	public static void print1ToN(int i, int N) {
		if(i>N) return;
		System.out.println(i);
		print1ToN(i+1, N);
	}
	
	public static void printNTo1(int N) {
		if(N<=0) return;
		System.out.println(N);
		printNTo1(N-1);
	}

}
