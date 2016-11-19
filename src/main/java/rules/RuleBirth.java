package rules;

import model.entities.Specimen;
import model.Board;

public class RuleBirth extends Rule {

	@Override
	public void apply(Specimen c, Board b) {
		
		
	}
	
	void stepBirth(Specimen c, Board b) {
		int lastBirth = c.getLastBirth();
		
		
		if(lastBirth == Specimen.periodBirth) {
			
		}
		
	}
	
}
