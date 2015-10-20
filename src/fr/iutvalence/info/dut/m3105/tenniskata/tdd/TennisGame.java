package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	public static String SCORE_DEFAULT = "Love-all";
	public static String scoreForJ1 ="Fifteen-love";
	public static String scoreForJ2 = "love-Fifteen";
	private String score;
	
	public TennisGame()
	{
		this.score=SCORE_DEFAULT;
	}
	
	public String getscore() 
	{
		return this.score;
	}
	
	public void setscore(String score)
	{
		this.score=score;
	}
}
