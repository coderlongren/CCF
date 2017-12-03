import java.util.Scanner;

public class Í¼ÏñÐý×ª {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// get n and m
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] array= new int[n][m];
		int[][] array_retote = new int[m][n];
		
		// get content
		for (int i = 0;i < n;i++){
			for (int j = 0; j < m;j++){
				array[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < n;i++){
			int[] temp = new int[m];
			for (int j = 0;j < m;j++){
				temp[j] = array[i][j];
			}
			for (int k = 0;k < m;k++){
				array_retote[k][i] = temp[m - k - 1];
			}
		}
		for (int i = 0; i < m;i++){
			for (int j = 0; j < n;j++){
				System.out.print(array_retote[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
