import java.util.*;

/*
Last Digit of the Sum of Fibonacci Numbers

Compute the last digit of F[0]+F[1]+...+F[n].

Constrains:
	0 ≤ n ≤ 10^14;
	Time limit: 1.5s
	Memory limit: 512Mb
*/

public class FibonacciSumLastDigit {
	
    private static long getFibonacciSum(long n) {
        if (n <= 1){
            return n;
		}
		
		long p = getPisano(10);
		long r = n % p;
		
		if(r == 0){
			return 0;
		}

        long a = 0;
        long b  = 1;
        long sum = 1;
		long tmp = 0;
			
		for (long i = 2; i <= r; ++i) {
			
            tmp = a + b;
            a = b;			
            b = tmp % 10;
			
            sum += b;
			sum = sum % 10;
			
        }

        return sum;
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
