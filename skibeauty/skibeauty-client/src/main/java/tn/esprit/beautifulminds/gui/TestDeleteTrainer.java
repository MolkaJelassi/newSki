package tn.esprit.beautifulminds.gui;

import java.tn.esprit.beautifulminds.persistence.Trainer;
import java.tn.esprit.beautifulminds.services.crud.TrainerServicesRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class TestDeleteTrainer {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TrainerServicesRemote trainerServicesRemote = (TrainerServicesRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/TrainerServices!tn.esprit.beautifulminds.services.crud.TrainerServicesRemote");

		Trainer trainer1 = trainerServicesRemote.findTrainerById(1);

		trainerServicesRemote.deleteTraining(trainer1);
	}
}
