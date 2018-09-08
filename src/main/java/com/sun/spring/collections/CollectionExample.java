package com.sun.spring.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionExample {

	public CollectionExample() {
		System.out.println("Inside Collection Example Constructor ...........");
	}

	private Properties properties;

	private List<String> list;

	private Map<String, String> someMap;

	private Set<String> someSet;

	public Map<String, String> getSomeMap() {
		return someMap;
	}

	public void setSomeMap(Map<String, String> someMap) {
		this.someMap = someMap;
	}

	public Set<String> getSomeSet() {
		return someSet;
	}

	public void setSomeSet(Set<String> someSet) {
		this.someSet = someSet;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public String getProperty(String name) {
		return this.properties.getProperty(name);
	}

}
