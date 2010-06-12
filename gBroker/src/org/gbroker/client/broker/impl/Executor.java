package org.gbroker.client.broker.impl;

import org.gbroker.client.broker.Action;
import org.gbroker.client.broker.Response;

public interface Executor {
	
	<T extends Response> void execute(ActionInfo info,Action<T> action,ExecutorCallback<T> callback);

}
