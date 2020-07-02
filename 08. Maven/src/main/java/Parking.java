import java.util.ArrayList;
import java.util.Random;

public class Parking {
    private ArrayList<Car> cars = new ArrayList<Car>();

    public Parking(){
        cars.add( new Car(System.currentTimeMillis(),"Mercedes" ,2006, "gray",21443));
        cars.add( new Car(System.currentTimeMillis(),"BMV" ,2012, "black",12234));
        cars.add( new Car(System.currentTimeMillis(),"Audi" ,2010, "white",96564));
        cars.add( new Car(System.currentTimeMillis(),"Mazda" ,2003, "green",34521));
        cars.add( new Car(System.currentTimeMillis(),"Toyota" ,2018, "pink",93467));
    }


    public void ShowAllCars(){
        int count = 1;
        for (Car car:cars) {
            System.out.print(count + ") ");
            car.ShowCarInfo();
            count++;
        }
    }
    public void AddNewCar(String make, int year, String color, int number){
        this.cars.add(new Car(System.currentTimeMillis(), make, year, color, number));
    }
    public void RemoveCar(int index){
        this.cars.remove(index);
    }
    public void FindCarByYear(int year){
        for (Car car:cars) {
            if(car.getYear()==year){
                car.ShowCarInfo();
            }
        }
        System.out.println("");
    }
    public void FindCarByMake(String make){
        for (Car car:cars) {
            if(car.getMake().toLowerCase()==make.toLowerCase()){
                car.ShowCarInfo();
            }
        }
    }
}
