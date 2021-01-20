package JavaProgramOperations;

import java.util.ArrayList;

public class addTwoArrayList {

	public static void main(String[] args) {

		// First ArrayList
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("A");
		arraylist1.add("B");
		arraylist1.add("C");

		// Second ArrayList
		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("D");
		arraylist2.add("E");
		arraylist2.add("F");

		// Combined ArrayList
		ArrayList<String> CombineAL = new ArrayList<String>();
		CombineAL.addAll(arraylist1);
		CombineAL.addAll(arraylist2);
		
		//Display elements of the joined arraylist
		for(String temp:CombineAL) {
			System.out.print(temp);
		}
	}

}
