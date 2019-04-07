package rentCarSystem;
import java.util.Scanner;

public class rentSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Garage g = new Garage();
		Vihicle[] c = g.getCars();
		Vihicle[] b = g.getBuses();
		int i;
		int choose;
		int time;
		double rentM;
		
		System.out.println("**************Welcome to the RentCar System**************");
		while(true) {
		i=1;
		System.out.print("Which type of car you want(1.Cars;2.Buses):");
		choose = input.nextInt();
		if(choose==1) {
			System.out.println("********Cars List**********");
			for(Vihicle v : c) {
				Cars car =(Cars)v;
				System.out.println(i+"."+v.getB()+car.getT());
				i++;
			}
			System.out.println("Which car you want to rent(input the num):");
			choose = input.nextInt();
			System.out.println("How long you want to rent(7days,30days,150days):");
			time = input.nextInt();
			switch(time){
			    case 7:
			    	rentM = c[choose-1].getR()*7*0.9;
			    	System.out.println("The rent is "+rentM+"rmb.");
				    break;
			    case 30:
			    	rentM = c[choose-1].getR()*30*0.8;
			    	System.out.println("The rent is "+rentM+"rmb.");
					break;
			    case 150:
			    	rentM = c[choose-1].getR()*150*0.7;
			    	System.out.println("The rent is "+rentM+"rmb.");
					break;
				default:
					System.out.println("Wrong entry,please check.");
					break;		
			}
		}else if(choose==2) {
			System.out.println("********Buses List**********");
			for(Vihicle v : b) {
				Buses bus =(Buses)v;
				System.out.println(i+"."+v.getB()+bus.getS()+"×ù");
				i++;
			}
				System.out.println("Which bus you want to rent(input the num):");
				choose = input.nextInt();
				System.out.println("How long you want to rent(3days,7days,30days,150days):");
				time = input.nextInt();
				switch(time){
				case 3:
					rentM = b[choose-1].getR()*3*0.9;
			    	System.out.println("The rent is "+rentM+"rmb.");
					break;
			    case 7:
			    	rentM = b[choose-1].getR()*7*0.8;
			    	System.out.println("The rent is "+rentM+"rmb.");
				    break;
			    case 30:
			    	rentM = b[choose-1].getR()*30*0.7;
			    	System.out.println("The rent is "+rentM+"rmb.");
					break;
			    case 150:
			    	rentM = b[choose-1].getR()*150*0.6;
			    	System.out.println("The rent is "+rentM+"rmb.");
					break;
				default:
					System.out.println("Wrong entry,please check.");
					break;		
			}
			
		}else {
			System.out.println("We dont hava this type.");
		}
		}
	}

}
