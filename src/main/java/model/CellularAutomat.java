package model;

import java.util.*;
import model.entities.*;

public class CellularAutomat {

	List<Cell> cells;
	Board board;
	
	/**/
	List<Plant> plants;
	List<Herbivorous> herbivorous;
	List<Predator> predators;

	int countPlants;
	int countHerbivorous;
	int countPredators;

	int maxX;
	int maxY;


	//default sample
	public CellularAutomat(int width, int height) {
		cells = new ArrayList();
		try {
			board = Board.init(width, height);
		}
		catch(Exception ex) {
			board = Board.getBoard();
		}
		//plants = new ArrayList();
		//herbivorous = new ArrayList();
		//predators = new ArrayList();


		cells.add(new Plant(0,2));
		cells.add(new Plant(0,4));
		cells.add(new Plant(0,4));
		cells.add(new Plant(0,3));
		cells.add(new Herbivorous(4,4));
		cells.add(new Predator(5,6));		


		this.maxX = height;
		this.maxY = width;

		updateCount();
	}

	void updateCount() {
		countPlants = 0; countHerbivorous = 0; countPredators = 0;
		for(Cell c : cells) {
			if(c.getClass() == Plant.class) {
				countPlants++;
			}
			else if(c.getClass() == Herbivorous.class) {
				countHerbivorous++;
			}
			else if(c.getClass() == Predator.class) {
				countPredators++;
			}
		}

	}

	public CellularAutomat(String path2config) {


	}

	public int getCountObject() {
		return cells.size();
	}
	
	public String toString() {
		return "Status : plants: " + countPlants + "  herbivorous: " + countHerbivorous 
				+ "  predator:  " + countPredators;
	}

	public void step() {
		int i = 0;

		for(Iterator<Cell> itr = cells.iterator(); itr.hasNext();) {
			Cell c = itr.next();

			c.applyRule(board);			
			if(c.isDeath()) {
				System.out.println("Object " + c);
				itr.remove();
				continue;
			}

			if(c.speed == 0) {
				continue;
			}

			if(c.getX() == 0) {
				c.speed = 1;
			}
			else if(c.getX() == maxX-1) {
				c.speed = -1;
			}
			int x = c.getX();
			x += c.speed; 

			c.setX(x);
			i++;
			
		}
		updateCount();
		System.out.println(this);
	}


	public List<Cell> getCurrentPosition() {
		return cells;
	}

}
