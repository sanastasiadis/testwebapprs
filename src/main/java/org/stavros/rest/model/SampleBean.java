package org.stavros.rest.model;

import java.io.Serializable;

public class SampleBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1949549422058014817L;

	public SampleBean() {
		
	}
	
	public SampleBean(Long id, String name, SampleObject object) {
		setId(id);
		setName(name);
		setObject(object);
	}
	
	private Long id;
	
	private String name;
	
	private SampleObject object;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SampleObject getObject() {
		return object;
	}

	public void setObject(SampleObject object) {
		this.object = object;
	}

}
