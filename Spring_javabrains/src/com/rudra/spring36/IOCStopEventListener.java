package com.rudra.spring36;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class IOCStopEventListener implements ApplicationListener<ContextStoppedEvent> {


	@Override
	public void onApplicationEvent(ContextStoppedEvent CSE) {
		// TODO Auto-generated method stub
		System.out.println(" ON stop .. method call");
	}

}
