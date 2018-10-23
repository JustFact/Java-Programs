import java.util.*;
public class MatrixZero {
		static void MakeZero(int matrix[][], ArrayList<Integer> i, ArrayList<Integer> j) {
			for(int k = 0; k<i.size();k++) {
				for(int l = 0; l<matrix.length;l++) {
					matrix[i.get(k)][l] = 0;
					matrix[l][j.get(k)] = 0;
				}
			}
		}
		
		static void MatrixZeros(int matrix[][]) {
			ArrayList<Integer> pi = new ArrayList<Integer>(matrix.length);
			ArrayList<Integer> pj = new ArrayList<Integer>(matrix.length);
			for(int i = 0; i<matrix.length;i++) {
				for(int j = 0;j<matrix.length;j++) {
					if(matrix[i][j]==0) {
						pi.add(i);
						pj.add(j);
					}
				}
			}
			MakeZero(matrix,pi,pj);
		}
	public static void main(String[] args) {
			int a[][] = {{1,2,3,4,5},
						{6,9,8,0,1},
						{1,2,2,4,5},
						{0,6,7,7,9},
						{5,4,3,2,1}
				};
			MatrixZeros(a);
			for(int i = 0; i<a.length; i++) {
				for(int j = 0; j<a.length; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
	}

}