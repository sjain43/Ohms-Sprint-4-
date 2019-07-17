package com.cg.ohms.utility;

public class SqlQuery {
	public static final String PHONE_CHECK = "SELECT first_name FROM customer where email= ? or phone = ?";
	public static final String INSERTING_VALUES = "insert into customer values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

}
