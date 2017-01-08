package java.test2.oopp;

public class Cat extends Animalll {
	
	public Cat(){
		
		
	}
	
	public String makeSound(){
		
		return "Moew";
	}
	
	public static void main(String[] args) {
		Animalll fido = new Dog();
		Animalll fluffy = new Cat();
		
		Animalll[] theAnimols = new Animalll[10];
		
		theAnimols[0] = fido;
		theAnimols[1] = fluffy;
		
		System.out.println("fido says " + theAnimols[0].makeSound());
		System.out.println("Fluffy says " + theAnimols[1].makeSound());
		
		speakAnimal(fluffy);
	}

}
