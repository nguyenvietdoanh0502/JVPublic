package BTVN4;

import java.util.Scanner;

 class Student{
	private String name;
	private int date;
	private String Address;
	private double diem1;
	private double diem2;
	private double diem3;
	private int sotiet;
	private int tuoi;
	private double GPA;
	public double  getGPA(){
		GPA = diem1*0.2+diem2*0.3+diem3*0.5;
		return GPA;
	}
	public int gettuoi() {
		tuoi = 2024 - date;
		return tuoi;
	}
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tên: ");
		name = sc.nextLine();
		System.out.print("Nhập năm sinh: ");
		date = sc.nextInt();sc.nextLine();
		System.out.print("Nhập địa chỉ: ");
		Address = sc.nextLine();
		System.out.print("Nhập điểm TX1: ");
		diem1 = sc.nextDouble();sc.nextLine();
		System.out.print("Nhập điểm TX2: ");
		diem2 = sc.nextDouble();sc.nextLine();
		System.out.print("Nhập điểm KTHP: ");
		diem3 = sc.nextDouble();sc.nextLine();
		System.out.print("Nhập số tiết nghỉ: ");
		sotiet = sc.nextInt();sc.nextLine();
	}
	public void Xuat() {
		GPA = diem1*0.2+diem2*0.3+diem3*0.5;
		tuoi = 2024 - date;
		System.out.println(name+"   "+tuoi+"   "+Address+"   "+diem1+"   "+diem2+"   "+diem3+"   "+GPA+"   "+sotiet);
	}
	public int getTiet() {
		return sotiet;
	}
}

public class Bai1 {
	public static void main(String [] args) {
		int n = 5;
		Student[] hocSinh = new Student[n];
		for(int i=0;i<n;i++) {
			hocSinh[i] = new Student();
			System.out.println("Nhập thông tin học sinh: "+(i+1));
			hocSinh[i].Nhap();
		}
		for(int i=0;i<n;i++) {
			hocSinh[i].Xuat();
		}
		System.out.println("----------MENU----------");
		System.out.println("1.Thêm sinh viên mới.");
		System.out.println("2.Sửa thông tin sinh viên.");
		System.out.println("3.Sắp xếp theo tuổi.");
		System.out.println("4.Sắp xếp theo GPA.");
		System.out.println("5.Sắp xếp theo Số tiết nghỉ.");
		System.out.println("6.Xóa sinh viên.");
		System.out.print("Nhập lựa chọn: ");
		int Choose;
		Scanner sc = new Scanner(System.in);
		Choose = sc.nextInt();
		if(Choose==1) {
			n++;
			Student[] hocSinh1 = new Student[n];
			for(int i=0;i<n-1;i++) {
				hocSinh1[i]=new Student();
				hocSinh1[i]=hocSinh[i];
			}
			hocSinh1[n-1]=new Student();
			System.out.println("Nhập thông tin học sinh muốn thêm: ");
			hocSinh1[n-1].Nhap();
			for(int i=0;i<n;i++) {
				hocSinh1[i].Xuat();
			}
		}
		else if(Choose==2) {
			System.out.println("Nhập thứ tự học sinh muốn sửa: ");
			int check = sc.nextInt();sc.nextLine();
			Student[] hocSinh1 = new Student[n];
			for(int i=0;i<n;i++) {
				hocSinh1[i]=new Student();
				if(i!=(check-1)) {
					hocSinh1[i]=hocSinh[i];
				}
				else {
					System.out.println("Nhập lại thông tin: ");
					hocSinh1[i].Nhap();
				}
			}
			for(int i=0;i<n;i++) {
				hocSinh1[i].Xuat();
			}
		}
		else if(Choose==3) {
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					if(hocSinh[i].gettuoi()>hocSinh[j].gettuoi()) {
						Student temp = new Student();
						temp = hocSinh[i];
						hocSinh[i] = hocSinh[j];
						hocSinh[j] = temp;
					}
				}
			}
			for(int i=0;i<n;i++) {
				hocSinh[i].Xuat();
			}
		}
		else if(Choose==4) {
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					if(hocSinh[i].getGPA()>hocSinh[j].getGPA()) {
						Student temp = new Student();
						temp = hocSinh[i];
						hocSinh[i] = hocSinh[j];
						hocSinh[j] = temp;
					}
				}
			}
			for(int i=0;i<n;i++) {
				hocSinh[i].Xuat();
			}
		}
		else if(Choose==5) {
			for(int i=0;i<n-1;i++) {
				for(int j=i+1;j<n;j++) {
					if(hocSinh[i].getTiet()>hocSinh[j].getTiet()) {
						Student temp = new Student();
						temp = hocSinh[i];
						hocSinh[i] = hocSinh[j];
						hocSinh[j] = temp;
					}
				}
			}
			for(int i=0;i<n;i++) {
				hocSinh[i].Xuat();
			}
		}
		else if(Choose==6) {
			System.out.print("Chọn STT học sinh bị xóa: ");
			int check = sc.nextInt();
			Student[] hocSinh1 = new Student[n];
			for(int i=0;i<n;i++) {
				hocSinh1[i]=new Student();
				if(i<(check-1)) {
					hocSinh1[i]=hocSinh[i];
				}
				else if(i>(check-1)) {
					hocSinh1[i-1]=hocSinh[i];
				}
			}
			for(int i=0;i<n-1;i++) {
				hocSinh1[i].Xuat();
			}
		}
	}
}
