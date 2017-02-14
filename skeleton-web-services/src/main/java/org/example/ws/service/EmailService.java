package org.example.ws.service;

import java.util.concurrent.Future;

// will learn it later : skipped now
import org.example.ws.model.Greeting;

public interface EmailService {

	Boolean send(Greeting greeting);
	
	void sendAsync(Greeting greeting);
	
	Future<Boolean> sendAsyncWithResult(Greeting greeting);
}
