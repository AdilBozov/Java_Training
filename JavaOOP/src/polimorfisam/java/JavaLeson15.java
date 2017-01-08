package polimorfisam.java;

public class JavaLeson15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animals genericAnimal = new Animals();
		
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);
		
		System.out.println();
		
		Cats morris = new Cats("Morris", "Tuna", "Rubber Mouse");
		
		System.out.println(morris.getName());
		System.out.println(morris.favFood);
		System.out.println(morris.favToy);
		
		System.out.println();
		
		
		Animals tobby = new Cats("Tabby", "Solmon", "Ball");
		
		acceptAnimal(tobby);

	}

	private static void acceptAnimal(Animals randAnimal) {
		// TODO Auto-generated method stub
		
		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);
		System.out.println();
	}

}
