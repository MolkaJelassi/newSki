package tn.esprit.beautifulminds.gui;

import java.tn.esprit.beautifulminds.persistence.Trainer;
import java.tn.esprit.beautifulminds.services.crud.TrainerServicesRemote;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class TestFindAllTrainer {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		TrainerServicesRemote trainerServicesRemote = (TrainerServicesRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/TrainerServices!tn.esprit.beautifulminds.services.crud.TrainerServicesRemote");
		List<Trainer> trainer = trainerServicesRemote.findAllTrainers();

		for (Trainer tr : trainer) {
			System.out.println(tr.getRole());
		}

	}
}
