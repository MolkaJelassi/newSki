package tn.esprit.beautifulminds.gui;

import java.tn.esprit.beautifulminds.persistence.Training;
import java.tn.esprit.beautifulminds.services.crud.TrainingservicesRemote;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class TestFindAllTraining {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TrainingservicesRemote trainingservicesRemote = (TrainingservicesRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/Trainingservices!tn.esprit.beautifulminds.services.crud.TrainingservicesRemote");
		List<Training> training = trainingservicesRemote.findAllTrainings();

		for (Training t : training) {
			System.out.println(t.getType());
		}

	}

}
