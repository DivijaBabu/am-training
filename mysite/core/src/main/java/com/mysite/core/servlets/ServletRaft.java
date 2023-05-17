package com.mysite.core.servlets;
import java.io.IOException;
import javax.servlet.Servlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
@Component(service=Servlet.class,immediate = true,property = {
		"sling.servlet.paths="+"/bin/raftnews"
})
public class ServletRaft extends SlingSafeMethodsServlet{
	 @Override
	 protected void doGet(SlingHttpServletRequest req, SlingHttpServletResponse res) {
	 ResourceResolver resourceResolver = req.getResourceResolver();
	 Resource resource = resourceResolver.getResource("/content/mysite/us/en/mypage/rafttraining-assignment/jcr:content");
	 String valueofContent = resource.getValueMap().get("jcr:title").toString();
	 try { 
		res.getWriter().print("the new of rafters assignments : " +valueofContent);
	 } 
	 catch (IOException e) {
		 e.printStackTrace();
	 }
	 }
}
