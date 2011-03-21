/*
	Copyright 2008-2010 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer-Gesellschaft - Institute of Computer Graphics Research 
	
	Copyright 2008-2010 R&S Info, http://www.rsinfo.eu
	R&S INFO s.r.l. 
	
	See the NOTICE file distributed with this work for additional 
	information regarding copyright ownership
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
*/
package org.universAAL.ontology.device.home;

import org.universAAL.middleware.owl.ManagedIndividual;
import org.universAAL.middleware.owl.Restriction;
import org.universAAL.middleware.rdf.TypeMapper;
import org.universAAL.ontology.phThing.Device;

/**
 * @author amoretti, chwirth
 *
 */
public class TV extends Device {
	public static final String MY_URI;
	public static final String PROP_IS_ON_PROG;
	public static final String PROP_IS_ON_COMM;
	static {
		MY_URI = Device.uAAL_DEVICE_NAMESPACE + "TV";
		PROP_IS_ON_PROG = Device.uAAL_DEVICE_NAMESPACE + "isOnProg";
		PROP_IS_ON_COMM = Device.uAAL_DEVICE_NAMESPACE + "isOnComm";
		register(TV.class);
	}
	
	public static Restriction getClassRestrictionsOnProperty(String propURI) {
		if (PROP_IS_ON_PROG.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, TypeMapper.getDatatypeURI(Boolean.class), 1, 1);
		if (PROP_IS_ON_COMM.equals(propURI))
			return Restriction.getAllValuesRestrictionWithCardinality(propURI, TypeMapper.getDatatypeURI(Boolean.class), 1, 1);
		return ManagedIndividual.getClassRestrictionsOnProperty(propURI);
	}
	
	public static String getRDFSComment() {
		return "The class of all TVs.";
	}
	
	public static String getRDFSLabel() {
		return "TV";
	}
	
	public TV() {
		super();
	}
	
	public TV(String uri) {
		super(uri);
	}
	
	public TV(String uri, Boolean isOnProg, Boolean isOnComm) {
		super(uri);
		
		if ((isOnProg == null) || (isOnComm == null))
			throw new IllegalArgumentException();
		
		props.put(PROP_IS_ON_PROG, isOnProg);
		props.put(PROP_IS_ON_COMM, isOnComm);
	}
	
	public Boolean isOnComm() {
		return (Boolean) props.get(PROP_IS_ON_COMM);
	}
	
	public Boolean isOnProg() {
		return (Boolean) props.get(PROP_IS_ON_PROG);
	}
	
	public void setOnProg(Boolean b) {
		if(b != null)
			props.put(PROP_IS_ON_PROG,b);
	}
	
	
	/* (non-Javadoc)
	 * @see org.persona.ontology.ManagedIndividual#getPropSerializationType(java.lang.String)
	 */
	public int getPropSerializationType(String propURI) {
		return PROP_SERIALIZATION_FULL;
	}

	/* (non-Javadoc)
	 * @see org.persona.ontology.ManagedIndividual#isWellFormed()
	 */
	public boolean isWellFormed() {
		return props.containsKey(PROP_IS_ON_PROG)
		&& props.containsKey(PROP_IS_ON_COMM);
	}
}