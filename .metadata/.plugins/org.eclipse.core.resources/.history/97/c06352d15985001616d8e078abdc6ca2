package _CombinatorialAlgorithms;

import java.util.Arrays;

public class VarationsGeneratorNoReps {
	
	static final int k = 2;
	static final int n = 10;
	
	static String[] objects = new String[]{
			"banana", "apple", "orange", "strawberry", "raspberry",
			"apricot", "cherry", "lemon", "grapes", "melon"
	};
	
	static int[] arr = new int[k];
	static boolean[] used = new boolean[n];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateVariationsNorepetitions(0);

	}


	private static void GenerateVariationsNorepetitions(int index) {
		// TODO Auto-generated method stub
		if(index >= k){
			PrintVariations();
		}
		else{
			for(int i = 0; i < n; i++){
				if(!used[i]){
					used[i] = true;
					arr[index] = i;
					GenerateVariationsNorepetitions(index + 1);
					used[i] = false;
				}
			}
		}
		
	}


	static void PrintVariations() {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(arr)+ " --> " + objects[arr[0]] + " ==> " + objects[arr[1]]);
		
		
	}

}
