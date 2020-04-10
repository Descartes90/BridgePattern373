package com.manufacturer.model.frame;

public interface PictureFrame {
	
	public void producePicture(String color, double width, double height);
	public void setColor(String color);
	public String getColor();
	public void setWidth(double width);
	public double getWidth();
	public void setHeight(double height);
	public double getHeight();
}

