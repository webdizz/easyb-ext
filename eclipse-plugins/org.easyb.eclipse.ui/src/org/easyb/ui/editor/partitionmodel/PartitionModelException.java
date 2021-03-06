package org.easyb.ui.editor.partitionmodel;

import org.easyb.ui.EasybUIActivator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class PartitionModelException extends CoreException {

	private static final long serialVersionUID = 3724487365010485400L;

	public PartitionModelException(IStatus status) {
		super(status);
	}
	
	public PartitionModelException(String message,Exception ex) {
		super(new Status(IStatus.ERROR,
				EasybUIActivator.PLUGIN_ID,message, ex));
	}

}
