package minesweeper;

import javax.swing.JButton;

public class Btn extends JButton {
	private int row; // mine location
	private int column; // mine location
	private int count; // how many mines are around
	private boolean isMined; // is the area mined
	private boolean isFlagged; // is the area flagged
	
	// constructor
	public Btn(int row, int column) {
		super();
		this.row = row;
		this.column = column;
		this.count = 0;
		this.isMined = false; 
		this.isFlagged = false;
	}
	
	// encapsulation
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isMined() {
		return isMined;
	}

	public void setMined(boolean isMined) {
		this.isMined = isMined;
	}

	public boolean isFlagged() {
		return isFlagged;
	}

	public void setFlagged(boolean isFlagged) {
		this.isFlagged = isFlagged;
	}
	
	
	
	
}
