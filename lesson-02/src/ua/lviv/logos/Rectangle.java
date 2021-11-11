package ua.lviv.logos;

public class Rectangle {

	public int width;
	public int height;

	Rectangle() {
		this.width = 12;
		this.height = 9;
	}

	Rectangle(int width, int height) {
		this.width = 15;
		this.height = 11;
	}

	public int areacalc() {
		return width * height;

	}

	public int perimetercalc() {
		return 2 * (width + height);

	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
