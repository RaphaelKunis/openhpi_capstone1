package de.raphaelkunis.capstone1.firstmvc;

import de.raphaelkunis.capstone1.firstmvc.controller.CounterController;
import de.raphaelkunis.capstone1.firstmvc.model.Counter;
import de.raphaelkunis.capstone1.firstmvc.view.CounterView;
import de.raphaelkunis.capstone1.firstmvc.view.Observer;
import processing.core.PApplet;

public class TheApp extends PApplet {

	private Observer ctrView;
	private CounterController ctrController;
	private Counter ctr;
	Mouse mouse;
	
	@Override
	public void settings() {
		size(200,200);
	}
	
	@Override
	public void setup() {
		frameRate(30);
		ctr = new Counter();
		ctrController = new CounterController(ctr);
		ctrView = new CounterView(this, ctr);
		mouse = new Mouse();
	}
	
	@Override
	public void draw() {}
	
	@Override 
	public void mouseClicked() {
		ctrController.handleMClickEvent();
	}
	
	@Override 
	public void mouseMoved() {
		mouse.setCurPosX(this.mouseX);
		ctrController.handleMMoveEvent(mouse.getMove());
	}
	
	@Override
	public void keyPressed() {
		ctrController.handleKeyEvent(keyCode);
	}
}

