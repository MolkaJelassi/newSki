package tn.esprit.beautifulminds.gui;

import java.tn.esprit.beautifulminds.persistence.Person;
import java.tn.esprit.beautifulminds.services.crud.PersonServicesRemote;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class TestFindAllPerson {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		PersonServicesRemote personServicesRemote = (PersonServicesRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/PersonServices!tn.esprit.beautifulminds.services.crud.PersonServicesRemote");
		List<Person> person = personServicesRemote.findAllPersons();

		for (Person per : person) {
			System.out.println(per.getNationality());
		}

	}
}
