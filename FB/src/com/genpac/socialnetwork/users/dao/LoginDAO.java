package com.genpac.socialnetwork.users.dao;

import java.util.Date;

import com.genpac.socialnetwork.users.dto.MessageDTO;
import com.genpac.socialnetwork.users.dto.UserDTO;

// Data Access Object
public class LoginDAO {
	
	public MessageDTO isAuth(UserDTO userDTO){
		MessageDTO messageDTO =new MessageDTO();
		if(userDTO.getUserid().equals(userDTO.getPassword())){
			messageDTO.setStatus("SUCCESS");
			messageDTO.setUserid(userDTO.getUserid());
			messageDTO.setMessage("Welcome ");
			messageDTO.setLoginDateTime(new Date());
		}
		else
		{
			messageDTO.setStatus("FAIL");
			messageDTO.setMessage("Invalid Userid or Password");
		}
		return messageDTO;
	}

}
