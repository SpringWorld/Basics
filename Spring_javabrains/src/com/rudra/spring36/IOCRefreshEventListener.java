package com.rudra.spring36;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class IOCRefreshEventListener implements ApplicationListener<ContextRefreshedEvent> {


	@Override
	public void onApplicationEvent(ContextRefreshedEvent cre) {
		// TODO Auto-generated method stub
		System.out.println(" On IOC Refresh and while container startup .. method ");
	}

}
