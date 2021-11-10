// This class defines a Comparator that will compare two Car
// objects based on their "make" field.
// The class must implement the Comparator interface and
// it must therefore override the compare() method.
//
// To sort a list of Car objects, we use Collections.sort() and
// pass in an instance of the CarMakeComparator() to specify
// the order of sorting (i.e. by make)

package dkit.oop;

import java.util.Comparator;

public class CarMakeComparator implements Comparator<Car>
{
	public int compare(Car a, Car b)
	{
		return a.getMake().compareTo(b.getMake());

		// String class has a compareTo() method that
		// returns -1, 0, or +1 as appropriate.
	}
}
