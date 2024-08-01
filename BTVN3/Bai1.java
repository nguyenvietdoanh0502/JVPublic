package BTVN3;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s="Square";
		String t="Triangle";
		String c="Circle";
		String k;
		k = sc.next();
		if(k.equals(s)) {
			int n;
			System.out.print("Nhap canh: ");
			n=sc.nextInt();
			System.out.println("Dien tich hinh vuong: "+Math.pow(n,2));
		}
		else if(k.equals(t)) {
			int a;
			int b;
			int x;
			System.out.println("Nhap canh a: ");
			a=sc.nextInt();
			System.out.println("Nhap canh b: ");
			b=sc.nextInt();
			System.out.println("Nhap canh c: ");
			x=sc.nextInt();
			float p = (a+b+x)/2;
			double S = Math.sqrt(p*(p-a)*(p-b)*(p-x));
			System.out.print("Dien tich tam giac la: "+S);
		}
		else if(k.equals(c)) {
			System.out.print("Nhap ban kinh: ");
			int r;
			r = sc.nextInt();
			double S = Math.PI*Math.pow(r,2);
			System.out.print("Dien tich hinh tron la: "+S);
		}
		else {
			System.out.print("Bạn chắc bạn nhập đúng không");
		}
		
	}
}
