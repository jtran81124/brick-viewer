package business;

import framework.Model;

public class Brick extends Model{
	private double length;
	private double width;
	private double height;
	
	public Brick()
	{
		length = 50;
		width = 50;
		height = 50;
	}
	public Brick(double length, double width, double height)
	{
		this.length = length;
		this.width = width;
		this.height = height; 
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) throws Exception{
		if (length < 1)
		{
			throw new Exception("Number is Negative");
		}
		this.length = length;
		this.changed();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) throws Exception {
		if (width < 1)
		{
			throw new Exception("Number is Negative");
		}
		this.width = width;
		this.changed();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) throws Exception{
		if (height < 1)
		{
			throw new Exception("Number is Negative");
		}
		this.height = height;
		this.changed();
	}

}
