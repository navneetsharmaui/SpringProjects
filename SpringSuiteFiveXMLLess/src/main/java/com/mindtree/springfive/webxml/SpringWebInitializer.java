/**
 * 
 */
package com.mindtree.springfive.webxml;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.mindtree.springfive.dispatcher.SpringDispatcherConfig;

/**
 * @author M1044357
 *
 */
@Configurable
public class SpringWebInitializer implements WebApplicationInitializer {

	private void addDispatcherContext (ServletContext container) {
		AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
		
		dispatcherContext.register(SpringDispatcherConfig.class);
		
		//Declare <Servlet> and <Servlet-mapping> for the DispatcherServlet
		ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher-servlet", new DispatcherServlet(dispatcherContext));
		dispatcher.addMapping("/");
		dispatcher.setLoadOnStartup(1);
	}

	public void onStartup(ServletContext container) throws ServletException {
		// TODO Auto-generated method stub
		addDispatcherContext(container);
	}
}
