/**
 * 
 */
package Entity;

/**
 * @author OsBulb
 *
 */
public class User {
	private String _firstName;
	private String _lastName;
	private String _dateCreated;
	private String _email;

	public User(){}

	public User(String firstName, String lastName, String dateCreated, String email){
		_firstName = firstName;
		_lastName = lastName;
		_dateCreated = dateCreated;
		_email = email;
	}
	
	public String getFirstName() {
		return _firstName;
	}
	public void setFirstName(String _firstName) {
		this._firstName = _firstName;
	}
	public String getLastName() {
		return _lastName;
	}
	public void setLastName(String _lastName) {
		this._lastName = _lastName;
	}
	public String getDateCreated() {
		return _dateCreated;
	}
	public void setDateCreated(String _dateCreated) {
		this._dateCreated = _dateCreated;
	}
	public String getEmail() {
		return _email;
	}
	public void setEmail(String _email) {
		this._email = _email;
	}
}
