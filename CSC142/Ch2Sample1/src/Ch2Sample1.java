import java.awt.Container;

/*
Chapter 2 Sample Program: Displaying a Window
File: Ch2Sample1.java
*/

//import javax.swing.JFrame;
import javax.swing.*;

class Ch2Sample1 {
	public static void	main(String[]	args	){
		
		JFrame    
			myWindow;
		myWindow = new JFrame();
		
		/*
		javax.swing.JFrame   
			myWindow;
		myWindow = new javax.swing.JFrame("");
		*/
//		myWindow.setLocation(50, 50);
//		myWindow.setSize(300, 200);
//		myWindow.setTitle("Program #2");
//		myWindow.setVisible(true);

		// Create a  JButton with  Close  text
		JButton closeButton  = new JButton("Close");
		Container contentPane = myWindow.getContentPane();
		contentPane.add(closeButton);
		
		// Show frame
		myWindow.setLocation(50, 50);
		myWindow.setSize(300, 200);
		myWindow.setTitle("Program #2");
		myWindow.setVisible(true);

	}
	
}