package tn.esprit.beautifulminds.gui;

import java.tn.esprit.beautifulminds.persistence.Staff;
import java.tn.esprit.beautifulminds.services.crud.StaffServicesRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;



public class TestDeleteStaff {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		StaffServicesRemote staffServicesRemote = (StaffServicesRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/StaffServices!tn.esprit.beautifulminds.services.crud.StaffServicesRemote");

		Staff staff1 = staffServicesRemote.findStaffById(3);

	staffServicesRemote.deleteStaff(staff1);
	}
}
