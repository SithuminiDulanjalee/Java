
class Vehicle{
    public void park(){
        System.out.println("Vehicle Parking");
    }
    public void callPark(){
        park();
    }
}

class Car extends Vehicle{
    public void park(){
        System.out.println("Car Parking");
    }
}
class Example{
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.callPark();
    }
}

