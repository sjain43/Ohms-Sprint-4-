package com.cg.ohms.utility;

import com.cg.ohms.exception.HMSException;
/**
 * User input validator class
 * @author trainee
 *
 */
public class UserInputValidator {
	// checking the appropriate user- input
     public void inputMismatch(String input) throws HMSException {
    	 throw new HMSException("Please enter valid number");
     }
}
