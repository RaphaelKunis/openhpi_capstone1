package de.raphaelkunis.capstone1.firstmvc.model;

import de.raphaelkunis.capstone1.firstmvc.view.Observer;

public interface Subject {
	void attach(Observer observer);
	void notifyAllObservers();
}
