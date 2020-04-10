package com.manufacturer.view.client;

import com.manufacturer.model.frame.CanvasFrame;
import com.manufacturer.model.frame.MetallicPictureFrame;
import com.manufacturer.model.frame.WoodPictureFrame;
import com.manufacturer.model.frameShape.FrameShape;
import com.manufacturer.model.frameShape.Square;

public class PictureFrameClient {

	public static void main(String[] args) {
		//Bridge Pattern implemented here
		FrameShape frame1 = new Square("Amber", 12.5, 15.5, new CanvasFrame());
		FrameShape frame2 = new Square("Hazel", 24.3, 9.5, new MetallicPictureFrame());
		FrameShape frame3 = new Square("Magenta", 5.5, 8.5, new WoodPictureFrame());
		
		//Production in progress
		System.out.println("\t\t\t******************* PRODUCTION IN PROGRESS *******************");
		//Calling craft method from instantiation
		frame1.craft();
		frame1.manufacturedBy();
		System.out.println("--------");
		frame2.craft();
		frame2.manufacturedBy();
		System.out.println("--------");
		frame3.craft();
		frame3.manufacturedBy();
		System.out.println("--------");
	}

}
