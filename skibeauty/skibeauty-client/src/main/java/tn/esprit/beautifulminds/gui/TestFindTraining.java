package tn.esprit.beautifulminds.gui;

import java.tn.esprit.beautifulminds.persistence.Training;
import java.tn.esprit.beautifulminds.services.crud.TrainingservicesRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class TestFindTraining {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TrainingservicesRemote trainingservicesRemote = (TrainingservicesRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/Trainingservices!tn.esprit.beautifulminds.services.crud.TrainingservicesRemote");
	Training training2= trainingservicesRemote.findTrainingById(1);
	System.out.println(training2.getName());
	}
}
