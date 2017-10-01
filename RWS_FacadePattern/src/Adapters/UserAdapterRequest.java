/**
 * 
 */
package Adapters;

/**
 * @author OsBulb
 *
 */
public class UserAdapterRequest {
	
	private String name;
	
	public UserAdapterRequest(){}
	
	public UserAdapterRequest(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		this.name = _name;
	}
	
	
}
