package rentCarSystem;

public class Garage {
	
	public Vihicle[] getCars() {
		
		Vihicle[] v= {new Cars("����","��NY28588",800.0,"X6"),new Cars("����","��CNY3284",600.0,"550i"),new Cars("���","��NT37465",300.0,"������"),new Cars("���","��NT96968",600.0,"GL8")};
		
		return v;
	}
	
    public Vihicle[] getBuses() {
		
		Vihicle[] v= {new Buses("��","��6566754",800.0,16),new Buses("����","��8696997",800.0,16),new Buses("��","��9696996",1500.0,34),new Buses("����","��8696998",1500.0,34)};
		
		return v;
	}

}
