package game.model;

import game.controller.GameAppController;

public class Game
{
	
	private GameAppController baseController;
	
	public Game(GameAppController baseController)
	{
		this.baseController = baseController;
	}

	public void determine()
	{
		int wins = baseController.getWins();
		int ties = baseController.getTies();
		int loses = baseController.getLoses();
		String computer = "";
		
		if(baseController.ispPaper() == true && baseController.iscRock() == false)
		{
			wins++;
			computer = "you paper cutted the rock";
			baseController.setComputer(computer);
			baseController.setWins(wins);
			System.out.println("WIN! you won this many games so far... ");
		}
		else if(baseController.ispRock() == true && baseController.iscScissor() == true)
		{
			wins++;
			computer = "crushing scissors since 1982";
			baseController.setComputer(computer);
			baseController.setWins(wins);
			System.out.println("WIN! you won this many games so far... ");
		}
		else if(baseController.ispScissor() == true && baseController.iscPaper() == true)
		{
			wins++;
			computer = "Classic scissor cut to paper";
			baseController.setComputer(computer);
			baseController.setWins(wins);
			System.out.println("WIN! you won this many games so far... ");
		}
		else if(baseController.ispPaper() == true && baseController.iscPaper() == true)
		{
			ties++;
			computer = "Computer chose paper too!";
			baseController.setTies(ties);
			baseController.setComputer(computer);
		}
		else if(baseController.ispRock() == true && baseController.iscRock() == true)
		{
			ties++;
			computer = "Computer chose rock too!";
			baseController.setTies(ties);
			baseController.setComputer(computer);
		}
		else if(baseController.ispScissor() == true && baseController.iscScissor() == true)
		{
			ties++;
			computer = "Computer chose scissors too!";
			baseController.setTies(ties);
			baseController.setComputer(computer);
		}
		else
		{
			loses++;
			computer = null;
			baseController.setComputer(computer);
			baseController.setLoses(loses);
			System.out.println("you lose D: games won so far...");
		}
	}
}
