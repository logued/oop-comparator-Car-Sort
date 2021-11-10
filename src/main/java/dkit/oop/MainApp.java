package dkit.oop;

// Demonstrates using different Comparators
// to sort an ArrayList of cars in different orders.
// The Comparator must be passed into the Collections.sort() method
// to sort the list in the order set by the Comparator.
// We write the Comparators to dictate the sort order for Cars.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp
{
	public static void main(String[] args)
	{
		MainApp app = new MainApp();
		app.start();		
	}
	
	public void start()
	{
		List<Car> cars = new ArrayList<Car>();

		System.out.println("Car list (initial order):");
		cars.add( new Car("Toyota", "Corolla", "Red", 2010, 35000) );
		cars.add( new Car("Audi", "A4", "Black", 2012, 22000) );
		cars.add( new Car("BMW", "520d", "Blue", 2006, 100000) );

		display( cars );
	
		/* The List of Car objects can be sorted using the Collections.sort()
		 * method. We supply a Comparator object as a parameter, which dictates
		 * the sort order.
		 */
		System.out.println("Sort by year:");
		// create a CarYearComparator object to sort by 'year'
		CarYearComparator yearComparator = new CarYearComparator();		
		Collections.sort( cars, yearComparator );
		display( cars );
		
		System.out.println("Sort by mileage:");
		// create a CarMileageComparator object to sort by 'mileage'
		CarMileageComparator mileageComparator = new CarMileageComparator();		
		Collections.sort( cars, mileageComparator );
		display( cars );

		System.out.println("Sort by make:");
		// create a CarMakeComparator object to sort by 'make'
		CarMakeComparator makeComparator = new CarMakeComparator();		
		Collections.sort( cars, makeComparator );
		display( cars );

		// Note that the ArrayList elements will remain in the
		// order dictated by the last sort().
	}
	
	public void display( List<Car> cars )
	{
		for (Car c: cars) { System.out.println(c); }		
	}	
}

