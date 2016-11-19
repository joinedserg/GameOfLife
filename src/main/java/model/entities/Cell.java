package model.entities;

import net.slashie.libjcsi.ConsoleSystemInterface;
import model.Board;

abstract public class Cell {
	protected Type type;
	protected int x,y;
	protected boolean isDeath;
	protected String status = "";
	
	public int speed = 1; 
	
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
		isDeath = false;
	}
	
	public void applyRule(Board b) {
		
	}
	
	public void kill() {
		isDeath = true;
	}
	
	public boolean isDeath() {
		return isDeath;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getColor() {
		switch(type) {
		case PLANT:
			return ConsoleSystemInterface.GREEN;
		case HERBIVORUS:
			
			return ConsoleSystemInterface.BLUE;
		case PREDATOR:
			return ConsoleSystemInterface.RED;
		}
		
		return ConsoleSystemInterface.GRAY;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String toString() {
		
		return type + " {" + x + "," + y + "} " + status;
	}
	
	
}
