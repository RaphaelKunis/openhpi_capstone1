package de.raphaelkunis.capstone1.firstmvc.controller;

import de.raphaelkunis.capstone1.firstmvc.model.Counter;
import de.raphaelkunis.capstone1.firstmvc.model.MouseMove;

public class CounterController {

	Counter ctr;

	public CounterController(Counter ctr) {
		this.ctr = ctr;
	}
	
	public void handleMClickEvent () {
		ctr.increaseCount();
	}
	
	public void handleMMoveEvent (MouseMove m) {
		switch (m) {
			case RIGHT: ctr.increaseCount(); break;
			case LEFT:  ctr.decreaseCount(); break;			
			case NONE: break;
		}
	}
	
	public void handleKeyEvent(int keyCode) {
		System.out.println(keyCode);
		if (keyCode == 39) ctr.increaseCount();
		if (keyCode == 37) ctr.decreaseCount();			
	}
}
