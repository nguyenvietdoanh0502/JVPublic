package BTVN5_2;

import java.util.Scanner;

public class phongMay {
	private String maPhong;
	private String tenPhong;
	private double dienTich;
	private quanLy x;
	private int n;
	private May y[];
	public phongMay() {
		x = new quanLy();
		y = new May[100];
	}
	public phongMay(String maPhong, String tenPhong, double dienTich, quanLy x,int n, May y[]) {
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.dienTich = dienTich;
		this.x = x;
		this.n = n;
		this.y = y;
	}
	public void Nhappp() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma phong may: ");
		maPhong = sc.nextLine();
		System.out.print("Nhap ten phong may: ");
		tenPhong = sc.nextLine();
		System.out.print("Nhap dien tich: ");
		dienTich = sc.nextDouble();sc.nextLine();
		x.Nhapq();
		System.out.print("Nhap so may: ");
		n = sc.nextInt();sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Nhap may "+(i+1)+":");
			y[i] = new May();
			y[i].Nhap();
		}
	}
	public void Xuatq() {
		System.out.print(String.format("%-15s%-15s%-15.3f", maPhong,tenPhong,dienTich));
		x.Xuatq();
		System.out.println("THONG TIN CAC MAY: ");
		for(int i=0;i<n;i++) {
			y[i].Xuat();
		}
	}
}
