package com.rudra.spring36;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class IOCCloseEventListener implements ApplicationListener<ContextClosedEvent> {


	@Override
	public void onApplicationEvent(ContextClosedEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(" on IOC Close method");
	}

}
