package service;

import java.sql.SQLException;

import javax.naming.NamingException;


import domaine.UserDAO;

import model.User;

public class UserService{
	
	private UserDAO userDAO = new UserDAO();
	
	public UserService(){
		userDAO = new UserDAO();
	}

	public  User getUser(String login,String password){
		User user=userDAO.getUser(login,password);
		return user;
	}

}
