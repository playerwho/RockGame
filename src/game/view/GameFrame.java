package game.view;

import game.controller.GameAppController;
import javax.swing.JFrame;

public class GameFrame extends JFrame
{
	
	private GamePanel basePanel;
		
		
	public GameFrame(GameAppController baseController)
	{
		basePanel = new GamePanel(baseController);
		
		setupFrame();
	}

		/**
		 * sets up the frame of the panel
		 */
		private void setupFrame()
		{
			this.setContentPane(basePanel);
			this.setSize(700, 400);
			setVisible(true);
		}
}
