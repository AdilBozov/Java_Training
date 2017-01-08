package _JavaExamp;

public class _14PolymorCatsJava extends _14PolymorAnimalsJava {
	
	public String favToy = "Yarn";
	
	public void playWith(){
		System.out.println("Yeah " + favToy);
	}
	
	public void walkAround(){
		System.out.println(this.getName() + "stalks around");
	}
	
	public String getToy(){
		return this.favToy;
	}
	
	public _14PolymorCatsJava(){
		
	}
	
	public _14PolymorCatsJava(String name, String favFood, String favToy) {
		super(name, favFood);
		this.favToy = favToy;
	}

}
