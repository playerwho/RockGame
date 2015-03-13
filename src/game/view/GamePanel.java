package game.view;

import game.controller.GameAppController;
import game.model.Game;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;


public class GamePanel extends JPanel
{	
		/**
		 * connects app controller to base controller
		 */
		private GameAppController baseController;
		
		/**
		 * adds a button to the panel
		 */
		private JButton rockButton;
		private JButton scissorsButton;
		private JButton paperButton;
		
		
		/**
		 * adds a text field to the panel
		 */
		private JTextField firstTextField;
		
		/**
		 * changes layout of the panel
		 */
		private SpringLayout baseLayout;

		
		
		
		
		
		
		/**
		 * connects chatbot panel to base controller
		 * @param baseController on the panel is the same as baseController on the appController
		 */
		public GamePanel(GameAppController baseController)
		{
			this.baseController = baseController;
			
			rockButton = new JButton("Rock");
			scissorsButton = new JButton("Scissors");
			paperButton = new JButton("Paper");
			firstTextField = new JTextField();
			baseLayout = new SpringLayout();
			
			
			
			
			setupLayout();
			setupPane();
			setupPanel();
			setupListeners();
		}
		
		/**
		 * sets up window pane
		 */
		private void setupPane()
		{
			firstTextField.setBackground(Color.YELLOW);
			
			
			
		}
		
		/**
		 * sets up the panel view
		 */
		private void setupPanel()
		{
			
			this.setLayout(baseLayout);
			this.setSize(700, 400);
			this.add(rockButton);
			this.add(scissorsButton);
			this.add(paperButton);
			this.add(firstTextField);
			this.setBackground(Color.CYAN);
			
		}
		
		/**
		 * sets up the layout view
		 */
		private void setupLayout()
		{
			baseLayout.putConstraint(SpringLayout.WEST, rockButton, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, rockButton, -178, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.NORTH, scissorsButton, 0, SpringLayout.NORTH, rockButton);
			baseLayout.putConstraint(SpringLayout.WEST, scissorsButton, 17, SpringLayout.EAST, rockButton);
			baseLayout.putConstraint(SpringLayout.NORTH, paperButton, 0, SpringLayout.NORTH, rockButton);
			baseLayout.putConstraint(SpringLayout.WEST, paperButton, 19, SpringLayout.EAST, scissorsButton);
		}
		
		/**
		 * listens for a button click
		 */
		private void setupListeners()
		{
			
			rockButton.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent Click)
				{
					boolean ispRock = true;
					boolean ispScissor = false;
					boolean ispPaper = false;
					
				}

			});
			
			scissorsButton.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent Click)
				{
					
					boolean ispRock = false;
					boolean ispScissor = true;
					boolean ispPaper = false;
					
				}

			});
			
			paperButton.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent Click)
				{
					boolean ispRock = false;
					boolean ispScissor = false;
					boolean ispPaper = true;
					
				}

			});
		}
}
