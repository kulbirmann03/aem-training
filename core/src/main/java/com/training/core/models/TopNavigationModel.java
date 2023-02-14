package com.training.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, resourceType = TopNavigationModel.RESOURCE_TYPE)
public class TopNavigationModel {
	public static final String RESOURCE_TYPE="training/components/topnavigation/v1/topnavigation";
	
	@Inject
	private List<NavigationItemModel> navList;

	public List<NavigationItemModel> getNavList() {
		return navList;
	}

}
