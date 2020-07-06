public class Car {
    private int id;

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", color=" + color + ", price=" + price + ", regNumber=" + regNumber + '}';
    }
    private String make;
    private String model;
    private int year;
    private String color;
    private int price;
    private int regNumber;

    public Car( int id, String make, String model, int year, String color, int price, int reqNumber){
        this.id = id;
        this.make  = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.regNumber = reqNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public int getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getRegNumber() {
        return regNumber;
    }
}
