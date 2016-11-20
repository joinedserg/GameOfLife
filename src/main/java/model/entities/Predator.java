package model.entities;

import rules.RuleAging;
import rules.RuleBirth;
import rules.RuleMove2Eat;
import rules.RuleStarve;

public class Predator extends Specimen {


	public Predator(int xPos, int yPos) {
		super(xPos, yPos);
		
		this.rulesOneself.add(new RuleAging());
		this.rulesOneself.add(new RuleStarve());
		this.rulesOneself.add(new RuleBirth());
		this.rulesOneself.add(new RuleMove2Eat());
		this.maxSpeed = 20;
		this.currentSpeed = this.maxSpeed;
		this.type = Type.PREDATOR;
	}

	@Override
	public Cell birth(Specimen parent2, int xPos, int yPos) {
		child = new Predator(xPos, yPos);		
		return child;
	}
	
	@Override
	public int getSight() {
		return currentSpeed + currentSight;
	}
	
	/*
	@Override
	public void stepHunger() {
		if(isDeath == true) {
			return;
		}
		
		this.hunger++;
		if(hunger > limitHunger2) {
			currentHealth -= hunger;
			if(currentHealth <= 0) {
				isDeath = true;
				status = "He died of hunger";
			}
		}
		else if(hunger > limitHunger1) {
			//
		}
	}*/




}
