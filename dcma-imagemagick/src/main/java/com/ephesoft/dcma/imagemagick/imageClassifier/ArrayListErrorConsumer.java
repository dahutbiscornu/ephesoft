/********************************************************************************* 
* Ephesoft is a Intelligent Document Capture and Mailroom Automation program 
* developed by Ephesoft, Inc. Copyright (C) 2010-2011 Ephesoft Inc. 
* 
* This program is free software; you can redistribute it and/or modify it under 
* the terms of the GNU Affero General Public License version 3 as published by the 
* Free Software Foundation with the addition of the following permission added 
* to Section 15 as permitted in Section 7(a): FOR ANY PART OF THE COVERED WORK 
* IN WHICH THE COPYRIGHT IS OWNED BY EPHESOFT, EPHESOFT DISCLAIMS THE WARRANTY 
* OF NON INFRINGEMENT OF THIRD PARTY RIGHTS. 
* 
* This program is distributed in the hope that it will be useful, but WITHOUT 
* ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS 
* FOR A PARTICULAR PURPOSE.  See the GNU Affero General Public License for more 
* details. 
* 
* You should have received a copy of the GNU Affero General Public License along with 
* this program; if not, see http://www.gnu.org/licenses or write to the Free 
* Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 
* 02110-1301 USA. 
* 
* You can contact Ephesoft, Inc. headquarters at 111 Academy Way, 
* Irvine, CA 92617, USA. or at email address info@ephesoft.com. 
* 
* The interactive user interfaces in modified source and object code versions 
* of this program must display Appropriate Legal Notices, as required under 
* Section 5 of the GNU Affero General Public License version 3. 
* 
* In accordance with Section 7(b) of the GNU Affero General Public License version 3, 
* these Appropriate Legal Notices must retain the display of the "Ephesoft" logo. 
* If the display of the logo is not reasonably feasible for 
* technical reasons, the Appropriate Legal Notices must display the words 
* "Powered by Ephesoft". 
********************************************************************************/ 

package com.ephesoft.dcma.imagemagick.imageClassifier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.im4java.process.ErrorConsumer;

/**
 * This class is an ErrorConsumer which saves the Error to an ArrayList.
 * 
 * @author Ephesoft
 */

public class ArrayListErrorConsumer implements ErrorConsumer {

	// ////////////////////////////////////////////////////////////////////////////

	/**
	 * The output list.
	 */

	private ArrayList<String> iOutputLines = new ArrayList<String>();

	// ////////////////////////////////////////////////////////////////////////////

	/**
	 * Default Constructor.
	 */

	public ArrayListErrorConsumer() {
	}

	// ////////////////////////////////////////////////////////////////////////////

	/**
	 * Return array with output-lines.
	 */

	public ArrayList<String> getOutput() {
		return iOutputLines;
	}

	// ////////////////////////////////////////////////////////////////////////////

	/**
	 * Clear the output.
	 */

	public void clear() {
		iOutputLines.clear();
	}

	// ////////////////////////////////////////////////////////////////////////////

	/**
	 * Read command Error and save in an internal field.
	 */

	public void consumeError(InputStream pInputStream) throws IOException {
		InputStreamReader isr = new InputStreamReader(pInputStream);
		BufferedReader reader = new BufferedReader(isr);
		String line;
		while ((line = reader.readLine()) != null) {
			iOutputLines.add(line);
		}
		if (reader != null) {
			reader.close();
		}
		if (isr != null) {
			isr.close();
		}
	}
}
