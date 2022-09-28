package com.java8.oops.arrays.two_d;

public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] array3D = new int[4][][];// blocks

		for (int i = 0; i < array3D.length; i++) {
			array3D[i] = new int[3][2];
		}

		for (int i = 0; i < array3D.length; i++) {
			for (int j = 0; j < array3D[i].length; j++) {
				for (int k = 0; k < array3D[i][j].length; k++) {
					System.out.print(array3D[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("****************************************************");
		}

	}

}
