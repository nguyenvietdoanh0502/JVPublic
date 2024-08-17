package BTVN5;

import java.util.Scanner;

public class Student {
	private String names;
	private String classs;
	private double score;
	private Faculty y;
	public Student() {
		y = new Faculty();
	}
	public Student(String names, String classs, double score, Faculty y) {
		this.names = names;
		this.classs = classs;
		this.score = score;
		this.y = y;
	}
	public void Nhaps() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten hoc sinh: ");
		names = sc.nextLine();
		System.out.println("Nhap lop: ");
		classs = sc.nextLine();
		System.out.println("Nhap diem: ");
		score = sc.nextDouble();sc.nextLine();
		y.Nhap();
;	}
	public void Xuats() {
		System.out.println("Thong tin hoc sinh: ");
		System.out.println("Ten hoc sinh: "+names);
		System.out.println("Ten lop: "+classs);
		System.out.println("Diem: "+score);
		y.Xuat();
	}
}
