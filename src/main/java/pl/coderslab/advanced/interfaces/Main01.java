package pl.coderslab.advanced.interfaces;

public class Main01 {
	public static void main(String[] args) {
		Movable[] movables = new Movable[4];
		movables[0] = new Car();
		movables[1] = new Cat();
		movables[2] = new Student();
		movables[3] = new Admin();

		for(Movable movable : movables) {
			movable.start();
		}
	}
}
