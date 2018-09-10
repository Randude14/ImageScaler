package com.randude14.imagescaler;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImageScaler {

	public static void main(String[] args) throws Exception {		
		
		final JFrame frame = new JFrame("Test frame");
		
		JButton button = new JButton("Test Button");
		button.setEnabled(true);
		button.addActionListener((ActionEvent e) -> {
			
			System.out.println("Test");
			
		});
		
		for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
	        if ("Windows".equals(info.getName())) {
	            UIManager.setLookAndFeel(info.getClassName());
	            System.out.println(info.getName());
	            break;
	        }
	    }
		
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.add(button, BorderLayout.NORTH);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * Old code from my program
		 * NOTE: some will be used and some will be deleted.
		 * 
		 */
		
		// TODO: rewrite to be used in a custom GUI
		/*
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Choose image file to enlarge.");
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "jpg", "gif", "png");
		chooser.setFileFilter(filter);
		
		
		int choice = chooser.showOpenDialog(null);
		File file = null;
		BufferedImage image = null;
		if(choice == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		}
		
		String string = JOptionPane.showInputDialog("How much do you want to enlarge the image?");
		int enlargeBy = Integer.parseInt(string);
		
		if(enlargeBy < 2) {
			return;
		}
		
		
		if(file != null) {
			image = ImageIO.read(file);
			int width = image.getWidth();
			int height = image.getHeight();
			BufferedImage saveTo = new BufferedImage(width * enlargeBy, height * enlargeBy, BufferedImage.TYPE_INT_RGB);
			
			for(int x = 0;x < width;x++) {
				for(int y = 0;y < height;y++) {
					int rgb = image.getRGB(x, y);
					for(int xx = 0;xx < enlargeBy;xx++) {
						for(int yy = 0;yy < enlargeBy;yy++) {
							int ix = (x * enlargeBy) + xx;
							int iy = (y * enlargeBy) + yy;
							saveTo.setRGB(ix, iy, rgb);
						}
					}
				}
			}
			
			File parent = file.getParentFile();
			String fileName = file.getName();
			String name = fileName.substring(0, fileName.lastIndexOf('.'));
			File saveFile = new File(parent, name + "." + saveTo.getWidth() + "-" + saveTo.getHeight() + ".png");
			ImageIO.write(saveTo, "png", saveFile);
			
			JOptionPane.showMessageDialog(null, "The new enlarged image has been saved to " + saveFile);
	    }
	*/
    }
	
}
