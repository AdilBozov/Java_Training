package _SortingAndSeaechingAlgorithms;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 44, 38, 5, 47, 15, 3, 36, 26, 27, 2, 46, 4, 19, 50, 48, 50};
		System.out.println(Arrays.toString(arr));
		
		SelectionSort(arr);
		
		//Average case: O(n^2)
		//Memory: O(1)
		//Stable: No
		//Method: Selection
		
		System.out.println(Arrays.toString(arr));

	}

	private static void SelectionSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int left = 0; left < arr.length - 1; left ++){
			
			int minIndex = left;
			
			for(int i = left +1; i < arr.length; i ++){
				if(arr[i] < arr[minIndex]){
					
					minIndex = i;
					
				}
				
			}
			
			if(minIndex != left){
				Swap(arr, left, minIndex);
			//	System.out.println(Arrays.toString(arr));
			}
			
		}
		
	}

	private static void Swap(int[] arr, int left, int minIndex) {
		// TODO Auto-generated method stub
		int temp = arr[left];
		arr[left] = arr[minIndex];
		arr[minIndex] = temp;
	}

}
