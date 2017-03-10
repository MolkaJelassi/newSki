package tn.esprit.beautifulminds.gui;

import java.tn.esprit.beautifulminds.persistence.Person;
import java.tn.esprit.beautifulminds.services.crud.PersonServicesRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class TestFindPerson {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		PersonServicesRemote personServicesRemote = (PersonServicesRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/PersonServices!tn.esprit.beautifulminds.services.crud.PersonServicesRemote");
		Person person2 = personServicesRemote.findPersonById(3);
		System.out.println(person2.getFirstName());
		System.out.println(person2.getLastName());
	}
}
