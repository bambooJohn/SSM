package com.bambooJohn.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application Lifecycle Listener implementation class SpringListener
 *
 */
public class SpringListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public SpringListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	ServletContext servletContext = arg0.getServletContext();
    	servletContext.setAttribute("ac", ac);
    }
	
}
