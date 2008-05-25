/* $Revision: 10774 $ $Author: egonw $ $Date: 2008-05-03 08:50:01 +0200 (Sat, 03 May 2008) $
 * 
 * Copyright (C) 2008  Egon Willighagen <egonw@users.sf.net>
 * 
 * Contact: cdk-devel@lists.sourceforge.net
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 * All we ask is that proper credit is given for our work, which includes
 * - but is not limited to - adding the above copyright notice to the beginning
 * of your source code files, and to any copyright notice that you may distribute
 * with programs based on this work.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package org.openscience.cdk.nonotify;

import org.openscience.cdk.formula.MolecularFormula;
import org.openscience.cdk.interfaces.IChemObjectBuilder;

/**
 * @cdk.module  nonotify
 * @cdk.svnrev  $Revision: 10774 $
 */
public class NNMolecularFormula extends MolecularFormula {
	
	public NNMolecularFormula() {
		super();
	}
	
	public IChemObjectBuilder getBuilder() {
	    return NoNotificationChemObjectBuilder.getInstance();
    }

}