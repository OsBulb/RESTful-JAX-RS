/**
 * 
 */
package DataAccess;

import java.util.ArrayList;
import java.util.Calendar;

import Entity.User;

/**
 * @author OsBulb
 *
 */
public class UserRepository {
	
    private ArrayList<User> _users;
    
	public UserRepository(){
		String date = java.text.DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime());
		_users = new ArrayList<User>();
		_users.add(new User("Daryl","Dixon",date, "ddixon@jmail.com"));
		_users.add(new User("Rick","Grimes",date, "rgrimes@jmail.com"));
		_users.add(new User("Glenn","Rhee",date, "grhee@jmail.com"));
		_users.add(new User("Maggie","Greene",date, "mgreene@jmail.com"));
		_users.add(new User("Carl","Grimes",date, "cgrimes@jmail.com"));
		_users.add(new User("Hershel","Greene",date, "hgreene@jmail.com"));
		_users.add(new User("Shane","Walsh",date, "swalsh@jmail.com"));
	}
	
	public ArrayList<User> GetUsers(){
		
		return _users;
	}
	
	public User GetUserByName(String name){
		
		User user = new User();
				
		for(User userItem : _users)
		{
			if(userItem.getFirstName().equals(name))
			{
				user = userItem;
				break;
			}
		}
		
		return user;
	}
	
    public User UpdateUser(String name, String newName){
		
    	User user = new User();
    	
    	for(User userItem : _users){
    		if(userItem.getFirstName().equals(name)){
    			userItem.setFirstName(newName);
    			user = userItem;
    			break;
    		}
    	}
    	
		return user;
	} 
    
    public ArrayList<User> DeleteUserByName(String name){
		
    	for(User userItem : _users){
    		if(userItem.getFirstName().equals(name)){
    			_users.remove(userItem);
    			break;
    		}
    	}
    	
		return _users;
	}
}
