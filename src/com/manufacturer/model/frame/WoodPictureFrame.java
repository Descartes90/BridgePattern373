package com.manufacturer.model.frame;

public class WoodPictureFrame implements PictureFrame {
	private String color;
	private double width;
	private double height;

	//Calls producePicture which prints a string with specifications
	@Override
	public void producePicture(String color, double width, double height) {
		System.out.println("Producing Wood picture frame with specifications: \t\t "
				+ "Color: " + color + "\n\t\t\t\t\t\t\t\t Width: " + width + "\n\t\t\t\t\t\t\t\t Height: " + height);
		
	}
	//Getters and setters
	@Override
	public void setColor(String color) {
		this.color = color;
		
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public void setHeight(double height) {
		this.height = height;
		
	}

	@Override
	public double getHeight() {
		return height;
	}

}
