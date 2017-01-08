package human.classs.examp.oop;

import java.util.Arrays;
import java.util.Comparator;

public class Worker extends Human implements Comparable<Worker> {
	
	private int wage;
	private int hoursWorked;
	
	public Worker(String name, String lastName, int wage, int hoursWorked){
		setName(name);
		setLastName(lastName);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
		
	}
	
	public Worker(){
		
	}
	
	public int getWage() {
		return wage;
	}
	public void setWage(int wage) {
		this.wage = wage;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public static int workerForOneHour(int wagr, int hoursWorked){
		int rezult = wagr / hoursWorked;
		
		return rezult;
	}
	
	
	@Override
	public int compareTo(Worker compareWorker) {
		// TODO Auto-generated method stub
		
		int compareQuantity = ((Worker) compareWorker).getWage();
		
		//ascending order	
		//return this.wage - compareQuantity;
		
		//descending order
		return compareQuantity - this.wage;
		
	}
	
public static Comparator<Worker> workerWage = new Comparator<Worker>(){
		
		public int compare(Worker worker1, Worker worker2){
			String workerName1 = worker1.getName().toUpperCase();
			String workerName2 = worker2.getName().toUpperCase();
			
			//ascending order
			//return workerName1.compareTo(workerName2);
			
			//descending order
		    return workerName2.compareTo(workerName1);
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Worker bambi = new Worker();
		
		bambi.setName("Ivailo");
		bambi.setLastName("Ivanov");
		bambi.setWage(120);
		bambi.setHoursWorked(12);
		System.out.println(bambi.workerForOneHour(bambi.getWage(), bambi.getHoursWorked()));
		
		Worker[] people = new Worker[5];
		
		Worker name11 = new Worker("Adil11", "Bozov11", 11, 110);
		Worker name22 = new Worker("Adil22", "Bozov22", 22, 220);
		Worker name33 = new Worker("Adil33", "Bozov33", 33, 330);
		Worker name44 = new Worker("Adil44", "Bozov44", 44, 440);
		Worker name55 = new Worker("Adil55", "Bozov55", 55, 550);
		
		people[0] = name22;
		people[1] = name11;
		people[2] = name55;
		people[3] = name33;
		people[4] = name44;
		
		Arrays.sort(people);
		
		int i = 0;
		
		for(Worker temp: people){
			System.out.println("Name" + ++i + " : " + temp.getName() + " " + temp.getLastName() + " : " + temp.getHoursWorked() + " : " + temp.getWage());
		}

	}
	

}
