package _15_16JavaIntefaceAndAbstract;

public abstract class Carshable {
	
	boolean carDrivable = true;
	
	public void setYouCrashed(){
		this.carDrivable = false;
	}
	
	public abstract void setCarStength(int carStrength);
	
	public abstract int getCarStrength();

}
