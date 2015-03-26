package game.controller;

import javax.swing.JOptionPane;

import game.view.GameFrame;
import game.model.Game;

public class GameAppController
{
	private boolean pRock;
	private boolean pPaper;
	private boolean pScissor;
	private boolean cRock;
	private boolean cPaper;
	private boolean cScissor;
    private int wins;
    private int ties;
    private int loses;
    private String computer;
    private Game myGame;
    private GameFrame appFrame;
	private String startMessage;
    
	public boolean ispRock()
	{
		return pRock;
	}
	public boolean ispPaper()
	{
		return pPaper;
	}
	public boolean ispScissor()
	{
		return pScissor;
	}
	public boolean iscRock()
	{
		return cRock;
	}
	public boolean iscPaper()
	{
		return cPaper;
	}
	public boolean iscScissor()
	{
		return cScissor;
	}
	public int getWins()
	{
		return wins;
	}
	
	public int getTies()
	{
		return ties;
	}
	public int getLoses()
	{
		return loses;
	}
	public String getComputer()
	{
		return computer;
	}
	
	public void setpRock(boolean pRock)
	{
		this.pRock = pRock;
	}
	public void setpPaper(boolean pPaper)
	{
		this.pPaper = pPaper;
	}
	public void setpScissor(boolean pScissor)
	{
		this.pScissor = pScissor;
	}
	public void setcRock(boolean cRock)
	{
		this.cRock = cRock;
	}
	public void setcPaper(boolean cPaper)
	{
		this.cPaper = cPaper;
	}
	public void setcScissor(boolean cScissor)
	{
		this.cScissor = cScissor;
	}
	public void setWins(int wins)
	{
		this.wins = wins;
	}
	public void setTies(int ties)
	{
		this.ties = ties;
	}
	public void setLoses(int loses)
	{
		this.loses = loses;
	}
	public void setComputer(String computer)
	{
		this.computer = computer;
	}
	
	public Game getMyGame()
	{
		return myGame;
	}
	
	public void setMyGame(Game myGame)
	{
		this.myGame = myGame;
	}
	
	public GameAppController()
	{
		appFrame = new GameFrame(this);
		myGame = new Game(this);
		startMessage = "Click a button to start playing the game!";
	}
	
	public void computerChoice()
	{
		cRock = false;
		cPaper = false;
		cScissor = false;
		
		int myRandom = (int) (Math.random()* 3);
		if(myRandom == 0)
		{
			cRock = true;
			//System.out.println("is rock");
		}
		else if(myRandom == 1)
		{
			cPaper = true;
			//System.out.println("is paper");
		}
		else if(myRandom == 2)
		{
			cScissor = true;
			//System.out.println("is scissor");
		}		
	}

	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, startMessage);
	}
	
	
}

	