import java.util.*;

/*
Greatest Common Divisor Problem

Compute the greatest common divisor of two positive integers (a, b) implementing Euclid's algorithm.

Constrains:
	1 ≤ a, b ≤ 2·10^9;
	Time limit: 1.5s
	Memory limit: 512Mb

*/

public class GreatestCommonDivisor {
	
  private static int getGDC(int a, int b) {
	  
  	if(b == 0){
  		return a;
  		};
	  
	int ap = a%b;
	return getGDC(b, ap);
  }

}
