import java.util.*;
import java.math.*;

/*
Last Digit of Fibonacci Number Problem

Compute the last digit of the n-th Fibonacci number.

Constrains:
	0 ≤ n ≤ 10^6;
	Time limit: 1.5s
	Memory limit: 512Mb
*/

public class FibonacciLastDigit {
	
    private static int getFibonacciLastDigit(int n) {
		
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("1");
		BigInteger temp = new BigInteger("0");
		BigInteger m = new BigInteger("10");
	
		for(int i = 2; i <= n; i++){
			temp = a.add(b);
			a = b;
			b = temp.mod(m);
		}
  	
		return b.intValue();

    }
    
}

