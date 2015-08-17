package contacts.servlets.actions;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import contacts.dao.ContactDAO;
import contacts.servlets.Action;

public class ActionAdd implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		ServletContext application = request.getServletContext();
		ContactDAO dao = (ContactDAO) application.getAttribute("contactDAO");
		
		String civ = request.getParameter("contactCiv");
		String nom = request.getParameter("contactName");
		String prenom = request.getParameter("contactPrenom");
		dao.addContact(civ, nom, prenom);
		return "/contact_added.jsp";
	}

}
