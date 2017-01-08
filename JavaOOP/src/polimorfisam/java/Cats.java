package polimorfisam.java;

public class Cats extends Animals {
 
	public String favToy = "Yarn";
	public void palyWith(){
		System.out.println("Yeah " + favToy);
		
	}
	 
	public void walkAround(){
		System.out.println(this.getName() + "stalks around");
	}
	
	public String getToy(){
		return this.favToy;
	}
	
	public Cats(){
		
	}
	
	public Cats(String name, String favFood, String favToy){
		super(name, favToy);
		this.favToy = favToy;
	}
}
