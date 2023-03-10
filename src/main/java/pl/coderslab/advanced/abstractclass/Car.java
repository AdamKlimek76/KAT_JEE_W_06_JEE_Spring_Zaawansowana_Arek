package pl.coderslab.advanced.abstractclass;

public class Car extends Vehicle {
	private String type;

	public Car(Integer maxSpeed, String model, String type) {
		super(maxSpeed, model);
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car{"
				+ "maxSpeed: " + this.getMaxSpeed() + " "
				+ "model: " + this.model + " "
				+ "type: " + this.type + "}";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
