package cn.supreme.ws.cxf_rest.server;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@WebService
@Path("/student")
public interface StudentInterface {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/query/{id}/{name}")
	public Student query(@PathParam("id")int id,@PathParam("name")String name);
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/queryList")
	public List<Student> queryList();
}
