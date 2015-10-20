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
	public void aSecondTestWhereTheServerWinTheFirstPoint()
	{
		game1.setscore(TennisGame.scoreForJ1);
		Assert.assertEquals(game1.getscore(),"Fifteen-love");
	}
}
