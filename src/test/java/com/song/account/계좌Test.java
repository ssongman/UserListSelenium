package com.song.account;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ����Test {
	
	@Test
	public void shouldHaveZeroBalanceAferOpeningANewAccount() {
		���� account = new ����();
		double current = account.get�ܾ�();
		assertEquals(0, current, 0.00001);		
	}
	
	@Test
	public void shouldAddMoneyAfterDeposit() {
		���� account = new ����();
		account.�Ա���(123.45);
		assertEquals(123.45, account.get�ܾ�(), 0.00001);
		
		account.�Ա���(200);
		assertEquals(323.45, account.get�ܾ�(), 0.00001);
	}
	
	@Test
	public void shouldSubstractAmountAfterWithraw() {
		���� account = new ����();
		account.�Ա���(100);
		account.������(60);
		assertEquals(40, account.get�ܾ�(), 0.00001);
	}
	
//	@Test(expected = IllegalArgumentException.class)
//	public void shouldThrowExceptionWhenThereIsNotEnoughMoney() {
//		���� account = new ����();
//		account.�Ա���(100);
//		account.������(140);
//	}

}
