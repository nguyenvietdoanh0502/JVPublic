package BTVN5;

import java.util.Scanner;

public class Faculty {
	public String namef;
	public String datef;
	public School x;
	public Faculty() {
		x = new School();
	}
	public Faculty(String namef, String datef, School x) {
		this.namef = namef;
		this.datef = datef;
		this.x = x;
	}
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten Khoa: ");
		namef = sc.nextLine();
		System.out.println("Nhap ngay Khoa: ");
		datef = sc.nextLine();
		System.out.println("Nhap ten Truong: ");
		String name;
		name = sc.nextLine();
		x.setTen(name);
		System.out.println("Nhap ngay Truong: ");
		String date = sc.nextLine();
		x.setDate(date);
	}
	public void Xuat() {
		System.out.println("Ten Khoa: "+namef);
		System.out.println("Ngay Khoa: "+datef);
		System.out.println("Ten Truong: "+x.getTen());
		System.out.println("Ngay Truong: "+x.getDate());
		
	}
}
