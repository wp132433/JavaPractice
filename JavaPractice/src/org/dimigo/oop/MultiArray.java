package org.dimigo.oop;

import java.util.Arrays;

public class MultiArray {
	public static void main(String[] args) {
		int[] abc = new int[4];
	
		Arrays.fill(abc, 2);
		
		for(int i=0; i<abc.length; i++) {
			System.out.println(abc[i]);
		}
		
		int[][] cba = new int[4][5];
		
		for(int[] row:cba)
			Arrays.fill(row, 5);
		
		
		for(int i=0; i<cba.length; i++) {
			for(int j=0; j<cba[i].length; j++) {
				System.out.println(cba[i][j]);
			}
		}
	}

}
