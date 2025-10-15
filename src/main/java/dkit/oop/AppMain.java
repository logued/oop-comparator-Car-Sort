package dkit.oop;					// Oct 2025

//   https://github.com/logued/oop-comparator-Car-Sort

// Demonstrates how to determine the sort order of a collection of objects
// by providing an appropriate Comparator.
// A Comparator is a class that implements the Comparable Interface and
// that defines a compare() method to compare two objects.
//
// The Comparator passed into Collections.sort(list, comparator)
// will be used by the sort() method to compare objects and thus
// determine the ordering.
// list.sort(comparator) is now the preferred method.

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
		// create an instance of CarYearAscendingComparator to specify ordering for sort by 'year'
		CarYearAscendingComparator yearAscComparator = new CarYearAscendingComparator();
		Collections.sort( carList, yearAscComparator );

		//carList.sort( yearAscComparator );  // alternatively, use List.sort()

		display( carList );

		System.out.println("Sort by mileage:");
		// create a CarMileageAscendingComparator object to sort by 'mileage'
		carList.sort( new CarMileageAscendingComparator() );
		display( carList );

		System.out.println("Sort by mileage DESCENDING:");
		// create a CarMileageDescendingComparator object to sort by 'mileage'
		carList.sort( new CarMilageDescendingComparator() );
		display( carList );

		System.out.println("Sort by make:");
		// create a CarMakeComparator object to sort by 'make'
		carList.sort( new CarMakeAscendingComparator() );
		display( carList );

		// Note that the order of the elements in the ArrayList
		// will be changed every time a sort() is applied.

		//TODO
		// Write a comparator and use it to sort the carList in DESCENDING order of "model".
		// Output the result and confirm that it has worked

		//TODO
		// Write a Comparator to sort the carList list in order of "mileage within model" -
		// meaning that "model" is the primary sort order, and "mileage" is the secondary sort order.
		// Check your output.

	}

	public void display( List<Car> cars )
	{
		for (Car car: cars) { System.out.println(car); }
	}	
}

