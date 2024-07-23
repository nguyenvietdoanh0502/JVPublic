package BTVN2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		n = scanner.nextInt();
		int p[]= new int[n];
		for(int i=0;i<n;i++) {
			p[i]= scanner.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				if(i==n-1) {
					p[i]+=Math.abs(p[i-1]);
				}
				else {
				p[i]+=Math.abs(p[i-1]-p[i+1]);
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(p[i]+" ");
		}
	}
}
