package tn.esprit.beautifulminds.gui;

import java.tn.esprit.beautifulminds.persistence.Person;
import java.tn.esprit.beautifulminds.services.crud.PersonServicesRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class TestDeletePerson {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		PersonServicesRemote personServicesRemote = (PersonServicesRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/PersonServices!tn.esprit.beautifulminds.services.crud.PersonServicesRemote");

		Person person1 = personServicesRemote.findPersonById(2);

		personServicesRemote.deletePerson(person1);
	}
}
