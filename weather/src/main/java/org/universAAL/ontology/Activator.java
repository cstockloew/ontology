/*
	Copyright 2008-2014 Fraunhofer IGD, http://www.igd.fraunhofer.de
	Fraunhofer Gesellschaft - Institut fuer Graphische Datenverarbeitung 
	
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
package org.universAAL.ontology;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class Activator implements BundleActivator {

	static BundleContext context = null;
	
	public void start(BundleContext context) throws Exception {
		Activator.context = context;
		Class.forName("org.universAAL.ontology.weather.HeaterActuator");
		Class.forName("org.universAAL.ontology.weather.RelHumiditySensor");
		Class.forName("org.universAAL.ontology.weather.Temperature");
		Class.forName("org.universAAL.ontology.weather.TempSensor");
	}
	
	public void stop(BundleContext arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}