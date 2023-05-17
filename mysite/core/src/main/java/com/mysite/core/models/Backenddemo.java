package com.mysite.core.models;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class)

public class Backenddemo {
	@Inject
	private String text;
	
	public String getText() {
		return text;
	}
}
