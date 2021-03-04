
package de.rwth_aachen.dc.bsdd_owl.model;

import java.util.List;

public class ClassificationSearchResultContractV2 {
  private String name = null;
  private String namespaceUri = null;
  private String definition = null;
  private List<String> synonyms = null;
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
public String getDefinition() {
	return definition;
}
public void setDefinition(String definition) {
	this.definition = definition;
}
public List<String> getSynonyms() {
	return synonyms;
}
public void setSynonyms(List<String> synonyms) {
	this.synonyms = synonyms;
}


}
