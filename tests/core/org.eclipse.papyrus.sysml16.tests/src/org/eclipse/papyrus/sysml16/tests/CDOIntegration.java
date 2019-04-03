/*****************************************************************************
 * Copyright (c) 2019 CEA LIST, and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Nicolas FAUVERGUE (CEA LIST) nicolas.fauvergue@cea.fr - Initial API and implementation
 *
 *****************************************************************************/

package org.eclipse.papyrus.sysml16.tests;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.papyrus.sysml16.sysml.SysMLPackage;
import org.eclipse.papyrus.sysml16.blocks.BlocksPackage;
import org.junit.Test;

/**
 * This class is here to check that the profile will work correctly with CDO
 * The solution to have something working is:
 *  - adding a DummyElement in the .ecore (not in the profile)
 *  - it will generate the correct code
 *  - this test will catch any regression
 *  
 *  This is clearly not a "good" solution and is open to improvement, but:
 *    - avoid changing the profile (Keep the normative file)
 *    - avoid using/maintain a custom generator
 */
public class CDOIntegration {

	
	@Test
	public void testBlock() {
		checkCrossResourceURIs(BlocksPackage.eINSTANCE); 
		checkCrossResourceURIs(SysMLPackage.eINSTANCE);		
	}
	
	 // This method is copy-pasted from CDOUTIL (do not modify it)
	  public static void checkCrossResourceURIs(EPackage ePackage)
	  {
	    TreeIterator<EObject> it = ePackage.eAllContents();
	    while (it.hasNext())
	    {
	      EObject e = it.next();

	      if (e instanceof EAnnotation)
	      {
	        // we don't need to validate the structure of annotations. The applications that
	        // define annotations will have to take what they can get
	        it.prune();
	      }
	      else
	      {
	        for (EObject r : e.eCrossReferences())
	        {
	          EObject refTarget = null;

	          if (r.eIsProxy())
	          {
	            String msg = "Package '%s' contains unresolved proxy '%s'"; //$NON-NLS-1$
	            msg = String.format(msg, ePackage.getNsURI(), ((InternalEObject)r).eProxyURI());
	            throw new IllegalStateException(msg);
	          }

	          if (r.eResource() != null && r.eResource() != e.eResource())
	          {
	            // It's a ref into another resource
	            EPackage pkg = null;
	            if (r instanceof EClassifier)
	            {
	              refTarget = r;
	              pkg = ((EClassifier)r).getEPackage();
	            }
	            else if (r instanceof EStructuralFeature)
	            {
	              refTarget = r;
	              EStructuralFeature feature = (EStructuralFeature)r;
	              EClass ownerClass = (EClass)feature.eContainer();
	              pkg = ownerClass.getEPackage();
	            }
	            else if (r instanceof EGenericType)
	            {
	              EGenericType genType = (EGenericType)r;
	              EClassifier c = genType.getEClassifier();
	              if (c != null)
	              {
	                refTarget = c;
	                pkg = c.getEPackage();
	              }
	            }

	            if (pkg == null)
	            {
	              continue;
	            }

	            while (pkg.getESuperPackage() != null)
	            {
	              pkg = pkg.getESuperPackage();
	            }

	            Resource eResource = refTarget.eResource();
				String resourceURI = eResource.getURI().toString();
	            if (!resourceURI.equals(pkg.getNsURI()))
	            {
	              String msg = "URI of the resource (%s) does not match the nsURI (%s) of the top-level package;%n" //$NON-NLS-1$
	                  + "this can be fixed by calling Resource.setURI(URI) after loading the packages,%n" //$NON-NLS-1$
	                  + "or by configuring a URI mapping from nsURI's to location URI's before loading the packages,%n" //$NON-NLS-1$
	                  + "and then loading them with their nsURI's"; //$NON-NLS-1$
	              msg = String.format(msg, resourceURI, pkg.getNsURI());
	              throw new IllegalStateException(msg);
	            }
	          }
	        }
	      }
	    }
	  }

	
}
