package _SortingAndSeaechingAlgorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
		int[] arr = {3, 44, 38, 5, 47, 15, 3, 36, 26, 27, 2, 46, 4, 19, 50, 48, 50};
		//System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr));
		
		BubbleSortt(arr);
		
		//Best case: O(n); Average case: O(n^2)
		//Memory: O(1)
		//Stable: Yes
		//Method: Exchanging
		
		System.out.println(Arrays.toString(arr));

	}

	private static void BubbleSortt(int[] arr) {
		// TODO Auto-generated method stub
		boolean swapped;
		int number = arr.length;
		
		do {
			
			swapped = false;
			
			for(int i = 0; i < number - 1; i++){
				if(arr[i] > arr[ i +1]){
					Swap(arr, i);
					//System.out.println(Arrays.toString(arr));
				}
				swapped = true;
			}
			number--;
		} while (swapped);
	}

	private static void Swap(int[] arr, int i) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[i + 1];
		arr[i + 1] = temp;
	}

}
