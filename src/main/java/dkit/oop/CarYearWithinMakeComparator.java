package dkit.oop;

import java.util.Comparator;

public class CarYearWithinMakeComparator implements Comparator<Car> {

    // if makes are equal then order by age
    // else, order by make
    public int compare(Car c1, Car c2) {
        if (c1.getMake().equals(c2.getMake()))
            return Integer.compare(c1.getYear(), c2.getYear());
        else {
            return c1.getMake().compareTo(c2.getMake());
        }
    }
}
