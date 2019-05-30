package com.yc.one.UI.PayUI;

import com.swtdesigner.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;


public class Composite3 extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Composite3(Composite parent, int style) {
		super(parent, style);
		
		Button button = new Button(this, SWT.CHECK);
		button.setBounds(251, 180, 16, 20);
		
		Button button_1 = new Button(this, SWT.CHECK);
		button_1.setBounds(305, 180, 16, 20);
		
		Button button_2 = new Button(this, SWT.CHECK);
		button_2.setBounds(196, 235, 16, 20);
		
		Button button_3 = new Button(this, SWT.CHECK);
		button_3.setBounds(251, 235, 16, 20);
		
		Button button_4 = new Button(this, SWT.CHECK);
		button_4.setBounds(305, 235, 16, 20);
		
		Button button_5 = new Button(this, SWT.CHECK);
		button_5.setBounds(361, 235, 16, 20);
		
		Label label = new Label(this, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 20, SWT.NORMAL));
		label.setBounds(246, 39, 75, 52);
		label.setText("荧幕");
		
		Label label_1 = new Label(this, SWT.NONE);
		label_1.setBounds(56, 180, 76, 20);
		label_1.setText("1");
		
		Button button_6 = new Button(this, SWT.CHECK);
		button_6.setBounds(196, 292, 16, 20);
		
		Button button_7 = new Button(this, SWT.CHECK);
		button_7.setBounds(251, 292, 16, 20);
		
		Button button_8 = new Button(this, SWT.CHECK);
		button_8.setBounds(305, 292, 16, 20);
		
		Button button_9 = new Button(this, SWT.CHECK);
		button_9.setBounds(361, 292, 16, 20);
		
		Button button_10 = new Button(this, SWT.CHECK);
		button_10.setBounds(196, 355, 16, 20);
		
		Button button_11 = new Button(this, SWT.CHECK);
		button_11.setBounds(361, 355, 16, 20);
		
		Label label_2 = new Label(this, SWT.NONE);
		label_2.setBounds(56, 235, 76, 20);
		label_2.setText("2");
		
		Label label_3 = new Label(this, SWT.NONE);
		label_3.setBounds(56, 292, 76, 20);
		label_3.setText("3");
		
		Label label_4 = new Label(this, SWT.NONE);
		label_4.setBounds(56, 355, 76, 20);
		label_4.setText("4");
		
		Label label_5 = new Label(this, SWT.NONE);
		label_5.setBounds(196, 424, 24, 20);
		label_5.setText("1");
		
		Label label_6 = new Label(this, SWT.NONE);
		label_6.setBounds(251, 424, 24, 20);
		label_6.setText("2");
		
		Label label_7 = new Label(this, SWT.NONE);
		label_7.setBounds(305, 424, 24, 20);
		label_7.setText("3");
		
		Label label_8 = new Label(this, SWT.NONE);
		label_8.setBounds(361, 424, 76, 20);
		label_8.setText("4");
		
		Button button_12 = new Button(this, SWT.NONE);
		button_12.setBounds(451, 530, 98, 30);
		button_12.setText("确定");
		
		Button button_13 = new Button(this, SWT.NONE);
		button_13.setBounds(475, 22, 98, 30);
		button_13.setText("返回上一页");
		
		Button button_14 = new Button(this, SWT.NONE);
		button_14.setBounds(475, 91, 98, 30);
		button_14.setText("返回主界面");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
