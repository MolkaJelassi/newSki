package tn.esprit.beautifulminds.gui;

import java.tn.esprit.beautifulminds.persistence.Person;
import java.tn.esprit.beautifulminds.services.crud.PersonServicesRemote;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class TestAddPerson {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		PersonServicesRemote personServicesRemote = (PersonServicesRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/PersonServices!tn.esprit.beautifulminds.services.crud.PersonServicesRemote");

		String firstName = "snake";
		String lastName = "shark";
		@SuppressWarnings("deprecation")
		Date birthday = new Date(79,10,30);
		String nationality = "tunisienne";
		String gender = "male";
		Person p = new Person(firstName, lastName, birthday, nationality, gender);
		personServicesRemote.addPerson(p);
	}
}
