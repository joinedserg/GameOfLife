package model.entities;

import rules.RuleAging;
import rules.RuleStarve;



public class Plant extends Specimen {
	
	public Plant(int xPos, int yPos) {
		super(xPos, yPos);
		
		this.rulesOneself.add(new RuleAging());
		speed = 0;
		this.type = Type.PLANT;
	}

}
