package ontap;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
	private List<Account> accList;

	public QuanLy() {
		accList = new ArrayList<Account>();

		Account acc1 = new Account("tung", "tung@gmail.com");
		Account acc2 = new Account("hoa", "hoa@gmail.com");
		Account acc3 = new Account("diep", "diep@gmail.com");

		// add vao ds
		accList.add(acc1);
		accList.add(acc2);
		accList.add(acc3);
	}

	// Ham tra ve ds
	public List<Account> traVe() {
		return accList;
	}

	// Them tkhoan
	public void themAccount(String name, String email) {
		Account acc = new Account(name, email);

		accList.add(acc);
	}
}
