package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	TennisGame game1= new TennisGame() ;
	@Test
	public void aSimpleBeginningTest()
	{
		Assert.assertEquals(game1.getscore(),"Love-all");
	}
	
	@Test
	public void aSecondTestWhereTheServerWonTheFirstPoint()
	{
		game1.setscore(TennisGame.scoreForJ1);
		Assert.assertEquals(game1.getscore(),"Fifteen-love");
	}
	
	@Test
	public void aThirdTestWhereTheReceiverWonTheFirstPoint()
	{
		game1.setscore(TennisGame.scoreForJ2);
		Assert.assertEquals(game1.getscore(),"love-Fifteen"); 
	}
}
