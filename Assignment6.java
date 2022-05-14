package com.mapmay2;

import java.util.Arrays;
import java.util.Iterator;

public class Assignment6 {

	public static void main(String[] args) {
		/*Assignment 6:   Multiplication of two matrices (Use arrays and for loop)*/
		
		int[][] matrix1 = {{1,2,3},{4,5,6}};
		int[][] matrix2 = {{7,8},{9,10},{11,12}};
		
	
		
		int[][] matrix3 = {{1,2,3,4},{5,6,7,8}};
		int[][] matrix4 = {{1},{2},{3},{4}};
		
		mat_multipicator(matrix1,matrix2);
		mat_multipicator(matrix1,matrix4);
		mat_multipicator(matrix3,matrix4);
	}

	private static void mat_multipicator(int[][] matrix1, int[][] matrix2) {
		if(matrix1[0].length == matrix2.length) {
			System.out.println("\n Solution");	
			int[][] result = new int[matrix1.length][matrix2[0].length];
			for(int a = 0; a < result.length; a++) {
				for(int b = 0; b < result[0].length; b++) {
					for(int i =0; i < matrix2.length; i++) {
						result[a][b] = result[a][b] + matrix1[a][i]*matrix2[i][b];
					}
				}
			}
			for (int []row: result) {
				System.out.println(Arrays.toString(row));
			}
		}
		else {System.out.println("\nCannot multiply this matrix");}	
	}
	
	

}
