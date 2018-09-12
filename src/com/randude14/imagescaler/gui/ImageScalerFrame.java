package com.randude14.imagescaler.gui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class ImageScalerFrame extends JFrame {
	
	private static final long serialVersionUID = 6713363497864116054L;

	public ImageScalerFrame(String title, int midWidth, int minHeight) {
		super(title);
		setMinimumSize(new Dimension(midWidth, minHeight));
		
	}
	
}
