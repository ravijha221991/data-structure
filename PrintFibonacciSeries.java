package com.learn.algo.recursion;

public class PrintFibonacciSeries {
	
	public static void main(String[] args) {
		
		System.out.println(fib(10));
		
	}
	
	public static int fib(int N){
		if(N<=1) return N;
		return fib(N-1) + fib(N-2);
	}
	
	

}
