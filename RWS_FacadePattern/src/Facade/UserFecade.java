/**
 * 
 */
package Facade;

import Adapters.UserAdapterRequest;
import Adapters.UserAdapterResponse;
import Adapters.UserUpdateAdapterRequest;
import Business.UserBusiness;

/**
 * @author OsBulb
 *
 */
public class UserFecade {

	private UserAdapterResponse _userAdapterResponse;
	private UserBusiness _userBusiness;
	
	public UserFecade(){
		_userAdapterResponse = new UserAdapterResponse();
		_userBusiness = new UserBusiness();
	}
	
	public UserAdapterResponse GetUsers(UserAdapterRequest userAdapterRequest){
		try
		{
			//Get all Users
			_userAdapterResponse.getResultResponse().getDtoUser().setUsers
			(
					_userBusiness.GetUsers()
			);		
			
			//Null single User variable
			_userAdapterResponse.getResultResponse().getDtoUser().setUser(null);
		}
		catch(Exception ex){}
		
		return _userAdapterResponse;
	}
	
	public UserAdapterResponse GetSingleUser(UserAdapterRequest userAdapterRequest){
		try
		{
			//Get Users by name
			_userAdapterResponse.getResultResponse().getDtoUser().setUser
			(
					_userBusiness.GetUser
					(
							userAdapterRequest.getName()
					)
			);		
			
			//Null Users variable
			_userAdapterResponse.getResultResponse().getDtoUser().setUsers(null);
		}
		catch(Exception ex){}
		
		return _userAdapterResponse;
	}

	public UserAdapterResponse UpdateUser(UserUpdateAdapterRequest userUpdateAdapterRequest){
		try
		{
			//Update single user name and get modified user
			_userAdapterResponse.getResultResponse().getDtoUser().setUser
			(
					_userBusiness.UpdateUser(
							userUpdateAdapterRequest.get_name(),
							userUpdateAdapterRequest.getNewName()
					)
			);		
			
			//Null Users variable
			_userAdapterResponse.getResultResponse().getDtoUser().setUsers(null);
		}
		catch(Exception ex){}
		
		return _userAdapterResponse;
	}

	public UserAdapterResponse DeleteUser(UserAdapterRequest userAdapterRequest){
		try
		{
			//Delete user by name and get current users
			_userAdapterResponse.getResultResponse().getDtoUser().setUsers
			(
					_userBusiness.DeleteUserByName(
							userAdapterRequest.getName()
					)
			);		
			
			//Null single User variable
			_userAdapterResponse.getResultResponse().getDtoUser().setUser(null);
		}
		catch(Exception ex){}
		
		return _userAdapterResponse;
	}
}
