package com.bridgelabz.designpattern.behavioural.observer;

import javax.security.auth.Subject;

public interface Observer {
	
	//method to update the observer, used by subject
	public void update();
	
	//attach with subject to observe
	public void setSubject(Subject sub);

	public void setSubject(MyTopic topic);
}
