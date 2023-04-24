import java.util.*;
import java.math.*;

/*
Least Common Multiple Problem

Compute the least common multiple of two positive integers (a, b).

Constrains:
	1 ≤ a, b ≤ 10^7;
	Time limit: 1.5s
	Memory limit: 512Mb
*/

public class LeastCommonMultiple {
  private static long lcm(int a, int b) {
		if(b == 0 || a == 0){
  			return 0;
  		};
	
		BigInteger biga = new BigInteger(String.valueOf(a));
		BigInteger bigb = new BigInteger(String.valueOf(b));
		
		BigInteger max = biga.max(bigb);
		
		if(max.mod(biga).compareTo(new BigInteger("0")) == 0 && 
		   max.mod(bigb).compareTo(new BigInteger("0")) == 0){
			return Math.max(a, b);
		};
	
		long gcd = GCD(a, b);
		
		BigInteger prod = biga.multiply(bigb);
	
		return prod.divide(new BigInteger(String.valueOf(gcd))).longValue();
	
  };
	
  private static long GCD(long a, long b) {
  	if(b == 0){
  		return a;
  		};
	long ap = a%b;
	return GCD(b, ap);
  }
	
	
}