package com.mapmay2;

public class Assignment3 {

	public static void main(String[] args) {
		/*Assignment 3:    Java SE code that reads a set of integers, 
		 * and then prints the sum of the even and odd integers separately
		 */
		int number_list[] = {2,3,4,5,6,7,8,9,0,12};
		int even = 0;
		int odd = 0;
		
		for (int i = 0; i < number_list.length; i++) {
			if (number_list[i] % 2 == 0) {
				even = even + number_list[i];
			}
			else {
				odd = odd + number_list[i];
			}
		}
		
		System.out.println("Total of even numbers from list is : " + even);
		System.out.println("Total of odd numbers from list is : " + odd);
	}


}
