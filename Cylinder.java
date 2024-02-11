public class Cylinder extends Shape {
	// Attributes
	double Radius;
	double Height;
	// Constructor
	public Cylinder(double Radius, double Height) {
		this.Radius = Radius;
		this.Height = Height;
	}
	// Methods
	public double surface_area() {
		double r = this.Radius;
		double h = this.Height;
		double pi = Math.PI;
		double surface_area = (2 * pi * r) * (h + r);
		return surface_area;
	}
	public double volume() {
		double r = this.Radius;
		double h = this.Height;
		double pi = Math.PI;
		double volume = (Math.pow(r, 2) * pi) * h;
		return volume;
	}
	@Override
	public String toString() {
		return "Cylinder{Surface Area: " + this.surface_area() + ", Volume: " + this.volume() + "}";
	}
}