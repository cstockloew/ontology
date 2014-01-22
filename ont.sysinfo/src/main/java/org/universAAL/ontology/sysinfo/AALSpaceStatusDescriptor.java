package org.universAAL.ontology.sysinfo;

/**
 * Ontological representation of AALSpaceStatusDescriptor in the sysinfo ontology. Methods
 * included in this class are the mandatory ones for representing an ontological
 * concept in Java classes for the universAAL platform. In addition getters and
 * setters for properties are included.
 * 
 * @author
 * @author Generated by the OntologyUML2Java transformation of AAL Studio
 */
public class AALSpaceStatusDescriptor extends Descriptor {
    public static final String MY_URI = SysinfoOntology.NAMESPACE
	    + "AALSpaceStatusDescriptor";

    public AALSpaceStatusDescriptor() {
	super();
    }

    public AALSpaceStatusDescriptor(String uri) {
	super(uri);
    }

    public String getClassURI() {
	return MY_URI;
    }

    public int getPropSerializationType(String propURI) {
	return super.getPropSerializationType(propURI);
    }

    public boolean isWellFormed() {
	return super.isWellFormed();
    }

}
