package starter;

import visualization.Visualization;
import model.CellularAutomat;

 

public class Program {

	static int Width = 80;
	static int Height = 25;

	public static void main(String[] args) {
		System.out.println("run");

		CellularAutomat a = new CellularAutomat(Height, Width);
		Visualization v = Visualization.getVisualization();

		try {
			int i = 0;
			while(a.getCountObject() != 0) {
				System.out.println("step: " + i);
				
				a.step();
				v.toReflect(a);
				Thread.sleep(200);				
				
				i++;
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
