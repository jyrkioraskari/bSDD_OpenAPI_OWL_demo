
package de.rwth_aachen.dc.bsdd_owl.model;

public class ClassificationRelationContractV2 {
	private String relationType = null;
	private String relatedClassificationUri = null;
	private String relatedClassificationName = null;

	public String getRelationType() {
		return relationType;
	}

	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}

	public String getRelatedClassificationUri() {
		return relatedClassificationUri;
	}

	public void setRelatedClassificationUri(String relatedClassificationUri) {
		this.relatedClassificationUri = relatedClassificationUri;
	}

	public String getRelatedClassificationName() {
		return relatedClassificationName;
	}

	public void setRelatedClassificationName(String relatedClassificationName) {
		this.relatedClassificationName = relatedClassificationName;
	}

}
