package _RecursionAndRecursiveAlgorithms;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class GeneratingVectors0and1 {
	
	static void Gen01(int index, int[] vector){
		if(index < 0 ){
			System.out.println(Arrays.toString(vector));
		}else {
			for(int i = 0; i <= 1; i++){
				vector[index] = i;
				Gen01(index-1, vector);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int[] vector = new int[n];
		Gen01(n-1, vector);

	}

}