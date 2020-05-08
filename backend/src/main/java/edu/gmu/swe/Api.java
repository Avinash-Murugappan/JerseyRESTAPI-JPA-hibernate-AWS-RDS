package edu.gmu.swe;

import java.util.List;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.codejava.hibernate.Record;



/**
 * Root resource (exposed at "myresource" path)
 */
@Path("api")
public class Api {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to the
	 * client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getRecords")
	public List<Record> getRecord() {
		RecordManager manager = new RecordManager();
		manager.setup();
		List<Record> Records = manager.read();
		manager.exit();
		return Records;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("putRecord")
	public String putRecord(Record record) {
		System.out.println(record.toString());
		RecordManager manager = new RecordManager();
		manager.setup();
		manager.insert(record);
		manager.exit();
		return "{\"status\":\"success\"}";
	}
}
