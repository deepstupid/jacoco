/*******************************************************************************
 * Copyright (c) 2009, 2016 Mountainminds GmbH & Co. KG and Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Marc R. Hoffmann - initial API and implementation
 *    
 *******************************************************************************/
package org.jacoco.core.analysis;

import com.gs.collections.api.bag.Bag;
import com.gs.collections.api.bag.MutableBag;
import com.gs.collections.api.list.ImmutableList;

import java.util.List;

/**
 * Coverage data of a single method. The name of this node is the local method
 * name.
 */
public interface IMethodCoverage extends ISourceNode {

	/**
	 * Returns the descriptor of the method.
	 * 
	 * @return descriptor
	 */
	public String getDesc();

	/**
	 * Returns the generic signature of the method if defined.
	 * 
	 * @return generic signature or <code>null</code>
	 */
	public String getSignature();

	/** a bag for each unique sequence of arguments, holding all observed values input */
	public MutableBag<ImmutableList> values();

}