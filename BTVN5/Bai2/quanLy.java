package BTVN5_2;

import java.util.Scanner;

public class quanLy {
	private String maQL;
	private String hoTen;
	public quanLy() {
		
	}
	public quanLy(String maQL, String hoTen) {
		this.maQL = maQL;
		this.hoTen = hoTen;
	}
	public void Nhapq() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma quan ly: ");
		maQL = sc.nextLine();
		System.out.print("Nhap ho ten quan ly: ");
		hoTen = sc.nextLine();
	}
	public void Xuatq() {
		System.out.println(String.format("%-15s%-15s", maQL,hoTen));
	}
}
