// Comparator - compares double-type field "mileage"		Nov 2025
// DESCENDING Order

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
// passed into the compareTo() method, and the result of the comparison
// is returned as [ negative, zero, or positive value ]

package dkit.oop;

import java.util.Comparator;

public class CarMilageDescendingComparator implements Comparator<Car>
{
    public int compare(Car car1, Car car2)
    {
        // note we reverse the order of the arguments to get a DESCENDING order
        return Double.compare(car2.getMileage(),car1.getMileage());
    }
}




