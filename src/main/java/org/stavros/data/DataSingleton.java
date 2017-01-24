package org.stavros.data;

import java.util.HashMap;
import java.util.Map;

import org.stavros.rest.model.SampleBean;
import org.stavros.rest.model.SampleObject;

public class DataSingleton {
	
	private final static DataSingleton INSTANCE = new DataSingleton();
	
	private DataSingleton() {
		data = new HashMap<>();
		data.put(1L, new SampleBean(1L, "name1", new SampleObject(1L, "sample1", "descr1")));
		data.put(2L, new SampleBean(2L, "name2", new SampleObject(2L, "sample2", "descr2")));
		data.put(3L, new SampleBean(3L, "name1", new SampleObject(3L, "sample3", "descr3")));
	}
	
	public final static DataSingleton getInstance() {
		return INSTANCE;
	}
	
	private Map<Long, SampleBean> data;
	public SampleBean retrieve(Long id) {
		return data.get(id);
	}

}
