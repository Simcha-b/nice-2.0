interface Movable{
    void move();
    int efficiencyScore();
}

 abstract class Vehicle implements Movable {
    protected String model;
    protected int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public abstract void fuelType();

    public abstract double costPer100Km();
}

 class Car extends Vehicle {

    double fuelConsumption;

    public Car(String model, int year,double fuelConsumption ){
        super(model, year);
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void fuelType() {
        System.out.println("Gasoline");        
    }
    @Override
    public void move() {
        System.out.println("Car is driving");
    }
    public int efficiencyScore(){
        return fuelConsumption>15 ? 80 : 70;
    }


    public double costPer100Km(){
        return  (double) (100/this.fuelConsumption)*7;
    }
}

 class ElectricScooter extends Vehicle {
    public ElectricScooter(String model, int year){
        super(model, year);
    }
   @Override
   public void fuelType() {
       System.out.println("Electric");
   }
    @Override
    public void move() {
       System.out.println("Scooter is gliding");
    }
    public int efficiencyScore(){
        int score = 90 + (int)(Math.random() * 11);
        return score;
    }
    public double costPer100Km(){
        return 5.0;
    }
}

 class Bike extends Vehicle {
    public Bike(String model, int year){
        super(model, year);
    }
    @Override
    public void fuelType() {
        System.out.println("Human-powered");
    }
    @Override
    public void move() {
        System.out.println("Bike is pedaling");
    }
    public int efficiencyScore(){
        return 100;
    }

    public double costPer100Km(){
        return 0;
    }
}
class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[6];
        vehicles[0] = new Car("mazda3", 2005, 10);
        vehicles[1] = new Car("toyota", 2021, 16);
        vehicles[2] = new ElectricScooter("Xiaomi", 2010);
        vehicles[3] = new ElectricScooter("RIDER10X", 2025);
        vehicles[4] = new Bike("BMX", 2016);
        vehicles[5] = new Bike("MONGOOSE", 2025);

        int sum = 0;
        Vehicle minVehicle = vehicles[0];

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.fuelType();
            vehicle.move();
            System.out.println("Efficiency: " + vehicle.efficiencyScore());
            System.out.println("Cost per 100 km: " + vehicle.costPer100Km());
            sum+=vehicle.efficiencyScore();
            if (vehicle.costPer100Km()<minVehicle.costPer100Km()) {
                minVehicle = vehicle;
            }
        }
        double avg = sum/6.0;
        System.out.println("average of score is: "+ avg);
        System.out.println("the Vehicle with min cost for 100 km: " + minVehicle.model);
    }
}