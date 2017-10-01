/**
 * 
 */
package Adapters;

/**
 * @author OsBulb
 *
 */
public class UserUpdateAdapterRequest {
	
	private String _name;
	private String _newName;
	
	public UserUpdateAdapterRequest(){}
	
	public UserUpdateAdapterRequest(String name, String newName){
		_name = name;
		_newName = newName;
	}
	
	public String get_name() {
		return _name;
	}
	public void setName(String _name) {
		this._name = _name;
	}
	public String getNewName() {
		return _newName;
	}
	public void setNewName(String _newName) {
		this._newName = _newName;
	}
	
	
}
