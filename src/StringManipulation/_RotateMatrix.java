package StringManipulation;

public class _RotateMatrix {
		static void rotate(int a[][]) {
			
			
			
			for(int i = 0;i<a.length;i++) {
				for(int j = 0; j<a.length;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
	public static void main(String[] args) {
			int a[][] = {{1,2,3,4,5},
						{6,7,8,9,0},
						{1,2,3,4,5},
						{0,6,7,8,9},
						{5,4,3,2,1}
				};
			rotate(a);
	}

}
