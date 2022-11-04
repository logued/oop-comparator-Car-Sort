package dkit.oop;

// Demonstrates how to determine the sort order of a collection of objects
// by implementing an appropriate Comparator.
//
// The Comparator passed into Collections.sort(list, comparator)
// will be used by the sort() method to compare objects and thus
// determine the sort order.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppMain
{
	public static void main(String[] args)
	{
		AppMain app = new AppMain();
		app.start();		
	}
	
	public void start()
	{
		List<Car> carList = new ArrayList<>();

		System.out.println("Demonstrating Collections.sort() using Comparators\n");

		System.out.println("Car list (initial order):");
		carList.add( new Car("BMW", "520d", "Red", 2007, 99000.35) );
		carList.add( new Car("Toyota", "Corolla", "Red", 2010, 35000.50) );
		carList.add( new Car("Audi", "A4", "Black", 2012, 22000.77) );
		carList.add( new Car("BMW", "520d", "Blue", 2006, 99000.34) );

		System.out.println("Cars list in original (chronological) order:");
		display( carList );
	
		/* The List of Car objects can be sorted using the Collections.sort()
		 * method. We supply a Comparator object as a parameter, which dictates
		 * the sort order.
		 */

		System.out.println("Sort by year:");
		// create a CarYearComparator object to sort by 'year'
		CarYearComparator yearComparator = new CarYearComparator();
		Collections.sort( carList, yearComparator );
		display( carList );

		System.out.println("Sort by mileage:");
		// create a CarMileageComparator object to sort by 'mileage'
		CarMileageComparator mileageComparator = new CarMileageComparator();
		Collections.sort( carList, mileageComparator );
		display( carList );

		System.out.println("Sort by make:");
		// create a CarMakeComparator object to sort by 'make'
		CarMakeComparator makeComparator = new CarMakeComparator();
		Collections.sort( carList, makeComparator );
		display( carList );

		// Note that the order of the elements in the ArrayList
		// will be changed every time a sort() is applied.

		// TODO
		// Write and test a comparator to sort the carList list in order of "model"


		// TODO
		// write and test a comparator to sort the carList list in order
		// of "year within make" - meaning that "make" is the major sort order, and
		// "year" is the minor sort order.

	}

	public void display( List<Car> cars )
	{
		for (Car car: cars) { System.out.println(car); }
	}	
}

