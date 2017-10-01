/**
 * 
 */
package Adapters;

import Entity.DTOUser;

/**
 * @author OsBulb
 *
 */
public class ResultsResponse {
	
	private DTOUser _dtoUser;

	public ResultsResponse(){
		_dtoUser = new DTOUser();
	}
	
	public DTOUser getDtoUser() {
		return _dtoUser;
	}

	public void setDtoUser(DTOUser _dtoUser) {
		this._dtoUser = _dtoUser;
	}

		
}
