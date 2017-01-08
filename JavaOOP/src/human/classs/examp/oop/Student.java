package human.classs.examp.oop;

import java.util.Arrays;
import java.util.Comparator;

public class Student extends Human implements Comparable<Student> {

	private String wordEvaluation;
	private int numberEvaluation;
	
	public Student(String name, String lastName, String wordEvaluation, int evaluation){
		setName(name);
		setLastName(lastName);
		this.wordEvaluation = wordEvaluation;
		this.numberEvaluation = evaluation;
		
	}
	
	public String getWordEvaluation() {
		return wordEvaluation;
	}
	public void setWordEvaluation(String wordEvaluation) {
		this.wordEvaluation = wordEvaluation;
	}
	public int getNumberEvaluation() {
		return numberEvaluation;
	}
	public void setNumberEvaluation(int numberEvaluation) {
		this.numberEvaluation = numberEvaluation;
	}
	
	
	@Override
	public int compareTo(Student compareStudent) {
		// TODO Auto-generated method stub
		
	int compareQuantity = ((Student) compareStudent).getNumberEvaluation();
	
	//ascending order	
	return this.numberEvaluation - compareQuantity;
	
	//descending order
	//return compareQuantity - this.quantity;
	}
	
	public static Comparator<Student> StudentNumberComparator = new Comparator<Student>(){
		
		public int compare(Student student1, Student student2){
			String studentName1 = student1.getName().toUpperCase();
			String studentName2 = student2.getName().toUpperCase();
			
			//ascending order
			return studentName1.compareTo(studentName2);
			
			//descending order
		    //return fruitName2.compareTo(fruitName1);
		}
	};
	
public static void main(String[] args) {
		
		Student[] tuSofiq = new Student[5];
		
		Student adil6 = new Student("Adil6", "Bozov6", "Otlichen6", 6);
		Student adil5 = new Student("Adil5", "Bozov5", "mnogoDobyr5", 5);
		Student adil4 = new Student("Adil4", "Bozov4", "dobyr4", 4);
		Student adil3 = new Student("Adil3", "Bozov3", "Sreden3", 3);
		Student adil2 = new Student("Adil2", "Bozov2", "SALB2", 2);
		
		tuSofiq[0] = adil4;
		tuSofiq[1] = adil2;
		tuSofiq[2] = adil3;
		tuSofiq[3] = adil6;
		tuSofiq[4] = adil5;
		
		Arrays.sort(tuSofiq);
		
		int i=0;
		for(Student temp: tuSofiq){
			System.out.println("Name" + ++i + " : " + temp.getName() + " " + temp.getLastName() + " : " + temp.getWordEvaluation() + " : " + temp.getNumberEvaluation());
		}
	}

}
