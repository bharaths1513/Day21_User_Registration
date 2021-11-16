package Day21_User_Registration_Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Day21_User_Registration.UserRegistrationException;

public class UserRegistrationExceptionTest {
	UserRegistrationException user = new UserRegistrationException();

	@Test
	public void firstName() {
		String fName = "Bharath";
		boolean chek = user.firstName(fName);
		assertTrue(chek);
	}

	@Test
	public void lastName() {
		String lName = "Sankajji";
		boolean chek = user.lastName(lName);
		assertTrue(chek);
	}

	@Test
	public void email() {
		String eMail = "bharath.sankajji@gmail.com";
		boolean chek = user.eMail(eMail);
		assertTrue(chek);
	}

	@Test
	public void mobileNum() {
		String mobile = "91 9535339595";
		boolean chek = user.mobileNum(mobile);
		assertTrue(chek);
	}

	@Test
	public void passWordRule1() {
		String pass = "bharaths";
		boolean chek = user.pass1(pass);
		assertTrue(chek);
	}

	@Test
	public void passWordRule2() {
		String pass = "Bharaths";
		boolean chek = user.pass2(pass);
		assertTrue(chek);
	}

	@Test
	public void passWordRule3() {
		String pass = "Bharaths1513";
		boolean chek = user.pass3(pass);
		assertTrue(chek);
	}

	@Test
	public void passWordRule4() {
		String pass = "Bharaths1513@";
		boolean chek = user.pass4(pass);
		assertTrue(chek);
	}
}
