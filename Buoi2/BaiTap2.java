package JAva;

import java.util.Scanner;

public class BaiTap2 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n;
	n = scanner.nextInt();
	
	int arr[] =new int [n];
	for(int i=0;i<n;i++) {
		arr[i]= scanner.nextInt();
	}
	int max =arr[0];
	for(int i=0;i<n;i++) {
		if(max<arr[i]) {
			max = arr[i];
		}
	}
	int min = arr[0];
	for(int i=0;i<n;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
	}
	System.out.print(max-min);
	}
}
