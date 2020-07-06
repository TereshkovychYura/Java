import java.util.ArrayList;

public class CarParking {
    private ArrayList<Car> cars  = new ArrayList<Car>();
    public CarParking(){
        String[] colors = {"Black", "Red", "Blue", "White", "Gray"};
        String[] makes = {"BMV", "Mercedes", "Audi", "Mazda", "Toyota"};
        for (int i = 0; i < 5; i++) {
            cars.add(new Car(i, makes[i], "unknown", (2008+i), colors[i], (20000 + i * 1000), (100+1)));
        }
    }

    public String[] ShowAllCarsMakes(){
        String[] showM = new String[5];
        int counter = 0;
        for (Car car:cars) {
            showM[counter] = car.getMake();
            counter++;
        }
        return showM;
    }

    public ArrayList<Car> ShowCarsForUsedYears(int year)
    {
        ArrayList<Car> carsForYear  = new ArrayList<Car>();
        for (Car car: cars) {
            if((2020 - car.getYear()) >= year)
                carsForYear.add(car);
        }
        return carsForYear;
    }

    public ArrayList<Car> ShowCarsForPriceYear(int price, int year){
        ArrayList<Car> carsForPriceYear  = new ArrayList<Car>();
        for (Car car: cars) {
            if(car.getYear() == year && car.getPrice() == price)
                carsForPriceYear.add(car);
        }
        return  carsForPriceYear;
    }

}
