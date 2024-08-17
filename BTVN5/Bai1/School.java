package BTVN5;

public class School {
	private String name;
	private String date;
	public School() {
		
	}
	public School(String name, String date) {
		this.name = name;
		this.date = date;
	}
	public void setTen(String name) {
		this.name = name;
	}
	public void setDate(String date) {
		this.date =date;
	}
	public String getTen() {
		return this.name;
	}
	public String getDate() {
		return this.date;
	}
}
