package _CombinatorialAlgorithms;

import java.util.Arrays;

import com.sun.org.apache.bcel.internal.generic.SWAP;

public class PeramutationGeneratorwithReps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr	= new int[]{3, 5, 1, 5, 5, 5};
		Arrays.sort(arr);
		PermuteRep(arr, 0, arr.length - 1);

	}

	static void PermuteRep(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		
		Print(arr);
		
		for(int left = end -1; left >= start; left--){
			for(int right = left + 1; right <= end; right ++){
				if(arr[left] != arr[right]){
					//SWAP(ref arr[left], ref arr[right]);
					Swap(arr[left], arr[right]);
					PermuteRep(arr, left + 1, end);
				}
			}
			
			int firstElement = arr[left];
			for(int i = left; i <= end - 1; i++){
				arr[i] = arr[i + 1];
			}
			arr[end] = firstElement;
		}
		
	}

	static void Swap(int numberO, int numberT) {
		// TODO Auto-generated method stub
		int temp = numberO;
		numberO = numberT;
		numberT = temp;
		
	}

	static void Print(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(arr));
		
	}

}
