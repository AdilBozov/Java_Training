package _CombinatorialAlgorithms;

import java.util.Arrays;

public class Variations_2 {
	
	static final int n = 5;
	static final int k = 3;
	
	static int[] arr = new int[k];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		do{
			Print(arr);
		}while(Increment(arr));

	}


	static boolean Increment(int[] arr) {
		// TODO Auto-generated method stub
		int diget = arr.length-1;
		while(diget >= 0){
			arr[diget]++;
			if(arr[diget] == n){
				arr[diget] = 0;
				diget--;
			}
			else{
				return true;
			}
		}
		return false;
		
	}


	static void Print(int[] arr2) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(arr2));
	}

}
