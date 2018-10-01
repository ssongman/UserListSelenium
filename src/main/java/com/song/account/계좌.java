package com.song.account;

public class 계좌 {

	private double 잔액=0;

	public double get잔액() {
		return 잔액;
	}

	public void 입금함(double 금액) {
		this.잔액 += 금액;		
	}

	public void 인출함(double 금액) {
		if(잔액 < 금액) {
			throw new IllegalArgumentException("돈이 없어요");
		}
		this.잔액 -= 금액;	
	}

}
