public class Sphere extends Shape {
	// Attributes
	double Radius;
	// Constructor
	public Sphere (double Radius) {
		this.Radius = Radius;				
	}
	// Methods
	public double surface_area() {
		double r2 = Math.pow(Radius, 2);
		double pir2 = Math.PI * r2;
		double surface_area = 4 * pir2;
		return surface_area;
	}
	public double volume() {
		double r3 = Math.pow(Radius, 3);
		double pir3 = Math.PI * r3;
		double volume = (4/3) * pir3;
		return volume;
	}
	@Override
	public String toString() {
		return "Sphere{Surface Area: " + surface_area() + ", Volume: " + volume() + "}";
	}
}