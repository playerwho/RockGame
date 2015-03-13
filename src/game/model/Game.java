package game.model;

public class Game
{
	private boolean pRock;
	private boolean pPaper;
	private boolean pScissor;
	private boolean cRock;
	private boolean cPaper;
	private boolean cScissor;
    private int wins;
    
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
	
}
