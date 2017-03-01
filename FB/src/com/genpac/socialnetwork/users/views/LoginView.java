package com.genpac.socialnetwork.users.views;

import java.util.Scanner;

import com.genpac.socialnetwork.users.dao.LoginDAO;
import com.genpac.socialnetwork.users.dto.MessageDTO;
import com.genpac.socialnetwork.users.dto.UserDTO;
/**
 * This class has design related things
 * @author amit
 * @since 1 March 2017
 * @version 0.1
 */
public class LoginView {
	/**
	 * this method will do the login things
	 *
	 * 
	 */
	public void doLogin(){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Userid ");
		String userid =scanner.next();
		System.out.println("Enter the Password");
		String password = scanner.next();
		LoginDAO loginDAO = new LoginDAO();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		MessageDTO messageDTO = loginDAO.isAuth(userDTO);
		if(messageDTO.getStatus().equals("SUCCESS")){
			System.out.println(messageDTO.getMessage()
					+" "+messageDTO.getUserid()+" Login Time "+messageDTO.getLoginDateTime());
		}
		else
		{
			System.out.println(messageDTO.getMessage());
		}
		scanner.close();
	}
}
