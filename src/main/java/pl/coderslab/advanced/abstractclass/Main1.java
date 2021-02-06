package pl.coderslab.advanced.abstractclass;

public class Main1 {
	public static void main(String[] args) {
		Vehicle sportCar = new Car(200, "Honda", "sport");
		Vehicle train = new Train(60, "Karlik", 1000);

		Vehicle [] vehicles = new Vehicle[] { sportCar, train };

		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle);
		}
	}
}
