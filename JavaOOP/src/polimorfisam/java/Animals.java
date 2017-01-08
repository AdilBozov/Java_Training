package polimorfisam.java;

public class Animals {
	private String name = "Animals";
	public String favFood = "Food";
	
	protected final void changeName(String newName){
		this.name = newName;
	}
	
	protected final String getName(){
		return this.name;
	}
	
	public void eatStuff(){
		System.out.println("Yum" + favFood);
	}
	
	public void wolkAround(){
		System.out.println(this.name + "wolks around");
	}
	
	public Animals(){
		
	}
	
	public Animals(String name, String favFood){
		this.changeName(name);
		this.favFood = favFood;
	}
	

}
