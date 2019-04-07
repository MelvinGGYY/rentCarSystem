package rentCarSystem;

public class Garage {
	
	public Vihicle[] getCars() {
		
		Vihicle[] v= {new Cars("宝马","京NY28588",800.0,"X6"),new Cars("宝马","京CNY3284",600.0,"550i"),new Cars("别克","京NT37465",300.0,"林荫大道"),new Cars("别克","京NT96968",600.0,"GL8")};
		
		return v;
	}
	
    public Vihicle[] getBuses() {
		
		Vihicle[] v= {new Buses("金杯","京6566754",800.0,16),new Buses("金龙","京8696997",800.0,16),new Buses("金杯","京9696996",1500.0,34),new Buses("金龙","京8696998",1500.0,34)};
		
		return v;
	}

}
