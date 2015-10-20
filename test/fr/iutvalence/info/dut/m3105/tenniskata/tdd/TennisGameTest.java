package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	
	@Test
	public void aSimpleBeginningTest()
	{
		TennisGame game1= new TennisGame() ;
		Assert.assertEquals(game1.getscore(),"Love-all");
	}

}
