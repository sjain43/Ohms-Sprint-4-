package com.cg.ohms.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.ohms.exception.HMSException;
/**
 * User address data validator class
 * @author trainee
 *
 */
public class UserAddressValidator {
	public boolean isValidCity(String city) throws HMSException {
		// checking the appropriate user-city input
		Pattern citycheck = Pattern.compile("[a-zA-Z]{2,15}");
		Matcher citymtch = citycheck.matcher(city);
		if (citymtch.matches()) {
			return true;
		} else {
			throw new HMSException(ExceptionMessage.CITY_MSG);

		}
	}

	public boolean isValidPincode(String pincode) throws HMSException {
		// checking the appropriate user-pincode input

		Pattern pincodecheck = Pattern.compile("^[0-9]{6}");
		Matcher mtchpincode = pincodecheck.matcher(pincode);
		if (mtchpincode.matches()) {
			return true;
		} else {
			throw new HMSException(ExceptionMessage.PINCODE_MSG);

		}
	}

	public boolean isValidHomeno(String homeno) throws HMSException {
		// checking the appropriate home-no input

		Pattern homenocheck = Pattern.compile("^[a-zA-Z0-9]{2,4}$");
		Matcher mtchhomeno = homenocheck.matcher(homeno);
		if (mtchhomeno.matches()) {
			return true;
		} else {
			throw new HMSException(ExceptionMessage.HOME_NO_MSG);

		}
	}

}
