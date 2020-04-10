package com.manufacturer.model.frameShape;

import com.manufacturer.model.frame.PictureFrame;

public class Square extends FrameShape {
	
	private String color;
	private double width;
	private double height;

	public Square (String color, double width, double height, PictureFrame pictureFrame) {
		super(pictureFrame);
		this.color = color;
		this.width = width;
		this.height = height;
	}
	@Override
	//Produces picture with specifications in parameters
	public void craft() {
		pictureFrame.producePicture(color, width, height);
		
	}

	@Override
	//Stamp of company on program
	public void manufacturedBy() {
		System.out.println("Manufactured by: Elite Photos Inc.");
		
	}

}
