/**
 * Copyright 2011 Thorsten Höger, Taimos GmbH
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.taimos.gpsd4java.types;

/**
 * 
 * @author thoeger
 */
public enum EParity {
	
	/**
	 * 
	 */
	NO,
	/**
	 * 
	 */
	ODD,
	/**
	 * 
	 */
	EVEN;
	
	/**
	 * @param parity the parity string
	 * @return {@link EParity}
	 */
	public static EParity fromString(String parity) {
		if (parity == null) {
			return NO;
		}
		if (parity.equals("N")) {
			return NO;
		}
		if (parity.equals("O")) {
			return ODD;
		}
		if (parity.equals("E")) {
			return EVEN;
		}
		return NO;
	}
}
