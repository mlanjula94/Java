package com.mapmay2;

public class Assignment5 {
	
	public static void main(String[] args) {
		/*Print all prime numbers between 1 to n, only if it is part of the Fibonacci series. 
		 * For example: n value is 10, 1 to 10 prime numbers are : 2, 3, 5, 7. 
		 * Fibonacci series : 0, 1, 1, 2, 3, 5, 8,... output is: 2,3,5
		 */
		int n = 10;
		int[] fibArray = fib_list(n);
		
		System.out.println(prime_list(n));
		
	}
	
	private static int[] fib_list(int n) {
		// TODO Auto-generated method stub
		int[] fibArray = new int[n+1];
		
		for (int i = 0; i <=n; i ++) {
			fibArray[i] = fib(i);
			//System.out.println(fibArray[i]);
		}
		
		return fibArray;
	}


	public static int fib(int n) {
		
		
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return ((fib(n-1) + fib(n -2)));
	}

	private static int[] prime_list(int n) {
		int[] primeArray = new int[n];
		
		for (int checker = 0; checker <n; checker ++) {
			if (checker > 1) {
				for (int i = 2; i <n; i ++) {
					if ( n%i == 0) {break;}
				}
			}	
			else if (checker < 2 ) { break;}
			//else {primeArray.append()}
		}
		return null;
	}

		
	
}
