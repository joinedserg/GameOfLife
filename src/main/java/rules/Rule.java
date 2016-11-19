package rules;

import model.entities.Specimen;
import model.Board;

public abstract class Rule {
	
	abstract public void apply(Specimen c, Board b);
}
