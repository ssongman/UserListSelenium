package com.song.account;

public class ���� {

	private double �ܾ�=0;

	public double get�ܾ�() {
		return �ܾ�;
	}

	public void �Ա���(double �ݾ�) {
		this.�ܾ� += �ݾ�;		
	}

	public void ������(double �ݾ�) {
		if(�ܾ� < �ݾ�) {
			throw new IllegalArgumentException("���� �����");
		}
		this.�ܾ� -= �ݾ�;	
	}

}
