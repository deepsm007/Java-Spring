package com.deepsm007.app.ws.userservice.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepsm007.app.ws.shared.Utils;
import com.deepsm007.app.ws.ui.model.request.UserDetailsRequestModel;
import com.deepsm007.app.ws.ui.model.response.UserRest;
import com.deepsm007.app.ws.userservice.UserService;
/**
 * 
 * @author Deep Mistry
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	Map<String, UserRest> users;
	Utils utils;
    public UserServiceImpl() {
		
	}
    @Autowired
    public UserServiceImpl(Utils utils) {
    	this.utils = utils;
    }
	
	@Override
	public UserRest createUser(UserDetailsRequestModel userDetails) {
		UserRest returnValue = new UserRest();
		returnValue.setEmail(userDetails.getEmail());
		returnValue.setFirstName(userDetails.getFirstName());
		returnValue.setLastName(userDetails.getLastName());

		String userId = utils.generateUserId();
		returnValue.setUserId(userId);

		if (users == null)
			users = new HashMap<String, UserRest>();
		users.put(userId, returnValue);
		return returnValue;
	}

}
