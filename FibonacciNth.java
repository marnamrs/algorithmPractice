import java.util.Scanner;

/*
Fibonacci Number Problem

Compute the n-th Fibonacci number.

Constrains:
	0 ≤ n ≤ 45;
	Time limit: 1.5s
	Memory limit: 512Mb
*/


public class FibonacciNth {
	
  private static long getFibonacci(int n) {
	  
	if (n == 0){
		return n;
	} 
	  
	long a = 0;
	long b = 1;
	long temp = 0;
		
    for (long i = 2; i <= n; i++) {
    	temp = a+b;
		a = b;
		b = temp;
	}
  	
	return b;

  }

}
