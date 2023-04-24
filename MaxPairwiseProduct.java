import java.util.*;

/*
Maximum Pairwise Product Problem

Find the maximum product of two distinct numbers in a sequence of (n) non-negative integers.

Constrains:
	2 ≤ n ≤ 2·10^5; 
	0 ≤ a[1], ..., a[n] ≤ 2·10^5;
	Time limit: 1.5s
	Memory limit: 512Mb
*/

public class MaxPairwiseProduct {

    static long getMaxPairwiseProduct(int[] numbers) {
        int n = numbers.length;
		
		Arrays.sort(numbers);
		int i1 = n - 1;
        int i2 = i1 - 1;

        return Long.valueOf(numbers[i1]) * numbers[i2];
    }

}