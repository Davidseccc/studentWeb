package cz.secda1.studentWeb.rest;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("test")
public class HelloTest {
    @GET
    public Response sayHello(){
        JsonObject jsonObject = Json.createObjectBuilder().add("response", "Hello World").build();
        return Response.ok(jsonObject).build();
    }
}
