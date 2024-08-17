package BTVN5_2;

import java.util.Scanner;

public class May {
	private String maMay;
	private String tenMay;
	private String tinhTrang;
	public May() {
		
	}
	public May(String maMay, String tenMay, String tinhTrang) {
		this.maMay = maMay;
		this.tenMay = tenMay;
		this.tinhTrang = tinhTrang;
	}
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma may: ");
		maMay = sc.nextLine();
		System.out.print("Nhap ten may: ");
		tenMay = sc.nextLine();
		System.out.print("Nhap tinh trang: ");
		tinhTrang = sc.nextLine();
	}
	public void Xuat() {
		System.out.println(String.format("%-15s%-15s%-15s", maMay,tenMay,tinhTrang));
	}
}
