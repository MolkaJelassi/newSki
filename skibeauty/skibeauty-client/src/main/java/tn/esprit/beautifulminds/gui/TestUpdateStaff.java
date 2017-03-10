package tn.esprit.beautifulminds.gui;

import java.tn.esprit.beautifulminds.persistence.Staff;
import java.tn.esprit.beautifulminds.services.crud.StaffServicesRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class TestUpdateStaff {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		StaffServicesRemote staffServicesRemote = (StaffServicesRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/StaffServices!tn.esprit.beautifulminds.services.crud.StaffServicesRemote");
		Staff staff = staffServicesRemote.findStaffById(3);
		staff.setFirstName("SkiBoard");

		staffServicesRemote.updateStaff(staff);

	}
}
