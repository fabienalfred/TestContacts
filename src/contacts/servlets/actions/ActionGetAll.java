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

public class ActionGetAll implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getServletContext();
		ContactDAO dao = (ContactDAO) application.getAttribute("contactDAO");
		
		List<Contact> contacts = dao.getAll();
		request.setAttribute("contacts", contacts);
		return "/contacts.jsp";
	}

}
