package org.gbroker.client.broker.impl;

import java.util.Map;

import org.gbroker.client.broker.Action;
import org.gbroker.client.broker.BrokerCallback;
import org.gbroker.client.broker.GBroker;
import org.gbroker.client.broker.Response;

import com.google.gwt.core.client.JavaScriptObject;

public class GBrokerImpl implements GBroker{
	
	private Map<Class<? extends Action<? extends Response>>,ActionInfo> actions;
	
	private Map<ActionType,Executor> executors;
	
	private CacheManager cacheManager;
	
	public void configure(JavaScriptObject configuration)
	{
		
	}

	@Override
	public <T extends Response> void execute(Action<T> action,
			BrokerCallback<T> response) {
		// TODO Auto-generated method stub
		
	}
	
}
