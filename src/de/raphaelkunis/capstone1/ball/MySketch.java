package de.raphaelkunis.capstone1.ball;

import java.util.ArrayList;

import processing.core.PApplet;

public class MySketch extends PApplet {

	private ArrayList<Ball> balls = new ArrayList<>();
	
	public void settings() {
		size(1800, 1000);
	}

	public void draw(){
		background(64);
		// ellipse(mouseX, mouseY, 20, 20);
		for(Ball b : balls){
			b.step();
			b.render();
		}
	}
  
	public void mouseDragged(){
		balls.add(new Ball(this, mouseX, mouseY));
	}
	
	public static void main(String[] passedArgs) {
		String[] appletArgs = new String[] { "MySketch" };
		PApplet.main(appletArgs);
    }
}