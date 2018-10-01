package com.song.account;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class °èÁÂTest {
	
	@Test
	public void shouldHaveZeroBalanceAferOpeningANewAccount() {
		°èÁÂ account = new °èÁÂ();
		double current = account.getÀÜ¾×();
		assertEquals(0, current, 0.00001);		
	}
	
	@Test
	public void shouldAddMoneyAfterDeposit() {
		°èÁÂ account = new °èÁÂ();
		account.ÀÔ±İÇÔ(123.45);
		assertEquals(123.45, account.getÀÜ¾×(), 0.00001);
		
		account.ÀÔ±İÇÔ(200);
		assertEquals(323.45, account.getÀÜ¾×(), 0.00001);
	}
	
	@Test
	public void shouldSubstractAmountAfterWithraw() {
		°èÁÂ account = new °èÁÂ();
		account.ÀÔ±İÇÔ(100);
		account.ÀÎÃâÇÔ(60);
		assertEquals(40, account.getÀÜ¾×(), 0.00001);
	}
	
//	@Test(expected = IllegalArgumentException.class)
//	public void shouldThrowExceptionWhenThereIsNotEnoughMoney() {
//		°èÁÂ account = new °èÁÂ();
//		account.ÀÔ±İÇÔ(100);
//		account.ÀÎÃâÇÔ(140);
//	}

}
