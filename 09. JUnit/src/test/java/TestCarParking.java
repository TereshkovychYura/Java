import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestCarParking {
    private ArrayList<Car> cars  = new ArrayList<Car>();
    private CarParking parking = new CarParking();
    private String[] colors = {"Black", "Red", "Blue", "White", "Gray"};
    private String[] makes = {"BMV", "Mercedes", "Audi", "Mazda", "Toyota"};
    @Before
    public void InitCars(){

        for (int i = 0; i < 5; i++) {
            cars.add(new Car(i, makes[i], "unknown", (2008+i), colors[i], (20000 + i * 1000), (100+1)));
        }
    }
    @Test
    public void ShowAllCarsMakes(){
        String[] allMakes =  parking.ShowAllCarsMakes();
        Assert.assertEquals(makes, allMakes);
    }
    @Test
    public void ShowCarsForUsedYears(){
        ArrayList<Car> test = new ArrayList<Car>();
        test.add(cars.get(0));
        ArrayList<Car> carsForYear;
        carsForYear = parking.ShowCarsForUsedYears(12);
        Assert.assertEquals(test.get(0).toString(), carsForYear.get(0).toString());
    }
    @Test
    public void ShowCarsForPriceYear(){
        ArrayList<Car> test = new ArrayList<Car>();
        test.add(cars.get(0));
        ArrayList<Car> carsForPriceYear;
        carsForPriceYear = parking.ShowCarsForPriceYear(20000,2008);
        Assert.assertEquals(test.get(0).toString(), carsForPriceYear.get(0).toString());
    }
}
