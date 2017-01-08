package _RecursionAndRecursiveAlgorithms;

import java.util.Arrays;

public class GeneratingCombination {
	
	static void GenCombs(int[] arr, int index, int startNum, int endNum){
		if(index >= arr.length){
			System.out.println(Arrays.toString(arr));
		}else{
			for(int i = startNum; i <= endNum; i++){
				arr[index] = i ;
				GenCombs(arr, index + 1, i + 1, endNum);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[2];
		GenCombs(arr, 0, 4, 8);

	}

}
