package ua.lviv.logos;

public class Circle {

	public double radius;
	public double diameter;

	Circle() {
		this.radius = 3;
		this.diameter = 6;
	}

	public double areacalc() {
		return (3.14 * (diameter * 2)) / 4;
	}

	public double widthcalc() {
		return (2 * 3.14) * radius;

	}
}
