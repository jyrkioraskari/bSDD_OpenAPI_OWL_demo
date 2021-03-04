package de.rwth_aachen.dc.bsdd_owl;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.jena.ontology.DatatypeProperty;
import org.apache.jena.ontology.ObjectProperty;
import org.apache.jena.ontology.OntClass;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.vocabulary.XSD;

import de.rwth_aachen.dc.bsdd_owl.model.ClassificationContractV2;
import de.rwth_aachen.dc.bsdd_owl.model.DomainContractV2;
import de.rwth_aachen.dc.bsdd_owl.model.SearchResultContractV2;

public class RESTClient_bSDD {
	private String bSDD_ns = "http://lbd.arch.rwth-aachen.de/bsDD/";
	private Client client = ClientBuilder.newClient();
	private OntModel ontology_model = ModelFactory.createOntologyModel();

	public RESTClient_bSDD() {
		//getDomainClassifications("http://identifier.buildingsmart.org/uri/buildingsmart/ifc-4.3");
		//getDomainClassificationsDetails("http://identifier.buildingsmart.org/uri/buildingsmart/ifc-4.3/class/IfcMaterial");
		//ontology_model.write(System.out, "TTL");

	}

	private SearchResultContractV2 getDomainClassifications(String domain_URI) {
		try {
			String encoded_uri = URLEncoder.encode(domain_URI, StandardCharsets.UTF_8.toString()); // TODO Check this
			System.out.println("https://bs-dd-api-prototype.azurewebsites.net/api/SearchListOpen/v2?DomainNamespaceUri="
					+ encoded_uri);
			SearchResultContractV2 res = client
					.target("https://bs-dd-api-prototype.azurewebsites.net/api/SearchListOpen/v2?DomainNamespaceUri="
							+ encoded_uri)
					.request(MediaType.APPLICATION_JSON).get(Response.class)
					.readEntity(new GenericType<SearchResultContractV2>() {
					});
			res.getDomains().forEach(domain -> {
				System.out.println("Domain name: " + domain.getName());
				domain.getClassifications().forEach(cl -> {
					System.out.println(" - class: " + cl.getName());
					// System.out.println(" - URI: "+cl.getNamespaceUri());
					OntClass oc = ontology_model.createClass(this.bSDD_ns + cl.getName());
					getDomainClassificationsDetails(oc, cl.getNamespaceUri());

				});
			});
			return res;

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return new SearchResultContractV2();
	}

	private ClassificationContractV2 getDomainClassificationsDetails(OntClass oc, String domain_class_uri) {
		try {
			String encoded_uri = URLEncoder.encode(domain_class_uri, StandardCharsets.UTF_8.toString());
			System.out.println(
					"https://bs-dd-api-prototype.azurewebsites.net/api/Classification/v2?namespaceUri=" + encoded_uri);
			ClassificationContractV2 res = client
					.target("https://bs-dd-api-prototype.azurewebsites.net/api/Classification/v2?namespaceUri="
							+ encoded_uri + "&includeChildClassificationReferences=true")
					.request(MediaType.APPLICATION_JSON).get(Response.class)
					.readEntity(new GenericType<ClassificationContractV2>() {
					});
			if (res.getClassificationProperties() != null)
				res.getClassificationProperties().forEach(cp -> {
					System.out.println("Property name: " + cp.getName());
					String dtype = cp.getDataType();
					System.out.println("Property description: " + cp.getDescription());
					OntClass oc_ps = ontology_model.createClass(this.bSDD_ns + cp.getPropertySet());

					ObjectProperty op_hasPset = ontology_model
							.createObjectProperty(this.bSDD_ns + "has" + cp.getPropertySet());
					op_hasPset.addDomain(oc);
					op_hasPset.addRange(oc_ps);

					DatatypeProperty dp_has = ontology_model
							.createDatatypeProperty(this.bSDD_ns + "has" + cp.getName());
					if (cp.getDescription() != null)
						dp_has.addComment(cp.getDescription(), "en");
					dp_has.addDomain(oc_ps);
					if (dtype.equals("real"))
						dp_has.addRange(XSD.xdouble);
					else if (dtype.equals("boolean"))
						dp_has.addRange(XSD.xboolean);
					else
						dp_has.addRange(XSD.xstring);
				});
			return res;

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return new ClassificationContractV2();
	}
	
	public ClassificationContractV2 getDomainClassificationsDetails(String class_name) {
		try {
			String encoded_uri = URLEncoder.encode("http://identifier.buildingsmart.org/uri/buildingsmart/ifc-4.3/class/"+class_name, StandardCharsets.UTF_8.toString());
			
			OntClass oc = ontology_model.createClass(this.bSDD_ns + class_name);
			//String encoded_uri = URLEncoder.encode(domain_class_uri, StandardCharsets.UTF_8.toString());
			System.out.println(
					"https://bs-dd-api-prototype.azurewebsites.net/api/Classification/v2?namespaceUri=" + encoded_uri);
			ClassificationContractV2 res = client
					.target("https://bs-dd-api-prototype.azurewebsites.net/api/Classification/v2?namespaceUri="
							+ encoded_uri + "&includeChildClassificationReferences=true")
					.request(MediaType.APPLICATION_JSON).get(Response.class)
					.readEntity(new GenericType<ClassificationContractV2>() {
					});
			if (res.getClassificationProperties() != null)
				res.getClassificationProperties().forEach(cp -> {
					System.out.println("Property name: " + cp.getName());
					String dtype = cp.getDataType();
					System.out.println("Property description: " + cp.getDescription());
					OntClass oc_ps = ontology_model.createClass(this.bSDD_ns + cp.getPropertySet());

					ObjectProperty op_hasPset = ontology_model
							.createObjectProperty(this.bSDD_ns + "has" + cp.getPropertySet());
					op_hasPset.addDomain(oc);
					op_hasPset.addRange(oc_ps);

					DatatypeProperty dp_has = ontology_model
							.createDatatypeProperty(this.bSDD_ns + "has" + cp.getName());
					if (cp.getDescription() != null)
						dp_has.addComment(cp.getDescription(), "en");
					dp_has.addDomain(oc_ps);
					if (dtype.equals("real"))
						dp_has.addRange(XSD.xdouble);
					else if (dtype.equals("boolean"))
						dp_has.addRange(XSD.xboolean);
					else
						dp_has.addRange(XSD.xstring);
				});
			return res;

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		return new ClassificationContractV2();
	}

	private List<DomainContractV2> getDomains() {
		List<DomainContractV2> list = client.target("https://bs-dd-api-prototype.azurewebsites.net/api/Domain/v2")
				.request(MediaType.APPLICATION_JSON).get(Response.class)
				.readEntity(new GenericType<List<DomainContractV2>>() {
				});
		list.forEach(domain -> {
			System.out.println("domain: " + domain.getName());
		});
		return list;
	}
	
	

	public OntModel getOntology_model() {
		return ontology_model;
	}

	public static void main(String[] args) {
		new RESTClient_bSDD();

	}

}
