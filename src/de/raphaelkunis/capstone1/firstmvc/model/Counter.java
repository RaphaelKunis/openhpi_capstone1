package de.raphaelkunis.capstone1.firstmvc.model;

import java.util.ArrayList;

import de.raphaelkunis.capstone1.firstmvc.view.Observer;

public class Counter implements Subject {

	private int count;
	
	ArrayList<Observer> observers = new ArrayList<Observer>();
		
	@Override
	public void attach(Observer observer) {
		this.observers.add(observer);		
	}

	@Override
	public void notifyAllObservers() {
		for (Observer o : observers) {
			o.update(count);		// Update
		}
	}

	public int getCount() {
		return count;
	}

	public void increaseCount() {
		this.count++;
		notifyAllObservers();
	}

	public void decreaseCount() {
		this.count--;
		notifyAllObservers();
	}
}
