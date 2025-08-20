package cjchiraglab2;

public class Showroom {
	public static void main(String[] args) {
        Car c1 = new Car("Porsche", "911", 45000000, 13.6);
        Car c2 = new Car("Honda", "Civic", 170000, 24.7, "John");
        Car c3 = new Car("Suzuki", "supra", 788000, 19.9);

        c1.displaydetails();
        c2.displaydetails();
        c3.displaydetails();

        c1.setOwnerName("Virat");  
        c1.updatePrice(16000);

        System.out.println("After Updates:");
        c1.displaydetails();

        Car.showShowroomName();
        Car.showTotalCars();
    }
}
