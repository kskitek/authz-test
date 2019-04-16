package pl.ks;

import io.helidon.security.annotations.Authorized;
import org.apache.shiro.SecurityUtils;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/authz")
@Authorized
@RequestScoped
public class AuthzResource {

    @GET
    @Path("/zone")
    @Authorized
    public Response zone() {
//        SecurityUtils.getSubject().
        return Response.ok().build();
    }
}
