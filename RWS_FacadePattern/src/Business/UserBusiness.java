package Business;

import java.util.ArrayList;

import DataAccess.UserRepository;
import Entity.User;

/**
 * @author OsBulb
 *
 */
public class UserBusiness {
	
	private UserRepository _userRepository;
	
	public UserBusiness(){
		_userRepository = new UserRepository();
	}
	
	public ArrayList<User> GetUsers() throws Exception{
		try 
		{
			return _userRepository.GetUsers();
		} 
		catch (Exception e) {
			throw e;
		}
	}
	
	public User GetUser(String name) throws Exception{
		try 
		{
			return _userRepository.GetUserByName(name);
		} 
		catch (Exception e) {
			throw e;
		}
	}
	
	public User UpdateUser(String name, String newName) throws Exception{
		try 
		{
			return _userRepository.UpdateUser(name, newName);
		} 
		catch (Exception e) {
			throw e;
		}
	}
	
	public ArrayList<User> DeleteUserByName(String name) throws Exception{
		try 
		{
			return _userRepository.DeleteUserByName(name);
		} 
		catch (Exception e) {
			throw e;
		}
	}
	
}
