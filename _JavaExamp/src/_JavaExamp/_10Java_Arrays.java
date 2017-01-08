package _JavaExamp;

import java.util.Arrays;

import jdk.nashorn.internal.objects.annotations.Where;

public class _10Java_Arrays {
	
	public static void main (String[] args)
	{
		int[] randomArray;
		int[] numberArray = new int[10];
		
		randomArray = new int[20];
		randomArray[1] = 2;
		String[] stringArray = {"just", "random", "words"};
		
		for (int i = 0; i < numberArray.length; i++)
		{
			numberArray[i] = i;
		}
		int k = 1;
		 while(k <= 41){System.out.print('-');k++;}
		 System.out.println();
		 
		 for(int j = 0; j < numberArray.length; j++)
		 {
			 System.out.print("|" + j + " ");
		 }
		 System.out.println("|");
		 
		 String[][] multiArray = new String[10][10];
		 
		 for (int i = 0; i < multiArray.length; i++)
		 {
		
			 for (int j = 0; j < multiArray[i].length; j++) 
			 {
				 multiArray[i][j] = i + " " + j;
				
			}
		}
		 
		 k = 1;
		 while(k <= 61){System.out.print('-');k++;}
		 System.out.println();
		 
		 for (int i = 0; i < multiArray.length; i++)
		 {
		
			 for (int j = 0; j < multiArray[i].length; j++) 
			 {
				 System.out.print("| " + multiArray[i][j] + " ");
				
			}
			 System.out.println("|");
		}
		 //System.out.println();
		 k = 1;
		 while(k <= 61){System.out.print('-');k++;}
		 System.out.println();
		 
		 for(int row : numberArray){
			 System.out.print(row);
		 }
		 System.out.println("\n");
		 
		 for(String[] rows : multiArray)
		 {
			 for(String colum : rows)
			 {
				 System.out.print("| " + colum + " ");
			 }
			 System.out.println("|");
			 
		 }
		 
		 int[] numberCopy = Arrays.copyOf(numberArray, 5);
		 for(int row : numberCopy)
		 {
			 System.out.print(row);
		 }
		 System.out.println("\n");
		 
		 int[] numberCopyOfRange = Arrays.copyOfRange(numberArray, 3, 6);
		 for(int row : numberCopyOfRange)
		 {
			 System.out.print(row);
		 }
		 System.out.println("\n");
		 
		 System.out.println(Arrays.toString(numberArray));
		 
		 System.out.println();
		 
		 int[] moreNumber = new int[100];
		 Arrays.fill(moreNumber, 2);
		 for(int row : moreNumber)
		 {
			 System.out.print(row);
		 }
		 System.out.println();
		 
		 char[][] boardGame = new char[10][10];
		 for(char[] row : boardGame)
		 {
			 Arrays.fill(row, '*');
			 System.out.println(row);
		 }
		 
		 int[] numToSort = new int[10];
		 
		 for (int i = 0; i < 10; i++) 
		 {
			numToSort[i] = (int)(Math.random() * 100);		
		 }
		 
		 System.out.println(Arrays.toString(numToSort));
		 System.out.println();
		 Arrays.sort(numToSort);
		 System.out.println(Arrays.toString(numToSort));
		 
		 int wheteIs50 = Arrays.binarySearch(numToSort, 50);
		 System.out.println(wheteIs50);
		 
	}

}
