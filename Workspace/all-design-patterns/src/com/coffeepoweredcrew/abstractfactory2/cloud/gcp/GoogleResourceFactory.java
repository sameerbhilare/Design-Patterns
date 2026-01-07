package com.coffeepoweredcrew.abstractfactory2.cloud.gcp;

import com.coffeepoweredcrew.abstractfactory2.cloud.Instance;
import com.coffeepoweredcrew.abstractfactory2.cloud.Instance.Capacity;
import com.coffeepoweredcrew.abstractfactory2.cloud.ResourceFactory;
import com.coffeepoweredcrew.abstractfactory2.cloud.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
