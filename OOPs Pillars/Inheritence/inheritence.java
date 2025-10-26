package Inheritence;
class Car{
    protected String model;
    protected String brand;
    protected boolean isEngineOn;
    protected int currentSpeed;

    public Car(String model , String brand){
        this.model = model;
        this.brand = brand;
        this.isEngineOn = false;
        this.currentSpeed = 0;
    }

    public void startEngine(){
        isEngineOn = true;
        System.out.println("Engine started of ->" + brand + " " + model);
    }
    public void stopEngine(){
        isEngineOn = false;
        currentSpeed = 0;
        System.out.println("Engine stopped of ->" + brand + " " + model);
    }

    public void accelerate(){
        if(!isEngineOn){
            System.out.println(brand + " " + model + " : Cannot accelerate! Engine is off.");
        }
        currentSpeed += 20;
        System.out.println(brand + " " + model + " : Accelerating to " + currentSpeed + " km/h");
    }
    public void brake() {
        currentSpeed -= 20;
        if (currentSpeed < 0) currentSpeed = 0;
        System.out.println(brand + " " + model + " : Braking! Speed is now " + currentSpeed + " km/h");
    }
    
}

class ManualCar extends Car{
    private int currentGear;

    public ManualCar(String model , String brand){
        super(model, brand);
        this.currentGear = 0;
    }

    public void shiftGear(int gear){
        this.currentGear = gear;
        System.out.println(brand + " " + model + " : Shifted to gear " + currentGear);
    }
}

class ElectricCar extends Car{
    private int batteryLevel;

    public ElectricCar(String model , String brand){
        super(model , brand);
        this.batteryLevel = 100;
    }

    public void chargeBattery(int percentage){
        this.batteryLevel = percentage;
        System.out.println(brand + " " + model + " : Battery fully charged!");
    }
}

public class inheritence {
    public static void main(String[] args) {
        ManualCar myManualCar = new ManualCar("shift", "suzukhi");
        myManualCar.startEngine();
        myManualCar.shiftGear(1);
        myManualCar.accelerate();
        myManualCar.brake();
        myManualCar.stopEngine();

        System.out.println("----------------------");

        ElectricCar myElectricCar = new ElectricCar("Model S", "TESLA");
        myElectricCar.chargeBattery(98);
        myElectricCar.startEngine();
        myElectricCar.accelerate();
        myElectricCar.brake();
        myElectricCar.stopEngine();

    }
}
