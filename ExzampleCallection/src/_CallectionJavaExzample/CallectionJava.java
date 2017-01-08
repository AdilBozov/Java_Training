package _CallectionJavaExzample;

import java.util.Map;

public class CallectionJava {
	
	public static String[] valueString(){
		
		String[] masStr = new String[ ]{"Adil2", "Mara", "Bambi", "Cvetan", "Spas"};
		
		return masStr;
	}
	
	public static Integer[] valueInteger(){
		
		Integer[] masInt = new Integer[]{1, 2, 3, 4, 5};
		
		return masInt;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetValue value = new GetValue();
		value.setHashValue(valueInteger(), valueString());
		
		for(Map.Entry printMap:value.getHashValue().entrySet()){
			System.out.println(printMap.getKey()+ "->" + printMap.getValue());
		}

	}

}
