package java.tn.esprit.beautifulminds.services.crud;

import java.tn.esprit.beautifulminds.persistence.Training;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface TrainingservicesRemote {
	void addTraining(Training training);

	Training findTrainingById(Integer idPerson);

	void deleteTraining(Training training);

	void updateTraining(Training training);

	List<Training> findAllTrainings();
}
