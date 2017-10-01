package Entity;

import java.util.ArrayList;

public class DTOUser {
	
	private User _user;
	private ArrayList<User> _users;

	public DTOUser(){
		_users = new ArrayList<User>();
		_user = new User();
	}
	
	public User getUser() {
		return _user;
	}

	public void setUser(User _user) {
		this._user = _user;
	}

	public ArrayList<User> getUsers() {
		return _users;
	}

	public void setUsers(ArrayList<User> _users) {
		this._users = _users;
	}
	
	
}
