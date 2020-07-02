public class Car {
    private long date;
    private String make;
    private int year;
    private String color;
    private int number;



    public Car(long date, String make, int year, String color, int number){
        this.date=date;
        this.make= make;
        this.year = year;
        this.color=color;
        this.number=number;
    }

    public void ShowCarInfo(){
        System.out.println("Date: " + this.date + "\t Make: " + this.make + "\t Year: "
                + this.year +"\t Color: " + this.color + "\t Number: " + this.number);
    }
    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

}
