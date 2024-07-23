package BTVN2;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		n = scanner.nextInt();
		int p[][]= new int[n][n];
		int check = n*n;
		int h = n;
		int c = n;
		int k=1;
		do{
			for(int i=n-c;i<c;i++){
				p[n-h][i]=k;
				k++;
			}
			for(int i=n-h+1;i<h;i++){
				p[i][c-1]=k;
				k++;
			}
			for(int i=c-2;i>=n-c;i--){
				p[h-1][i]=k;
				k++;
			}
			for(int i=h-2;i>=n-h+1;i--){
				p[i][n-c]=k;
				k++;
			}
			h--;
			c--;
		}while(k<check+1);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(p[i][j]+" ");
			}
			System.out.println();
		}
	}
}
