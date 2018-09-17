package de.raphaelkunis.capstone1.firstmvc.view;

import de.raphaelkunis.capstone1.firstmvc.model.Counter;
import processing.core.PApplet;

public class CounterView extends Observer {
	
	public CounterView(PApplet display, Counter ctr) {
		super(display,ctr);
		update(ctr.getCount());
	}
	
	@Override
	public void update(Object o) {
		int val;
		try {
			val = (int) o;
		} catch(ClassCastException e) {
			System.out.println("ClassCastException: Setting x to zero");
			val = 0;
		}
		display.fill(0);
		display.background(204);
		display.rect(val, 10, 10, 10);
		display.redraw();
	}

}
