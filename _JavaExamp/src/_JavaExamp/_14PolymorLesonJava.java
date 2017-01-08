package _JavaExamp;

public class _14PolymorLesonJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		_14PolymorAnimalsJava genericAnimal = new _14PolymorAnimalsJava();
		
		System.out.println(genericAnimal.getName());
		System.out.println(genericAnimal.favFood);
		
		_14PolymorCatsJava morris =new _14PolymorCatsJava("Morris", "Tuna", "Rubber Mouse");
		
		System.out.println();
		
		System.out.println(morris.getName());
		System.out.println(morris.favFood);
		System.out.println(morris.favToy);
		
		_14PolymorAnimalsJava tabby = new _14PolymorCatsJava("Tabby", "Salmon", "Ball");
		
		_14PolymorAnimalsJava tom = new _14PolymorAnimalsJava();
		
		acceptAnimal(tabby);
		
		tom.walkAround();

	}
	
	public static void acceptAnimal(_14PolymorAnimalsJava promenlivaOtTipAnimal){
		System.out.println();
		System.out.println(promenlivaOtTipAnimal.getName());
		System.out.println(promenlivaOtTipAnimal.favFood);
		System.out.println();
		
		promenlivaOtTipAnimal.walkAround();
		
		System.out.println();
		
		//System.out.println(promenlivaOtTipAnimal.favToy); nemojem da dostypim favToy, zashtoto sme syzdali instanciq kym kals Animal a favToy se namira v klas Cats
		_14PolymorCatsJava tempCat = (_14PolymorCatsJava)promenlivaOtTipAnimal;
		System.out.println(tempCat.favToy);
		System.out.println();
		System.out.println(((_14PolymorCatsJava)promenlivaOtTipAnimal).favToy);
		System.out.println();
		
		if(promenlivaOtTipAnimal instanceof _14PolymorAnimalsJava){
			System.out.println(promenlivaOtTipAnimal.getName() + "is a Cat");
		}
	}

}
