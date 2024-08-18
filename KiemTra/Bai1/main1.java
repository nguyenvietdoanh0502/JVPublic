package Bai1;

import java.util.Scanner;

public class main1 {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhap n: ");
			n = sc.nextInt();sc.nextLine();
			if(n<=0) {
				System.out.println("Sai so lieu.Vui long nhap lai!");
			}
		}while(n<=0);
		String[] s = new String[n];
		for(int i=0;i<n;i++) {
			s[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++) {
			int check =0;
			for(int j=0;j<s[i].length();j++) {
				if(s[i].charAt(j)==' ') {
					check++;
				}
			}
			System.out.println(check);
		}
	}
}
