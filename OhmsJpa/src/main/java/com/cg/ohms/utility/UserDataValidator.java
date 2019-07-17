package com.cg.ohms.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.ohms.exception.HMSException;
/**
 * User entered data validator class
 * @author trainee
 *
 */
public class UserDataValidator {

	public boolean isValidUserFirstName(String firstusername) throws HMSException {
		// checking the appropriate user-first_name input

		Pattern usrnamefirstptrn = Pattern.compile("^[a-zA-Z]{2,16}");
		Matcher matchnamefirst = usrnamefirstptrn.matcher(firstusername);
		if (matchnamefirst.matches()) {
			return true;
		} else {
			throw new HMSException(ExceptionMessage.FIRST_NAME_MSG);

		}
	}

	public boolean isValidUserSurName(String usersirname) throws HMSException {
		// checking the appropriate user-sur_name input

		Pattern usrsirnameptrn = Pattern.compile("^[a-zA-Z']{2,10}");
		Matcher matchsirname = usrsirnameptrn.matcher(usersirname);
		if (matchsirname.matches()) {
			return true;
		} else {
			throw new HMSException(ExceptionMessage.LAST_NAME_MSG);

		}
	}

	public boolean isValidEmail(String email) throws HMSException {
		// checking the appropriate user-email input
		Pattern usremailptr = Pattern.compile("^(.+)@(.+)$");
		Matcher emailmtc = usremailptr.matcher(email);
		if (emailmtc.matches()) {
			return true;
		} else {
			throw new HMSException(ExceptionMessage.EMAIL_INVALID_MSG);

		}
	}

	public boolean isValidPhone(String phone) throws HMSException {
		// checking the appropriate user-phone-no input

		Pattern phonenocheck = Pattern.compile("^[6-9]{1}[0-9]{9}$");
		Matcher mtchphoneno = phonenocheck.matcher(phone);
		if (mtchphoneno.matches()) {
			return true;
		} else {
			throw new HMSException(ExceptionMessage.PHONE_INVALID_MSG);

		}
	}
	public boolean isValidPassword(String password) throws HMSException {
		// checking the appropriate user-phone-no input

		Pattern passwordcheck = Pattern.compile("^[a-zA-Z0-9]{4,8}$");
		Matcher mtchpassword = passwordcheck.matcher(password);
		if (mtchpassword.matches()) {
			return true;
		} else {
			throw new HMSException(ExceptionMessage.PASSWORD_MSG);

		}
	}

}
