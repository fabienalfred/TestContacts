package contacts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import contacts.entities.Contact;

public class ContactDAO {
	private EntityManagerFactory emf;

	public ContactDAO() {
		emf = Persistence.createEntityManagerFactory("contacts");
	}

	public void addContact(String civ, String nom, String prenom) {
		EntityManager em = emf.createEntityManager();
		Contact c = new Contact();
		c.setId(0);
		c.setCivilite(civ.substring(0, 1).toUpperCase() + civ.substring(1, civ.length()));
		c.setNom(nom.toUpperCase());
		c.setPrenom(prenom.substring(0, 1).toUpperCase() + prenom.substring(1, prenom.length()));
		System.out.println(c.getId()+c.getCivilite()+c.getNom()+c.getPrenom());
		em.persist(c);
		em.close();
	}

	public void removeContacts(String nom, String prenom) {
		EntityManager em = emf.createEntityManager();
		for (Contact c : getContactsByNomPrenom(nom, prenom)) {
			em.remove(c);
		}
		em.close();
	}

	public void modifyContact(String nom, String prenom, String newCiv, String newNom, String newPrenom) {
		EntityManager em = emf.createEntityManager();
		Contact c = getContactsByNomPrenom(nom, prenom).get(0);
		c.setCivilite(newCiv.substring(0, 1).toUpperCase() + newCiv.substring(1, newCiv.length()));
		c.setNom(newNom.toUpperCase());
		c.setPrenom(newPrenom.substring(0, 1).toUpperCase() + newPrenom.substring(1, newPrenom.length()));
		em.merge(c);
		em.close();
	}

	@SuppressWarnings("unchecked")
	public List<Contact> getAll() {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("Contact.getAll");
		List<Contact> contacts = query.getResultList();
		em.close();
		return contacts;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Contact> getContactsByCivilite(String civ) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("Contact.getContactsByCivilite")
						.setParameter("civ", civ);
		List<Contact> contacts = query.getResultList();
		em.close();
		return contacts;
	}

	@SuppressWarnings("unchecked")
	public List<Contact> getContactsByNom(String nom) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("Contact.getContactsByNom")
						.setParameter("nom", nom);
		
		List<Contact> contacts = query.getResultList();
		em.close();
		return contacts;
	}

	@SuppressWarnings("unchecked")
	public List<Contact> getContactsByNomPrenom(String nom, String prenom) {
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("Contact.getContactsByNomPrenom")
						.setParameter("nom", nom)
						.setParameter("prenom", prenom);
		List<Contact> contacts = query.getResultList();
		em.close();
		return contacts;

	}

}
