package com.yc.one.UI.MainUI;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

public class Composite5 extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Composite5(Composite parent, int style) {
		super(parent, style);
		
		Label label = new Label(this, SWT.NONE);
		label.setBounds(40, 39, 135, 20);
		label.setText("你所选择的电影为：");
		
		Label label_1 = new Label(this, SWT.NONE);
		label_1.setBounds(129, 82, 39, 20);
		label_1.setText("日期：");
		
		Label label_2 = new Label(this, SWT.NONE);
		label_2.setBounds(129, 131, 39, 20);
		label_2.setText("时间：");
		
		Label label_3 = new Label(this, SWT.NONE);
		label_3.setBounds(114, 188, 53, 20);
		label_3.setText("座位号：");
		
		Label label_4 = new Label(this, SWT.NONE);
		label_4.setBounds(86, 277, 89, 20);
		label_4.setText("所选套餐为：");
		
		Label label_5 = new Label(this, SWT.NONE);
		label_5.setBounds(129, 332, 39, 20);
		label_5.setText("数量：");
		
		Label label_6 = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_6.setBounds(70, 251, 460, 2);
		
		Label label_7 = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_7.setBounds(70, 393, 460, 2);
		
		Label label_8 = new Label(this, SWT.NONE);
		label_8.setBounds(99, 475, 76, 20);
		label_8.setText("总价格为：");
		
		Button button = new Button(this, SWT.NONE);
		button.setBounds(470, 547, 98, 30);
		button.setText("确认支付");
		
		Button button_1 = new Button(this, SWT.NONE);
		button_1.setBounds(481, 20, 98, 30);
		button_1.setText("上一页");
		
		Button button_2 = new Button(this, SWT.NONE);
		button_2.setBounds(481, 82, 98, 30);
		button_2.setText("返回主界面");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
