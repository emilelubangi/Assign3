package Assignment3;

public class Vehicle {

    public String wheels() {
        String msg = "This vehicle has 4 wheels";
        return msg;
    }

}

class Tricycle extends Vehicle {

    public String wheels() {
        String msg = "This vehicle has 3 wheels";
        return msg;
    }
}
