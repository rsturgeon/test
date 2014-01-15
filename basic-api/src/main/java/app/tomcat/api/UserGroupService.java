package app.tomcat.api;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface UserGroupService {
  @Path("usersGroups")
  @GET
  @Produces({MediaType.APPLICATION_JSON})
  String listUserGroups();
}
