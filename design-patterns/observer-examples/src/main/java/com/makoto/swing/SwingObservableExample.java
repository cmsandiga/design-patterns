package com.makoto.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * This is a example how swing works with observer design pattern
 * 
 * @author makoton
 * 
 */
public class SwingObservableExample
{
	JFrame jFrame;
	
	public static void main(String[] args)
	{
		SwingObservableExample soe =new SwingObservableExample();
		soe.go();
	}
	
	public void go()
	{
		this.jFrame = new JFrame();
		
		JButton btnShouldDoI = new JButton("Should do I?");
		btnShouldDoI.addActionListener(new AngelListener());
		btnShouldDoI.addActionListener(new DevilListener());
		
		jFrame.add(btnShouldDoI); 			
		jFrame.setBounds(500, 500, 500, 500);
		jFrame.setVisible(true);
		
	}
	
	class AngelListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("Don't do it, you might regret it");			
		}		
	}
	
	class DevilListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("Comon do it");			
		}		
	}
	
}
