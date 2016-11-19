package visualization;

import model.CellularAutomat;
import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.wswing.*;

import model.entities.Cell; 


public class Visualization {

	static Visualization viz;
	ConsoleSystemInterface cons; 
	//singleton :-)
	public static Visualization getVisualization() {
		
		if(viz == null) {
			viz = new Visualization();
		}
		return viz;
	}
	
	private Visualization() {
		cons = new WSwingConsoleInterface("LUCK - libjcsi Testing Grounds", true);
		//cons.print(1,1,"Hello, Hello!", ConsoleSystemInterface.CYAN);
	}
	
	public void toReflect(CellularAutomat a) {
		cons.cls();
		cons.refresh();
		cons.flushColorTable();
		System.out.println("toReflect");
		//int i = 0;
		for(Cell c : a.getCurrentPosition()) {
			int x = c.getX();
			//System.out.println("i = " + i + " " + x);
			//i++;
			//cons.print(1,1,"Hello, Hello!", ConsoleSystemInterface.CYAN);
			cons.print(c.getX(), c.getY(), "*", c.getColor());
		}		
		
	}
	
}
