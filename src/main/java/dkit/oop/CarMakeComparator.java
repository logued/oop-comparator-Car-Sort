// Comparator - compares String-type field "make"		Nov 2021
//
// This class defines a Comparator  - that is a class that implements the
// Comparator interface.  Every class that implements the Comparator interface
// must implement the compare() method.
//
// In this case we want to compare Car objects based on their "make".
// So, in the compare() method, we compare the make fields of the
// two Car objects.
//
// To sort a list of Car objects, we can use Collections.sort() and
// we pass in an instance of the CarMakeComparator() to specify
// the order of sorting (i.e. by make)
// The sort() method will call the compareTo() method each time it
// wants to compare two cars.  The two cars being compared are
// passed into the compareTo() method.

package dkit.oop;

import java.util.Comparator;

public class CarMakeComparator implements Comparator<Car>
{
	// implement the compare() method required by the Comparator interface
	public int compare(Car car1, Car car2)
	{
		return car1.getMake().compareTo(car2.getMake());

		// The Make of a car is of type String and the String class implements
		// a compareTo() method that returns -1, 0, or +1 as appropriate.
		// So, to compare string fields we simply use the compareTo() method
	}
}
