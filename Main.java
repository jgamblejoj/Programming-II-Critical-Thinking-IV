//import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// Array
		Shape[] shapeArray = new Shape[3];
		// Instantiate Shapes
			// Sphere
		Sphere basketBall = new Sphere(4.7);
			// Cylinder
		Cylinder canOfCoke = new Cylinder(1.25, 5);
			// Cone
		Cone iceCreamCone = new Cone(1.5, 4);
		// Store shapes in shapeArray
		shapeArray[0] = basketBall;
		shapeArray[1] = canOfCoke;
		shapeArray[2] = iceCreamCone;
		// System print statement
		System.out.println("SHAPE ARRAY:");
		// Iterate through shapeArray and print object's toString methods
		for (int i = 0; i < shapeArray.length; i++) {
			System.out.println("\t" + shapeArray[i].toString());
		}
	}
}