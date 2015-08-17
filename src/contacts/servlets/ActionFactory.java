package contacts.servlets;

import contacts.servlets.actions.ActionAdd;
import contacts.servlets.actions.ActionGetAll;
import contacts.servlets.actions.ActionHome;
import contacts.servlets.actions.ActionSearchName;

public class ActionFactory {

	public static Action getAction(String cde){
		Action action = null;
		if(cde == null || cde.isEmpty())
			cde = "home";
		
		switch(cde){
		case "home":
			action = new ActionHome();
			break;
		case "searchName":
			action = new ActionSearchName();
			break;
		case "getAll":
			action = new ActionGetAll();
			break;
		case "add":
			action = new ActionAdd();
			break;
//		case "details_dest":
//			action = new ActionDetailsDest();
//			break;
//		case "add":
//			action = new ActionAddVoyage();
//			break;
//		case "rem":
//			action = new ActionRemoveVoyage();
//			break;
////		case "chg_places":
////			action = new ActionChangeNbPlaces();
////			break;
		}
		return action;
	}
	
}
