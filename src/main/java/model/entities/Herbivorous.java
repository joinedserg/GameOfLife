package model.entities;

import rules.RuleAging;
import rules.RuleStarve;

public class Herbivorous extends Specimen {


	public Herbivorous(int xPos, int yPos) {
		super(xPos, yPos);

		this.rulesOneself.add(new RuleAging());
		this.rulesOneself.add(new RuleStarve());

		this.type = Type.HERBIVORUS;
	}

	/*@Override
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