package _15_16JavaIntefaceAndAbstract;

public class Vehicle extends Carshable implements Drivable, Cloneable {
	
	int numOfWheels = 2;
	double theSpeed = 0;
	
	int carStrength = 0;
	
	public int getWheel(){
		return this.numOfWheels;
	};
	
	public void setWheels(int numWheels){
		this.numOfWheels = numWheels;
	}
	
	public double getSpeed(){
		return this.theSpeed;
	}
	
	public void setSpeed(double speed){
		this.theSpeed = speed;
	}
	
	public Vehicle(int wheels, double speed){
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}
	
	public Vehicle(){
		
	}
	
	public void setCarStength(int carStrength){
		this.carStrength = carStrength;
	}
	
	public int getCarStrength(){
		return this.carStrength;
	}
	
	public String toString(){
		return "Num of Wheels " + this.numOfWheels;
	}
	
	public Object clone(){
		Vehicle car;
		
		try{
			car = (Vehicle) super.clone();
		}
		catch(CloneNotSupportedException e){
			return null;
		}
		return car;
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

}
