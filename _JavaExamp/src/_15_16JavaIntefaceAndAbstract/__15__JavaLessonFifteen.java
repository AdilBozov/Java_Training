package _15_16JavaIntefaceAndAbstract;

public class __15__JavaLessonFifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle car = new Vehicle(4, 100.00);
		Object carTest = new Vehicle(12,12.22);
		
		/*
		 * Triangle
		 * Square
		 * Reactangle
		 * 
		 * Shape triangle = new Triangle();
		 * Sheape seapeNew = new Square(); 
		 * 
		 * */
		
		System.out.println("Cars Max Speed " + car.getSpeed());
		System.out.println("Num of Wheels " + car.getWheel());
		
		System.out.println();
		car.setCarStength(10);
		System.out.println("Strength: " + car.getCarStrength());
	}

}
