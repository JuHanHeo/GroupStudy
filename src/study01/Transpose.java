package study01;

public class Transpose {

	public static void main(String[] args) {
		
		int[][] matrix = {{0, 0, 0, 9},{0, 1, 0, 0},{0, 0, 0, 0},{0, 0, 7, 0},{0, 0, 0, 0},{3, 0, 0, 0},{0, 0, 0, 0}};
		
		int[][] trans = transe(matrix);
		
		show(trans);
		
		
	}
	
	public static int[][] transe(int[][] arr){
		
		int trans[][] = new int[arr[0].length][arr.length];
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				trans[j][i] = arr[i][j];
			}
		}
		
		return trans;
		
	}
	
	public static void show(int[][] trans){
		
		for(int i=0;i<trans.length;i++){
			for(int j=0;j<trans[0].length;j++){
				System.out.print(trans[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
}


