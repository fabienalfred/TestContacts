package contacts.servlets.actions;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import contacts.dao.ContactDAO;
import contacts.entities.Contact;
import contacts.servlets.Action;

public class ActionSearchName implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();
		ContactDAO dao = (ContactDAO) application.getAttribute("contactDAO");
		
		String name = request.getParameter("nameContact");
		List<Contact> contacts = dao.getContactsByNom(name);
		request.setAttribute("contacts", contacts);
		return "/contacts.jsp";
	} 

}
