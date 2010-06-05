package org.gbroker.client.broker;

public interface GBroker {

	
	<T extends Response> void execute(Action<T> action,BrokerCallback<T> response);
	
}
