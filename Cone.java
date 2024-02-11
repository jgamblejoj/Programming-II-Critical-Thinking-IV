public class Cone extends Shape {
	// Attributes
	double Radius;
	double Height;
	// Constructor
	public Cone(double Radius, double Height) {
		this.Radius = Radius;
		this.Height = Height;
	}
	// Methods
	public double surface_area() {
		double r = this.Radius;
		double r2 = Math.pow(Radius, 2);
		double h2 = Math.pow(Height, 2);
		double pi = Math.PI;
		double r2h2 = r2 + h2;
		double l = Math.sqrt(r2h2);
		double surface_area = (pi * r2) + (pi * r * l);
		return surface_area;
	}
	public double volume() {
		double r2 = Math.pow(Radius, 2);
		double h = this.Height;
		double pi = Math.PI;
		double volume = (1.0/3.0) * pi * r2 * h;
		return volume;
	}
	@Override
	public String toString() {
		return "Cone{Surface Area: " + this.surface_area() + ", Volume: " + this.volume() + "}";
	}
}