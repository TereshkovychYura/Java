import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        CarParking parking = new CarParking();
        ArrayList<Car> cars =  parking.ShowCarsForUsedYears(12);
        for(Car car: cars){
            System.out.println(car.toString());
        }
    }
}
