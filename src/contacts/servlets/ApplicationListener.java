package contacts.servlets;

import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import contacts.dao.ContactDAO;

@WebListener
public class ApplicationListener implements ServletContextListener {
	private static final Logger log = Logger.getAnonymousLogger();

	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub

	}

	public void contextInitialized(ServletContextEvent event) {
		ServletContext application = event.getServletContext();
		ContactDAO contactDAO = new ContactDAO();
		application.setAttribute("contactDAO", contactDAO);
        log.info(">>> ContactDAO ajoutée au contexte applicatif");
	}

}
