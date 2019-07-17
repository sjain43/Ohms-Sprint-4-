package com.cg.ohms.dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.ohms.dto.CustomerDataDTO;
import com.cg.ohms.exception.HMSException;

public class RegisterDaoImp implements IRegisterDao {
	public int validatingCustomerDetail(String email, String phone) throws HMSException {
		EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("radh");
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		javax.persistence.Query query = manager.createNamedQuery("CustomerDataDTO.Duplication_Check");
		((javax.persistence.Query) query).setParameter("email", email);
		((javax.persistence.Query) query).setParameter("phone", phone);
		CustomerDataDTO cust=null;
		try {
		cust = (CustomerDataDTO) ((javax.persistence.Query) query).getSingleResult();
		}
		catch(Exception e) {
			return 0;
		}
		if (cust!= null) {
			return 1;
		} else {
			return 0;
		}
		
//		Connection connection = DbConnection.getConnection();
//		int count = 0;
//		PreparedStatement preparedstatement;
//		try {
//			preparedstatement = connection.prepareStatement(SqlQuery.PHONE_CHECK);
//			preparedstatement.setString(1, email);
//			preparedstatement.setString(2, phone);
//			ResultSet resultset = preparedstatement.executeQuery();
//		while (resultset.next()) {
//		    ++count;
//		}
//		
//		}
//			catch (SQLException e) {
//			throw new HMSException(ExceptionMessage.SQL_MSG);
//		}
//		return count;
	}

	public int dataInsertion(CustomerDataDTO user) throws HMSException {
		EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("radh");
		EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(user);
		transaction.commit();
		return user.getcustomerid();
//		Connection connection = DbConnection.getConnection();
//		try {
//			PreparedStatement preparedstatement = connection.prepareStatement(SqlQuery.INSERTING_VALUES);
//			preparedstatement.setInt(1, userid);
//			preparedstatement.setString(2, user.getFirstname());
//			preparedstatement.setString(3, user.getLastname());
//			preparedstatement.setString(4, user.getPhone());
//			preparedstatement.setString(5, user.getEmail());
//			preparedstatement.setString(6, user.getPassword());
//			preparedstatement.setString(7, user.getState());
//			preparedstatement.setString(8, user.getCity());
//			preparedstatement.setInt(9, user.getPincode());
//			preparedstatement.setString(10, user.getHomeno());
//			int result = preparedstatement.executeUpdate();
//			if (result == 1) {
//				connection.commit();
//				return true;
//			} else {
//				throw new HMSException(ExceptionMessage.SQL_MSG);
//			}
//
//		} catch (SQLException e) {
//			throw new HMSException(ExceptionMessage.SQL_MSG);
//		}

	}
}
