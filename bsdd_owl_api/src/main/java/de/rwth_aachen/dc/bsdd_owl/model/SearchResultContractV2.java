
package de.rwth_aachen.dc.bsdd_owl.model;

import java.util.List;

public class SearchResultContractV2 {
	private Integer numberOfClassificationsFound = null;

	private List<DomainSearchResultContractV2> domains = null;

	public Integer getNumberOfClassificationsFound() {
		return numberOfClassificationsFound;
	}

	public void setNumberOfClassificationsFound(Integer numberOfClassificationsFound) {
		this.numberOfClassificationsFound = numberOfClassificationsFound;
	}

	public List<DomainSearchResultContractV2> getDomains() {
		return domains;
	}

	public void setDomains(List<DomainSearchResultContractV2> domains) {
		this.domains = domains;
	}

}
