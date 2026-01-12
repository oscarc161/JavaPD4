public class car {
    String brand;
    String color;
    String model;
    int year;
    double price;
    car(String brand, String color, String model, int year, double value){
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.year = year;
        this.price = value;
    }
    void honk(){
        System.out.println("Beep Beep, im a " + this.brand + ", im a expensive arse car!");
    }

}
