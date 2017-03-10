package java.tn.esprit.beautifulminds.services.crud;

import java.tn.esprit.beautifulminds.persistence.Person;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface PersonServicesRemote {
	void addPerson(Person person);

	Person findPersonById(Integer idPerson);

	void deletePerson(Person person);

	void updatePerson(Person person);

	List<Person> findAllPersons();
}
