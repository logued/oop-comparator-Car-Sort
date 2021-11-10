/* A Comparator object
 * encapsulates a compare() method (i.e. wraps it in an object)
 * that can be called by the ArrayList.sort() method when it
 * wants one Car object to compare itself with another Car object 
 * based on the values in the "mileage" fields.
 * 
 * The Comparator dictates the order in which the cars will be sorted.
 */

package dkit.oop;

import java.util.Comparator;

public class CarMileageComparator implements Comparator<Car>
{
	public int compare(Car a, Car b) 
	{
		if ( a.getMileage() < b.getMileage() ) {
			return -1; 
		} else if ( a.getMileage() == b.getMileage()) { 
			return 0; 
		} else { 
			return 1; 
		}
	}
}


