package com.mysite.core.models;
import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class Newsarticle {

	@Inject
	private String type;
	
	public String getType() {
		return type;
	}
	@Inject
    private String name;
	
	public String getName() {
		return name;
	}
	@Inject
    private String desc;
	
	public String getDesc() {
		return desc;
	}
	@Inject
    private String image;
	
	public String getImage() {
		return image;
	}
}
