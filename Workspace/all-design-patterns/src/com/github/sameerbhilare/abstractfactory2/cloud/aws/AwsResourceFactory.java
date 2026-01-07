package com.github.sameerbhilare.abstractfactory2.cloud.aws;

import com.github.sameerbhilare.abstractfactory2.cloud.Instance;
import com.github.sameerbhilare.abstractfactory2.cloud.Instance.Capacity;
import com.github.sameerbhilare.abstractfactory2.cloud.ResourceFactory;
import com.github.sameerbhilare.abstractfactory2.cloud.Storage;
//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
