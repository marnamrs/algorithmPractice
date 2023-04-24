import java.util.*;
import java.math.*;

/*
Fibonacci Number Problem

Compute the n-th Fibonacci number modulo m.

Constrains:
	1 ≤ n ≤ 10^14;
	2 ≤ m ≤ 10^3;
	Time limit: 1.5s
	Memory limit: 512Mb
*/

public class FibonacciNthModN {
	
    private static long getFibonacciMod(long n, long m) {
        if (n <= 1){
            return n;
		}
		
		long p = 0;
		
		if(m>2){
			p = getPisano(m);
		} else {
			p = 3; //m=2
		}
		
		long r = n % p;
		
		if(r == 0){
			return 0;
		}
		
        BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("1");
		BigInteger temp = new BigInteger("0");
		
        for (long i = 2; i <= r; i++) {
            temp = a.add(b);
            a = b;
            b = temp.mod(new BigInteger(Long.toString(m)));
        }


		return b.longValue();
    }
	
	private static long getPisano(long p){
		long a = 0;
		long b = 1;
		long c = a + b;
		long res = 0;
		
		for(int i = 0; i < p*p; i++){
			c = (a + b) % p;
			a = b;
			b = c;
			
			if(a == 0 && b == 1){
				res = i + 1;
			}
		}
		
		return res;
		
	}
    
}
