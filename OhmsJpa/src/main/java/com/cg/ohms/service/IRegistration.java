package com.cg.ohms.service;

import java.sql.SQLException;

import com.cg.ohms.dto.CustomerDataDTO;
import com.cg.ohms.exception.HMSException;

/**
 * Interface declaration
 * 
 * @author trainee
 *
 */
public interface IRegistration {
	boolean userValidation(String email, String phone) throws HMSException;

	int userRegistration(CustomerDataDTO user) throws HMSException;
}
