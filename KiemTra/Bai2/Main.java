package Bai2;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Mobile[] arr = new Mobile[5];
		arr[0] = new Mobile("001","IPhone",1000,3,"Apple",4);
		arr[1] = new Mobile("002","ZFold4",2000,4,"SamSung",8);
		arr[2] = new Mobile("003","K40Gaming",4000,2,"Xiaomi",8);
		arr[3] = new Mobile("004","RedMagic",3000,9,"Asus",16);
		arr[4] = new Mobile("005","Pixel",5000,5,"Google",16);
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[i].getTotalPrice()>arr[j].getTotalPrice()) {
					Mobile temp = new Mobile();
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s", "ID","NAME","PRICE","TOTAL","MANUFACTURER","RAM","TOTALPRICE"));
		for(int i=0;i<5;i++) {
			System.out.println(arr[i].toString()+arr[i].getTotalPrice());
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten san pham: ");
		String s = sc.nextLine();
		int check=0;
		for(int i=0;i<5;i++) {
			if(s.equals(arr[i].getName())) {
				System.out.println(String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s", "ID","NAME","PRICE","TOTAL","MANUFACTURER","RAM","TOTALPRICE"));
				System.out.println(arr[i].toString()+arr[i].getTotalPrice());
			}
			else {
				check++;
			}
		}
		if(check==5) {
			System.out.print("Khong tim duoc san pham co ten nhu tren");
		}
	}
}
