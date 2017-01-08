package _SortingAndSeaechingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 44, 38, 5, 47, 15, 3, 36, 26, 27, 2, 46, 4, 19, 50, 48, 50};
		System.out.println(Arrays.toString(arr));
		
		InsertionSortt(arr);
		
		//Best case: O(n); Average: O(n^2)
		//Memory: O(1)
		//Stable: Yes
		//Method: Insertion
		
		System.out.println(Arrays.toString(arr));

	}

	private static void InsertionSortt(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; i++){
			
			int lastNum = i;
			
			while(i > 0 && arr[i - 1] > arr[i]){
				Swap(arr, i);
				i--;
				System.out.println(Arrays.toString(arr));
			}
			
			i = lastNum;
			
		}
	}

	private static void Swap(int[] arr, int i) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[i -1];
		arr[i -1] = temp;
	}


}
