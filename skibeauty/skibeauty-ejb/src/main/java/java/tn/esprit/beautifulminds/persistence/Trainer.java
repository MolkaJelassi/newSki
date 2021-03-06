package java.tn.esprit.beautifulminds.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Trainer
 *
 */
@Entity

public class Trainer extends Person implements Serializable {

	private String email;
	private String password;
	private String role;
	private Integer nbjT;
	private Integer nbjR;
	private String expirence;
	private String description;
	private String categorie;
	private Integer ratingPoints;

	@OneToMany(mappedBy = "trainerstaff")
	private List<Training> trainings;
	private static final long serialVersionUID = 1L;

	public Trainer() {
		super();
	}

	public Trainer(String firstName, String lastName, Date birthday, String nationality, String gender, String email,
			String password, String role, Integer nbjT, Integer nbjR, String expirence, String description,
			String categorie, Integer ratingPoints) {
		super(firstName, lastName, birthday, nationality, gender);
		this.email = email;
		this.password = password;
		this.role = role;
		this.nbjT = nbjT;
		this.nbjR = nbjR;
		this.expirence = expirence;
		this.description = description;
		this.categorie = categorie;
		this.ratingPoints = ratingPoints;

	}
	

	public Trainer(Integer personId, String firstName, String lastName, Date birthday, String nationality,
			String gender, String email, String password, String role, Integer nbjT, Integer nbjR, String expirence,
			String description, String categorie, Integer ratingPoints, List<Training> trainings) {
		super(personId, firstName, lastName, birthday, nationality, gender);
		this.email = email;
		this.password = password;
		this.role = role;
		this.nbjT = nbjT;
		this.nbjR = nbjR;
		this.expirence = expirence;
		this.description = description;
		this.categorie = categorie;
		this.ratingPoints = ratingPoints;
		this.trainings = trainings;
	}

	public List<Training> getTrainings() {
		return trainings;
	}

	public void setTrainings(List<Training> trainings) {
		this.trainings = trainings;
	}

	public String getExpirence() {
		return this.expirence;
	}

	public void setExpirence(String expirence) {
		this.expirence = expirence;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public Integer getRatingPoints() {
		return this.ratingPoints;
	}

	public void setRatingPoints(Integer ratingPoints) {
		this.ratingPoints = ratingPoints;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getNbjT() {
		return this.nbjT;
	}

	public void setNbjT(Integer nbjT) {
		this.nbjT = nbjT;
	}

	public Integer getNbjR() {
		return this.nbjR;
	}

	public void setNbjR(Integer nbjR) {
		this.nbjR = nbjR;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
