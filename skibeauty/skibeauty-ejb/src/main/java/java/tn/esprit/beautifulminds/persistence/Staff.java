package java.tn.esprit.beautifulminds.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Staff
 *
 */
@Entity

public class Staff extends Person implements Serializable {

	private String email;
	private String password;
	private String role;
	private Integer nbjT;
	private Integer nbjR;

	@ManyToOne
	private Staff staff;

	@OneToMany(mappedBy = "staff")
	private List<Staff> staffs;

	@ManyToMany(mappedBy = "eventStaffs")
	private List<Event> staffEvents;

	@ManyToOne
	private Station station;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	private Shop shop;

	public Staff() {
		super();
	}
	

	public Staff(String firstName, String lastName, Date birthday, String nationality, String gender,
			String email, String password, String role, Integer nbjT, Integer nbjR) {
		super(firstName, lastName, birthday, nationality, gender);
		this.email = email;
		this.password = password;
		this.role = role;
		this.nbjT = nbjT;
		this.nbjR = nbjR;
	}

	public Staff(Integer personId, String firstName, String lastName, Date birthday, String nationality, String gender,
			String email, String password, String role, Integer nbjT, Integer nbjR, Staff staff, List<Staff> staffs,
			List<Event> staffEvents, Station station, Shop shop) {
		super(personId, firstName, lastName, birthday, nationality, gender);
		this.email = email;
		this.password = password;
		this.role = role;
		this.nbjT = nbjT;
		this.nbjR = nbjR;
		this.staff = staff;
		this.staffs = staffs;
		this.staffEvents = staffEvents;
		this.station = station;
		this.shop = shop;
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

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public List<Staff> getStaffs() {
		return staffs;
	}

	public void setStaffs(List<Staff> staffs) {
		this.staffs = staffs;
	}

	public List<Event> getStaffEvents() {
		return staffEvents;
	}

	public void setStaffEvents(List<Event> staffEvents) {
		this.staffEvents = staffEvents;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
