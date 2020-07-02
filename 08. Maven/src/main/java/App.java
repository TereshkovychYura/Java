import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
        int chose = 0;
        Parking parking = new Parking();

        for (;chose != 6;) {
            System.out.println("1)Show all cars. \n2)Add new car. \n3)Delete car. \n4)Find car by year. \n5)Find car by make. \n6)Exit.");
            System.out.print("Chose: ");
            chose = Integer.parseInt(buffered.readLine());
            switch(chose){
                case 1:{
                    parking.ShowAllCars();

                    break;
                }
                case 2:{
                    System.out.print("Enter make: ");
                    String make = buffered.readLine();

                    System.out.print("Enter year: ");
                    int year = Integer.parseInt(buffered.readLine());

                    System.out.print("Enter color: ");
                    String color = buffered.readLine();

                    System.out.print("Enter number: ");
                    int number = Integer.parseInt(buffered.readLine());

                    parking.AddNewCar(make, year, color, number);
                    break;
                }
                case 3:{
                    System.out.print("Enter car index: ");
                    int index = Integer.parseInt(buffered.readLine());

                    parking.RemoveCar(index-1);
                    break;
                }
                case 4:{
                    System.out.print("Enter year: ");
                    int year = Integer.parseInt(buffered.readLine());

                    parking.FindCarByYear(year);
                    break;
                }
                case 5:{
                    System.out.print("Enter make: ");
                    String make = buffered.readLine();

                    parking.FindCarByMake(make);
                    break;
                }
            }

        }
    }
}
