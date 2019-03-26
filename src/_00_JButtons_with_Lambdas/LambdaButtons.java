package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
		
		addNumbers.addActionListener((e)->{
			System.out.println("This gonna add two numbers");
		});
		randNumber.addActionListener((e)->{
			System.out.println("This is gonna give a random number");
		});
		tellAJoke.addActionListener((e)->{
			System.out.println("Why did the chicken cross the road? ");
		});
		
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	
	
}
