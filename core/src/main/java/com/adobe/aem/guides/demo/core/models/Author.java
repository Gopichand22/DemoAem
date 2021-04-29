package com.adobe.aem.guides.demo.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Author {

	@Inject
	String name;

	@Inject
	int age;

	@Inject
	boolean check;

	public String getFullName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean getCheck() {
		return check;
	}

}
