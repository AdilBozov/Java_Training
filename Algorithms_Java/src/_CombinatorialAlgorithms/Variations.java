package _CombinatorialAlgorithms;

import java.util.Arrays;

public class Variations {
	
	static final int n = 5;
	static final int k = 3;
	
	static int[] arr = new int[k];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenerateVarations(0);

	}


	static void GenerateVarations(int index) {
		// TODO Auto-generated method stub
		if(index == k){
			Print(arr);
		}else{
			for(int i = 0; i < n; i++){
				arr[index] = i;
				GenerateVarations(index + 1);
			}
		}
		
	}


	static void Print(int[] arr2) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(arr2));
	}

}
