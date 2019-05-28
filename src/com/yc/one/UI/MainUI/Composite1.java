package com.yc.one.UI.MainUI;

import com.swtdesigner.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;


public class Composite1 extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Composite1(Composite parent, int style) {
		super(parent, style);
		
		Button button = new Button(this, SWT.NONE);
		button.setBounds(502, 0, 98, 30);
		button.setText("返回上一页");
		
		Button button_1 = new Button(this, SWT.NONE);
		button_1.setBounds(502, 33, 98, 30);
		button_1.setText("返回主界面");
		
		Button button_2 = new Button(this, SWT.NONE);
		button_2.setImage(SWTResourceManager.getImage(Composite1.class, "/images/13.jpg"));
		button_2.setBounds(0, 0, 200, 329);
		
		Button button_3 = new Button(this, SWT.NONE);
		button_3.setImage(SWTResourceManager.getImage(Composite1.class, "/images/14.jpg"));
		button_3.setBounds(400, 127, 200, 329);
		
		Button button_4 = new Button(this, SWT.NONE);
		button_4.setImage(SWTResourceManager.getImage(Composite1.class, "/images/15.jpg"));
		button_4.setBounds(200, 261, 200, 329);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
