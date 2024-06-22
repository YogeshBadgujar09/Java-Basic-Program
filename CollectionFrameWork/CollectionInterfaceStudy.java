

import java.io.*;
import java.util.*;

public class CollectionInterfaceStudy {
	public static void main(String[] args)
	{

		// add elements in List

		Collection<Integer> list1 = new ArrayList<Integer>(5);


		list1.add(2);
		list1.add(10);
		list1.add(5);


		for (Integer number : list1) {
			System.out.println("Number = " + number);
		}


		Collection<Integer> list2 = new ArrayList<Integer>();


		list2.addAll(list1);


		System.out.println("The new ArrayList is: " + list2);
	}
}
