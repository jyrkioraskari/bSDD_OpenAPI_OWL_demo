package de.rwth_aachen.dc.bsdd_owl.model;

import java.util.List;


public class DomainSearchResultContractV2 {
	private String name = null;
	private String namespaceUri = null;
	private List<ClassificationSearchResultContractV2> classifications = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNamespaceUri() {
		return namespaceUri;
	}

	public void setNamespaceUri(String namespaceUri) {
		this.namespaceUri = namespaceUri;
	}

	public List<ClassificationSearchResultContractV2> getClassifications() {
		return classifications;
	}

	public void setClassifications(List<ClassificationSearchResultContractV2> classifications) {
		this.classifications = classifications;
	}

}
