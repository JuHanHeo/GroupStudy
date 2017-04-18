package study01;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = {{0, 0, 0, 9},{0, 1, 0, 0},{0, 0, 0, 0},{0, 0, 7, 0},{0, 0, 0, 0},{3, 0, 0, 0},{0, 0, 0, 0}};
		
		make(matrix);



	}


	public static void make(int[][] arr){

		int a=arr.length;
		int b=arr[0].length;
		int c=0;
		int nonZeroCount=0;

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]!=0){
					nonZeroCount++;
				}
			}
		}

		int[][] make=new int[nonZeroCount+1][3];
		int m1=1;

		make[0][0] = arr.length;
		make[0][1] = arr[0].length;
		make[0][2] = nonZeroCount;

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]!=0){
					make[m1][0] = i;
					make[m1][1] = j;
					make[m1][2] = arr[i][j];
					m1++;
				}
			}
		}

		for(int i=0;i<make.length;i++){
			for(int j=0;j<make[0].length;j++){
				System.out.print(make[i][j]+" ");
			}
			System.out.println();
		}
	}


}


