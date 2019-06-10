package com.yc.one.UI.MainUI;

import com.swtdesigner.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;

public class IndexUI extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public IndexUI(Composite parent, int style) {
		super(parent, style);
		setBackgroundImage(SWTResourceManager.getImage(IndexUI.class, "/image/复联.jpg"));

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
