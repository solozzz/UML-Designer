/*******************************************************************************
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.uml2.usage.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.obeonetwork.dsl.uml2.design.UMLDesignerPlugin;

/**
 * Initialize default preferences value.
 * 
 * @author Melanie Bats <a href="mailto:melanie.bats@obeo.fr">melanie.bats@obeo.fr</a>
 */
public class UsagePreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		UMLDesignerPlugin.getDefault().getPreferenceStore().setDefault(UsagePreferences.USAGE_USER_ANSWER_ID,
				IDialogConstants.ABORT_ID);
		UMLDesignerPlugin.getDefault().getPreferenceStore().setDefault(UsagePreferences.USAGE_ENABLED_ID,
				false);
	}
}
