import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaseInsensitiveSearch {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter text");
		String text = input.readLine();
		
		System.out.println("Enter part");
		String part = input.readLine();
		Boolean indexBool = true;
		
		int sum = 0;
		int index = text.indexOf(part);
		if (index != -1) {
			sum++;
		}
		
		while (indexBool) {
			index = text.indexOf(part, index +1);
			if (index == -1) {
				indexBool = false;
			} else {
				sum++;
			}
		}
	}

}
