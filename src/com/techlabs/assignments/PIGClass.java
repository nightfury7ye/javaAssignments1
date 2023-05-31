package com.techlabs.assignments;

public class PIGClass {
	int turn, total;
	boolean end;
	public PIGClass(int turn, int total, boolean end) {
		this.turn = turn;
		this.total = total;
		this.end = end;
	}
	public PIGClass() {
		
	}
	public int getTurn() {
		return turn;
	}
	public void setTurn(int turn) {
		this.turn = turn;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public boolean isEnd() {
		return end;
	}
	public void setEnd(boolean end) {
		this.end = end;
	}
}
