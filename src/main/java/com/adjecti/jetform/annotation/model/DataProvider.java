package com.adjecti.jetform.annotation.model;

import com.adjecti.jetform.annotation.FormField;
import com.adjecti.jetform.enums.LoadType;
import com.adjecti.jetform.enums.ResourceType;

public class DataProvider {
	/*
	 * String path() default ""; ResourceType resource(); LoadType loadType()
	 * default LoadType.EAGER;
	 */
	private String path;
	private ResourceType resource;
	private LoadType loadType;
	public DataProvider(String path,ResourceType resource,LoadType loadType){
		this.path = path;
		this.resource = resource;
		this.loadType=loadType;
	}
	public DataProvider(FormField field){
		this.path = field.radio().dataProvider().path();
		this.resource = field.radio().dataProvider().resource();
		this.loadType=field.radio().dataProvider().loadType();
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public ResourceType getResource() {
		return resource;
	}
	public void setResource(ResourceType resource) {
		this.resource = resource;
	}
	public LoadType getLoadType() {
		return loadType;
	}
	public void setLoadType(LoadType loadType) {
		this.loadType = loadType;
	}
	@Override
	public String toString() {
		return "DataProvider [path=" + path + ", resource=" + resource + ", loadType=" + loadType + "]";
	}
	
}
