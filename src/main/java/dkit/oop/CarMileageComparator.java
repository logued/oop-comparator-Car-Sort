// Comparator - compares int-type field "mileage"		Nov 2021
//
// This class defines a Comparator  - that is a class that implements the
// Comparator interface.  Every class that implements the Comparator interface
// must implement the compare() method.
//
// In this case we want to compare Car objects based on their "mileage".
// So, in the compare() method, we compare the mileage fields of the
// two Car objects.
//
// To sort a list of Car objects, we can use Collections.sort() and
// we pass in an instance of the CarMileageComparator() to specify
// the order of sorting (i.e. by mileage)
// The sort() method will call the compareTo() method each time it
// wants to compare two cars.  The two cars being compared are
// passed into the compareTo() method.

package dkit.oop;

import java.util.Comparator;

public class CarMileageComparator implements Comparator<Car>
{
	public int compare(Car car1, Car car2)
	{
		return Double.compare(car1.getMileage(),car2.getMileage());
	}
}
		// The above is logically similar to the following:
		// (However the above is recommended as there may be
		// problems in some cases dur to rounding.
//		if ( car1.getMileage() < car2.getMileage() ) {
//			return -1; // or any negative value
//		} else if ( car1.getMileage() == car2.getMileage()) {
//			return 0;
//		} else {
//			return 1; // or any positive value
//		}




