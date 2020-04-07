package com.deepsm007.app.ws.userservice;

import com.deepsm007.app.ws.ui.model.request.UserDetailsRequestModel;
import com.deepsm007.app.ws.ui.model.response.UserRest;
/**
 * 
 * @author Deep Mistry
 *
 */
public interface UserService {
	UserRest createUser(UserDetailsRequestModel userDetails);
}
