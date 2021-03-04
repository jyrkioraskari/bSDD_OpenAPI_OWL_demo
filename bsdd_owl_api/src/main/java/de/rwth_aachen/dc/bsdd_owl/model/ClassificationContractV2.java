
package de.rwth_aachen.dc.bsdd_owl.model;

import java.time.OffsetDateTime;
import java.util.List;

public class ClassificationContractV2 {
  private List<String> synonyms = null;
  private List<String> relatedIfcEntityNames = null;

  private ClassificationReferenceContractV2 parentClassificationReference = null;
  private List<ClassificationPropertyContractV2> classificationProperties = null;

  private List<ClassificationRelationContractV2> classificationRelations = null;

  private List<ClassificationReferenceContractV2> childClassificationReferences = null;

  private String code = null;

  private String uid = null;

  private String namespaceUri = null;

  private String name = null;

  private String definition = null;

  private String status = null;

  private String activationDateUtc = null;

  private String revisionDateUtc = null;

  private String versionDateUtc = null;

  private String deActivationDateUtc = null;

  private Integer versionNumber = null;

  private Integer revisionNumber = null;

  private String replacedObjectCodes = null;

  private String replacingObjectCodes = null;

  private String deprecationExplanation = null;

  private String creatorLanguageCode = null;

  private String visualRepresentationUri = null;

  private String countriesOfUse = null;

  private String subdivisionsOfUse = null;

  private String countryOfOrigin = null;

  private String documentReference = null;

public List<String> getSynonyms() {
	return synonyms;
}

public void setSynonyms(List<String> synonyms) {
	this.synonyms = synonyms;
}

public List<String> getRelatedIfcEntityNames() {
	return relatedIfcEntityNames;
}

public void setRelatedIfcEntityNames(List<String> relatedIfcEntityNames) {
	this.relatedIfcEntityNames = relatedIfcEntityNames;
}

public ClassificationReferenceContractV2 getParentClassificationReference() {
	return parentClassificationReference;
}

public void setParentClassificationReference(ClassificationReferenceContractV2 parentClassificationReference) {
	this.parentClassificationReference = parentClassificationReference;
}

public List<ClassificationPropertyContractV2> getClassificationProperties() {
	return classificationProperties;
}

public void setClassificationProperties(List<ClassificationPropertyContractV2> classificationProperties) {
	this.classificationProperties = classificationProperties;
}

public List<ClassificationRelationContractV2> getClassificationRelations() {
	return classificationRelations;
}

public void setClassificationRelations(List<ClassificationRelationContractV2> classificationRelations) {
	this.classificationRelations = classificationRelations;
}

public List<ClassificationReferenceContractV2> getChildClassificationReferences() {
	return childClassificationReferences;
}

public void setChildClassificationReferences(List<ClassificationReferenceContractV2> childClassificationReferences) {
	this.childClassificationReferences = childClassificationReferences;
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getUid() {
	return uid;
}

public void setUid(String uid) {
	this.uid = uid;
}

public String getNamespaceUri() {
	return namespaceUri;
}

public void setNamespaceUri(String namespaceUri) {
	this.namespaceUri = namespaceUri;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDefinition() {
	return definition;
}

public void setDefinition(String definition) {
	this.definition = definition;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getActivationDateUtc() {
	return activationDateUtc;
}

public void setActivationDateUtc(String activationDateUtc) {
	this.activationDateUtc = activationDateUtc;
}

public String getRevisionDateUtc() {
	return revisionDateUtc;
}

public void setRevisionDateUtc(String revisionDateUtc) {
	this.revisionDateUtc = revisionDateUtc;
}

public String getVersionDateUtc() {
	return versionDateUtc;
}

public void setVersionDateUtc(String versionDateUtc) {
	this.versionDateUtc = versionDateUtc;
}

public String getDeActivationDateUtc() {
	return deActivationDateUtc;
}

public void setDeActivationDateUtc(String deActivationDateUtc) {
	this.deActivationDateUtc = deActivationDateUtc;
}

public Integer getVersionNumber() {
	return versionNumber;
}

public void setVersionNumber(Integer versionNumber) {
	this.versionNumber = versionNumber;
}

public Integer getRevisionNumber() {
	return revisionNumber;
}

public void setRevisionNumber(Integer revisionNumber) {
	this.revisionNumber = revisionNumber;
}

public String getReplacedObjectCodes() {
	return replacedObjectCodes;
}

public void setReplacedObjectCodes(String replacedObjectCodes) {
	this.replacedObjectCodes = replacedObjectCodes;
}

public String getReplacingObjectCodes() {
	return replacingObjectCodes;
}

public void setReplacingObjectCodes(String replacingObjectCodes) {
	this.replacingObjectCodes = replacingObjectCodes;
}

public String getDeprecationExplanation() {
	return deprecationExplanation;
}

public void setDeprecationExplanation(String deprecationExplanation) {
	this.deprecationExplanation = deprecationExplanation;
}

public String getCreatorLanguageCode() {
	return creatorLanguageCode;
}

public void setCreatorLanguageCode(String creatorLanguageCode) {
	this.creatorLanguageCode = creatorLanguageCode;
}

public String getVisualRepresentationUri() {
	return visualRepresentationUri;
}

public void setVisualRepresentationUri(String visualRepresentationUri) {
	this.visualRepresentationUri = visualRepresentationUri;
}

public String getCountriesOfUse() {
	return countriesOfUse;
}

public void setCountriesOfUse(String countriesOfUse) {
	this.countriesOfUse = countriesOfUse;
}

public String getSubdivisionsOfUse() {
	return subdivisionsOfUse;
}

public void setSubdivisionsOfUse(String subdivisionsOfUse) {
	this.subdivisionsOfUse = subdivisionsOfUse;
}

public String getCountryOfOrigin() {
	return countryOfOrigin;
}

public void setCountryOfOrigin(String countryOfOrigin) {
	this.countryOfOrigin = countryOfOrigin;
}

public String getDocumentReference() {
	return documentReference;
}

public void setDocumentReference(String documentReference) {
	this.documentReference = documentReference;
}




}
