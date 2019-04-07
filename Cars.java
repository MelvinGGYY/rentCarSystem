package rentCarSystem;

public class Cars extends Vihicle{
	
	private String type;
	public Cars(String brand,String license,double rent,String type) {
		super(brand,license,rent);
		this.type=type;
	}
	
	public String getT() {
		return this.type;
	}

}
