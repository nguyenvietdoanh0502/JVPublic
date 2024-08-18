package Bai2;

import java.util.Scanner;

public class Mobile extends Product{
	private String manufacturer;
	private double ram;
	public Mobile() {
		
	}
	public Mobile(String id,String name, double price, int total,String manufacturer, double ram) {
		super(id,name,price,total);
		this.manufacturer = manufacturer;
		this.ram = ram;
	}
	public String getMan() {
		return this.manufacturer;
	}
	public double getRam() {
		return this.ram;
	}
	public void setMan(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-15s%-15.3f%-15d%-15s%-15f", id,name,price,total,manufacturer,ram);
	}
	@Override
	public double getTotalPrice() {
		//Gia su chi phi quan ly,lu tru la 100
		return (double)total*price+0.2*100;
	}

}
