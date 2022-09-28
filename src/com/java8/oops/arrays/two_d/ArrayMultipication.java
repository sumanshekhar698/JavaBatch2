package com.java8.oops.arrays.two_d;

//Design patterns
public class ArrayMultipication {
	static private int x = 7;

	static private void printMatrix2D(int M[][]) {

		for (int i = 0; i < M.length; i++) {// number of 1D array in a 2d array
			for (int j = 0; j < M[i].length; j++)
				System.out.print(M[i][j] + " ");

			System.out.println();
		}
	}

	// Method to multiply two matrix
	// two matrices A[][] and B[][] should be symmetric
	 private static void  multiplyMatrix(int A[][], int B[][]) {

		int row1 = A.length;
		int col1 = A[0].length;

		int row2 = B.length;
		int col2 = B[0].length;

		// Print the matrices A and B
		System.out.println("\nMatrix A:");
		printMatrix2D(A);
		System.out.println("\nMatrix B:");
		printMatrix2D(B);

		// Checking for if multiplication is Possible
		if (row2 != col1) {
			System.out.println("\nMultiplication Not Possible EXITING");
			return;
//			System.exit(3);
		}

		// Initiating Matrix to store the result
		// The product matrix will be of size row1 x col2
		int C[][] = new int[row1][col2];

		int i, j, k;
		// Multiply the two matrices
		first:for (i = 0; i < C.length; i++) {// row1 = A.length = C.length
		second:	for (j = 0; j < C[0].length; j++) {// col2 = B[0].length = C[0].length

				for (k = 0; k < B.length; k++)//
					C[i][j] = C[i][j] + (A[i][k] * B[k][j]);

			}
		}

		// Print the Resultant Matrix
		System.out.println("\nResultant Matrix:");
		printMatrix2D(C);
	}

	public static void main(String[] args) {
		System.out.println("START");
		int row1 = 4, col1 = 3, row2 = 3, col2 = 4;

		int A[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 } };// (m*n)=4 * 3
		int B[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 } };// (n*k)=3*4
//		int B[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };// (n*k)=3*4
		multiplyMatrix(A, B);
		
		ArrayMultipication arrayMultipication = new ArrayMultipication();
//		arrayMultipication.multiplyMatrix(A, B);
//		arrayMultipication.x;
		System.out.println(x);
		System.out.println("EXIT");
	}
}