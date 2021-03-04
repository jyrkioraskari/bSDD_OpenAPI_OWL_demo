package de.rwth_aachen.dc.bsdd_owl_api.rest;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;

import de.rwth_aachen.dc.bsdd_owl.RESTClient_bSDD;

/*
 * Jyrki Oraskari, 2021
 */

@Path("/")
public class OPEN_API_bSDD_OWL {

	@GET
	@Path("/owl/ifc/4.3/{class_name}")
	@Produces({ "text/turtle" }) 
	public Response get_owl(@PathParam("class_name") String class_name ) {
		RESTClient_bSDD bsdd_server_api=new RESTClient_bSDD();
		bsdd_server_api.getDomainClassificationsDetails(class_name.trim());
		StringBuilder result_string = new StringBuilder();
		Model m=bsdd_server_api.getOntology_model();
		extractIfcOWLtoB4R(m, result_string, RDFFormat.TURTLE_PRETTY);
		return Response.ok(result_string.toString(), "text/turtle").build();
	}
	
	private void extractIfcOWLtoB4R(Model m, StringBuilder result_string, RDFFormat rdfformat) {

		OutputStream ttl_output = new OutputStream() {
			private StringBuilder string = new StringBuilder();

			@Override
			public void write(int b) throws IOException {
				this.string.append((char) b);
			}

			public String toString() {
				return this.string.toString();
			}
		};
		RDFDataMgr.write(ttl_output, m, rdfformat);
		result_string.append(ttl_output.toString());
	}


}