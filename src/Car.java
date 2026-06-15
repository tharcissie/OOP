public class Car implements Prey{
    private String make;
    private final String model; //can not be modified
    static int count = 0;

    Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    static void drive(String make) {
        System.out.println("You drive" + make);
        count++;
    }

    @Override
    public void go() {
        System.out.println("Drive" + this.make);
    }

    String getMake(){
        return this.make;
    }

    void setMake(String make){
        this.make = make;
    }

    @Override
    public String toString() {
        return this.make;
    }
}
