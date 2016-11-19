package model;

import model.entities.Cell;
import java.util.*;

public class Board {
	
	static Board board;
	
	private Cell[][] cells;
	private int width;
	private int height;
	
	public static Board init(int width, int height) throws Exception {
		if(board != null) {
			throw new Exception("Board already init, use Board.getBoard()");
		}
		return new Board(width, height);
	}
	
	//TODO: ask4Ivan 1:-) 
	public static Board getBoard() /*throws Exception*/ {
		/*if(board == null) {
			throw new Exception("Board not init, use Board.init(width, height)");
		}*/
		
		return board;
	}
	
	private Board(int width, int height) {
		cells = new Cell[width][height];
		
		this.width = width;
		this.height = height;
	}
	
	public void toReflect(List<Cell> list) {
		cells = new Cell[width][height];
		
		for(Cell c : list) {
			cells[c.getX()][c.getY()] = c;
		}		
	}
	
	public Cell[][] getCells() {
		return cells;
	}
	
}
