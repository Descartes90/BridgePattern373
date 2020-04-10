package com.manufacturer.model.frameShape;

import com.manufacturer.model.frame.PictureFrame;

public abstract class FrameShape {
	public PictureFrame pictureFrame;
	
	//creating a frame shape constructor with parameter of type pictureFrame
	public FrameShape (PictureFrame pictureFrame) {
		this.pictureFrame = pictureFrame;
	}
	
	public abstract void craft();
	
	public abstract void manufacturedBy();
}
