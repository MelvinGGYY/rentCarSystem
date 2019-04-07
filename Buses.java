package rentCarSystem;

public class Buses extends Vihicle{
	
	private int sites;
	public Buses(String brand,String license,double rent,int sites) {
		super(brand,license,rent);
		this.sites=sites;
	}
	public int getS() {
		return this.sites;
	}

}
