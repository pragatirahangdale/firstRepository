package com.capgemini.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class dataBaseListener
 *
 */
@WebListener
public class dataBaseListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public dataBaseListener() {
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
    public void contextInitialized(ServletContextEvent servletContext)  { 
         // TODO Auto-generated method stub
    	System.out.println(" inside ServletContextEvent ");
    	ServletContext ctx = servletContext.getServletContext();
    	String dataValue= ctx.getInitParameter("param1");
    	ctx.setAttribute("data", dataValue);
    	
    }
	
}
