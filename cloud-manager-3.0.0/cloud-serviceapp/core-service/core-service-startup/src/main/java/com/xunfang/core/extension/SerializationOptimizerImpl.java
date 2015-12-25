package com.xunfang.core.extension;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.xunfang.coreModel.User;

public class SerializationOptimizerImpl implements SerializationOptimizer{

	@Override
	public Collection<Class> getSerializableClasses() {
		List<Class> classes = new LinkedList<Class>();
		classes.add(User.class);
		return classes;
	}

}
