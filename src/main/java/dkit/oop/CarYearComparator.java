/* A Comparator object
 encapsulates a compare() method (i.e. wraps it in an object)
 that can be called by the ArrayList.sort() method when it 
 wants one Car object to compare itself with another Car object 
 based on the values in the "year" fields.
 
 The Comparator dictates the order in which the cars will be sorted.
 */

package dkit.oop;

import java.util.Comparator;

public class CarYearComparator implements Comparator<Car>
{
	public int compare(Car a, Car b) 
	{
		if (a.getYear() < b.getYear()) {
			return -1;
		} else if (a.getYear() == b.getYear()) {
			return 0;
		} else {
			return 1;
		}
	}
}
