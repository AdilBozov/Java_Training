package _CallectionJavaExzample;

import java.util.*;

public class GetValue {

	public static HashMap<Integer, String> hashValue = new HashMap<Integer, String>();

	public GetValue() {

	}

	public GetValue(Integer[] intMas, String[] strMas) {
		if (intMas.length == strMas.length) {
			for (int i = 0; i < strMas.length; i++) {
				this.hashValue.put(intMas[i], strMas[i]);
			}
		} else {
			System.out.println("Error");
		}
	}

	public void setHashValue(Integer[] intMas, String[] strMas) {

		for (int i = 0; i < strMas.length; i++) {
			hashValue.put(intMas[i], strMas[i]);
			
		}
	}

	public HashMap<Integer, String> getHashValue() {
		return this.hashValue;

	}
}
