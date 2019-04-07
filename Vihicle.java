package rentCarSystem;

public class Vihicle {
	
	private String brand;
	private String license;
	private double rent;
	
	public Vihicle(String brand,String license,double rent) {
		this.brand=brand;
		this.license=license;
		this.rent=rent;
	}
	
	public String getB() {
		return this.brand;
	}
	
	public String getL() {
		return this.license;
	}
	
	public double getR() {
		return this.rent;
	}

}
