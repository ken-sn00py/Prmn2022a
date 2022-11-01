package lecture02;

public class Car {

    int fuel;
    Tire tires[];
    Engine engine;

    Car(Tire tires[],Engine engine){
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    public Car(Tire tires[]) {
        this.tires = tires;
    }

    void run(){
        fuel = fuel-1;
        if(fuel>0) {
            System.out.println("燃料を1消費して走りました。");
        }else{
            System.out.println("燃料切れです");
        }
    }

    void startEngine(){
        engine.start();
    }

}
