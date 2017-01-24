package org.stavros.rest.model;

import java.io.Serializable;

public class SampleObject implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7067345747625904840L;

	public SampleObject(Long id, String name, String description) {
		setId(id);
		setName(name);
		setDescription(description);
	}
	
	private Long id;
	
	private String name;
	
	private String description;

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

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
