package game.controller;

import javax.swing.JOptionPane;
import game.view.GameFrame;
import game.model.Game;

public class GameAppController
{
	private GameFrame appFrame;
	private String startMessage;

	public GameAppController()
	{
		appFrame = new GameFrame(this);
		startMessage = "Click a button to start playing the game!";
	}

	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, startMessage);
	}

	public void computerChoice()
	{
		int randomChoice = (int) (Math.random() * 2);

		boolean iscPaper;
		boolean iscRock;
		boolean iscScissor;
		if (randomChoice == 0)
		{
			iscPaper = true;
			iscRock = false;
			iscScissor = false;

		} else if (randomChoice == 1)
		{
			iscRock = true;
			iscScissor = false;
			iscPaper = false;
		} else if (randomChoice == 2)
		{
			iscScissor = true;
			iscRock = false;
			iscPaper = false;
		}

	}

	public int gameWins()
	{
		boolean ispRock;
		boolean ispPaper;
		boolean ispScissor;
	    boolean iscRock;
		boolean iscPaper;
		boolean iscScissor;
		
		int wins = 0;
		
		if((ispRock = true) && (iscScissor = true))
		{
			wins ++;
			computerChoice();
		}
		if((ispScissor = true) && (iscPaper = true))
		{
			wins ++;
			computerChoice();
		}
		if((ispPaper = true) && (iscRock = true))
		{
			wins ++;
			computerChoice();
		}
		
		return wins;
	}
}
