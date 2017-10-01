/**
 * 
 */
package Adapters;

/**
 * @author OsBulb
 *
 */
public class UserAdapterResponse {
	
	private ResultsResponse _resultResponse;

	public UserAdapterResponse(){
		_resultResponse = new ResultsResponse();
	}
	
	public ResultsResponse getResultResponse() {
		return _resultResponse;
	}

	public void setResultResponse(ResultsResponse _resultResponse) {
		this._resultResponse = _resultResponse;
	}
}
