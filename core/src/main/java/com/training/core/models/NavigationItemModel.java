package com.training.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class NavigationItemModel {
	
	@Inject
	private String title;
	
	@Inject
	private String link;
	
	@Inject
	private String newtab;

	public String getTitle() {
		return title;
	}

	public String getLink() {
		return link;
	}

	public String getNewtab() {
		return newtab;
	}
}
