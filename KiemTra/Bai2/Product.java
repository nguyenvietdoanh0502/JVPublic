package Bai2;

public class Product {
	protected String id;
	protected String name;
	protected double price;
	protected int total;
	public Product() {
		
	}
	public Product(String id, String name, double price, int total) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.total = total;
	}
	public String getName() {
		return this.name;
	}
	public String getId() {
		return this.id;
	}
	public double getPrice() {
		return this.price;
	}
	public int getTotal() {
		return this.total;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String toString() {
		return "ID: "+id+"\nName: "+name+"\nPrice: "+price+"\nTotal: "+total;
	}
	public double getTotalPrice() {
		return (double)total*price;
	}
}
