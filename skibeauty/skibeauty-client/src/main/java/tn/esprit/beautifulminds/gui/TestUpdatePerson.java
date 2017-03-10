package tn.esprit.beautifulminds.gui;

import java.tn.esprit.beautifulminds.persistence.Person;
import java.tn.esprit.beautifulminds.services.crud.PersonServicesRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class TestUpdatePerson {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		PersonServicesRemote personServicesRemote = (PersonServicesRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/PersonServices!tn.esprit.beautifulminds.services.crud.PersonServicesRemote");
		Person person = personServicesRemote.findPersonById(2);
		person.setFirstName("SkiBoard");

		personServicesRemote.updatePerson(person);

	}
}
