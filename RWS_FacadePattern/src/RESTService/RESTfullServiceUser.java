/**
 * 
 */
package RESTService;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Adapters.UserAdapterRequest;
import Adapters.UserAdapterResponse;
import Adapters.UserUpdateAdapterRequest;
import Facade.UserFecade;

/**
 * @author OsBulb
 *
 */
@RequestScoped
@Path("User")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class RESTfullServiceUser {
	
	private UserFecade _userFecade;
	private UserAdapterResponse _userAdapterResponse;
	
	public RESTfullServiceUser(){
		_userFecade = new UserFecade();
		_userAdapterResponse = new UserAdapterResponse();
	}
	
	@GET
	@Path("/RandomTest/")
	@Produces(MediaType.APPLICATION_JSON)
	public UserAdapterResponse getJSON() {
		UserAdapterRequest userAdapterRequest = new UserAdapterRequest();
		UserAdapterResponse userAdapterResponse = new UserAdapterResponse();
		
		try{
			userAdapterResponse = _userFecade.GetUsers(userAdapterRequest);
		}catch(Exception ex){
			
		}
		
		return userAdapterResponse;
	}
	
	@POST
	@Path("/List/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public UserAdapterResponse GetUsers(UserAdapterRequest userAdapterRequest) {
		try{
			_userAdapterResponse = _userFecade.GetUsers(userAdapterRequest);
		}catch(Exception ex){
			
		}
		
		return _userAdapterResponse;
	}
	
	@POST
	@Path("/SingleUser/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public UserAdapterResponse GetUser(UserAdapterRequest userAdapterRequest) {
		try{
			_userAdapterResponse = _userFecade.GetSingleUser(userAdapterRequest);
		}catch(Exception ex){
			
		}
		
		return _userAdapterResponse;
	}
	
	@PUT
	@Path("/Update/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public UserAdapterResponse UpdateUser(UserUpdateAdapterRequest userUpdateAdapterRequest) {
		try{
			_userAdapterResponse = _userFecade.UpdateUser(userUpdateAdapterRequest);
		}catch(Exception ex){
			
		}
		
		return _userAdapterResponse;
	}
	
	@DELETE
	@Path("/Delete/")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public UserAdapterResponse DeleteUser(UserAdapterRequest userAdapterRequest) {
		try{
			_userAdapterResponse = _userFecade.DeleteUser(userAdapterRequest);
		}catch(Exception ex){
			
		}
		
		return _userAdapterResponse;
	}
}
