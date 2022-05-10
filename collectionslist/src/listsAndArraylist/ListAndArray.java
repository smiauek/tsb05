package listsAndArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Integer> myNumList;
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			myList.add(i);
		}
		
//		System.out.println(myList.indexOf(50));
//		
//		System.out.println(myList.contains(80));
//		
//		System.out.println(myList.contains(155));
//		
//		boolean success = myList.remove((Integer) 80);
//		System.out.println(success);
//		boolean success2 = myList.remove((Integer) 180);
//		System.out.println(success2);
//		
//		System.out.println(myList.indexOf(80));
//		System.out.println(myList.indexOf(85));
//		
//		System.out.println(myList.size());
		
		int sum = 0;
		
		for (Integer num : myList) {
			sum+=num;
		}
		
		System.out.println("My sum: " + sum);
		
		myList.sort((x,y) -> x.compareTo(y));
		
		List<Double> dblList = Arrays.asList(2.2, 2.7, 2.3, 6.4);
		System.out.println(dblList.getClass().getName());
		
		List<String> str = new ArrayList<>();
		str.add("something");
		System.out.println(str.get(0));

	}

}
