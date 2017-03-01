package com.genpac.socialnetwork.users.dao;

import java.util.Date;

import com.genpac.socialnetwork.users.dto.MessageDTO;
import com.genpac.socialnetwork.users.dto.UserDTO;

// Data Access Object
public class LoginDAO {
	
	
	
	private UserDTO[] prepareUsers(){
		UserDTO userArray[] = new UserDTO[5];
		for(int i = 0 ; i<userArray.length; i++){
			UserDTO userDTO = new UserDTO();
			userDTO.setUserid("amit"+(i+1));
			userDTO.setPassword("amit"+i);
			userArray[i] = userDTO;
 		}
		return userArray;
	}
	
	public MessageDTO isAuth(UserDTO userDTO){
		UserDTO userArray [] = prepareUsers();
		MessageDTO messageDTO =new MessageDTO();
		for(UserDTO userObject : userArray){
		if(userDTO.getUserid().equals(userObject.getUserid()) &&  
				userDTO.getPassword()
				.equals(userObject.getPassword())){
			//if(userDTO.getUserid().equals(userDTO.getPassword())){
			messageDTO.setStatus("SUCCESS");
			messageDTO.setUserid(userDTO.getUserid());
			messageDTO.setMessage("Welcome ");
			messageDTO.setLoginDateTime(new Date());
			break;
		}
		else
		{
			messageDTO.setStatus("FAIL");
			messageDTO.setMessage("Invalid Userid or Password");
		}
	}
		return messageDTO;
	}

}
