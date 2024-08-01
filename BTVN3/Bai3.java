package BTVN3;

import java.util.Scanner;

public class Bai3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*10);
		int c = (int)(Math.random()*20);
		System.out.println(a+"+"+b+"="+c);
		System.out.println("Phép tính trên đúng hay sai(Y/N): ");
		String res;
		
		res = sc.next();
		if(res.equals("Y")&&(a+b)==c) {
			System.out.println("Chính xác!");
		}
		else if(res.equals("Y")&&(a+b)!=c) {
			System.out.println("Sai");
		}
		else if(res.equals("N")&&(a+b)!=c) {
			System.out.println("Chính xác!");
		}
		else {
			System.out.println("Sai");
		}
	}
}
