package tn.esprit.beautifulminds.gui;

import java.tn.esprit.beautifulminds.persistence.Staff;
import java.tn.esprit.beautifulminds.services.crud.StaffServicesRemote;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class TestFindAllStaff {
	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		StaffServicesRemote staffServicesRemote = (StaffServicesRemote) context.lookup(
				"projet-personnel-ear/projet-personnel-ejb/StaffServices!tn.esprit.beautifulminds.services.crud.StaffServicesRemote");
		List<Staff> staff = staffServicesRemote.findAllStaffs();

		for (Staff st : staff) {
			System.out.println(st.getRole());
		}

	}
}
