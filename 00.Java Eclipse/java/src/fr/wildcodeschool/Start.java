package fr.wildcodeschool;

import java.io.IOException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class Start {

	 public static void main(String [] args) throws IOException {
	     System.out.println(ProcessHandle.current().pid());

	     JFrame jf = new JFrame("Gotcha!");
	     jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	     jf.add(new JLabel((Icon) new ImageIcon(new URL("https://cdn.pixabay.com/photo/2016/11/19/14/00/code-1839406_1280.jpg"))));
	     jf.pack();
	     jf.setVisible(true);
	 }

}
