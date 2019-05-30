package com.yc.one.UI.PayUI;

import com.swtdesigner.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.jface.text.TextViewer;

public class Composite4 extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Composite4(Composite parent, int style) {
		super(parent, style);
		
		Label label = new Label(this, SWT.NONE);
		label.setBounds(54, 28, 165, 20);
		label.setText("是否需要以下观影套餐？");
		
		Label label_1 = new Label(this, SWT.NONE);
		label_1.setImage(SWTResourceManager.getImage(Composite4.class, "/images/17.jpg"));
		label_1.setBounds(54, 125, 100, 100);
		
		Label lbloz = new Label(this, SWT.NONE);
		lbloz.setBounds(174, 125, 211, 50);
		lbloz.setText("32oz爆米花1桶\r\n+12oz可乐/雪碧/芬达（3选1）");
		
		Label label_2 = new Label(this, SWT.NONE);
		label_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_2.setBounds(174, 192, 71, 30);
		label_2.setText("￥16.7");
		
		TextViewer textViewer = new TextViewer(this, SWT.BORDER);
		StyledText styledText = textViewer.getTextWidget();
		styledText.setText("0");
		styledText.setBounds(422, 151, 71, 24);
		
		Label label_3 = new Label(this, SWT.NONE);
		label_3.setBounds(264, 200, 41, 20);
		label_3.setText("￥20");
		
		Label label_4 = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_4.setBounds(268, 210, 34, 2);
		
		Label label_5 = new Label(this, SWT.NONE);
		label_5.setImage(SWTResourceManager.getImage(Composite4.class, "/images/18.jpg"));
		label_5.setBounds(54, 250, 100, 100);
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setBounds(176, 253, 192, 40);
		lblNewLabel.setText("46oz爆米花1桶\r\n+2杯16oz可乐/雪碧/芬达");
		
		Label label_6 = new Label(this, SWT.NONE);
		label_6.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_6.setBounds(174, 314, 71, 30);
		label_6.setText("￥31");
		
		Label label_7 = new Label(this, SWT.NONE);
		label_7.setBounds(241, 322, 34, 20);
		label_7.setText("￥35");
		
		Label label_8 = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_8.setBounds(241, 331, 34, 2);
		
		TextViewer textViewer_1 = new TextViewer(this, SWT.BORDER);
		StyledText styledText_1 = textViewer_1.getTextWidget();
		styledText_1.setText("0");
		styledText_1.setBounds(422, 269, 71, 24);
		
		Label lblNewLabel_1 = new Label(this, SWT.NONE);
		lblNewLabel_1.setImage(SWTResourceManager.getImage(Composite4.class, "/images/19.jpg"));
		lblNewLabel_1.setBounds(54, 375, 100, 100);
		
		Label lbloz_1 = new Label(this, SWT.NONE);
		lbloz_1.setBounds(174, 382, 172, 40);
		lbloz_1.setText("85oz爆米花1桶\r\n+3杯16oz可乐/雪碧/芬达");
		
		Label label_9 = new Label(this, SWT.NONE);
		label_9.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_9.setBounds(174, 437, 71, 30);
		label_9.setText("￥36.7");
		
		Label label_10 = new Label(this, SWT.NONE);
		label_10.setBounds(259, 447, 41, 20);
		label_10.setText("￥40");
		
		Label label_11 = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_11.setBounds(264, 457, 34, 2);
		
		TextViewer textViewer_2 = new TextViewer(this, SWT.BORDER);
		StyledText styledText_2 = textViewer_2.getTextWidget();
		styledText_2.setText("0");
		styledText_2.setBounds(422, 398, 71, 24);
		
		Button button = new Button(this, SWT.NONE);
		button.setBounds(457, 527, 98, 30);
		button.setText("去支付");
		
		Button button_1 = new Button(this, SWT.NONE);
		button_1.setBounds(479, 10, 98, 30);
		button_1.setText("返回上一页");
		
		Button button_2 = new Button(this, SWT.NONE);
		button_2.setBounds(479, 61, 98, 30);
		button_2.setText("返回主界面");
		
		Label label_12 = new Label(this, SWT.NONE);
		label_12.setBounds(83, 229, 41, 20);
		label_12.setText("套餐一");
		
		Label label_13 = new Label(this, SWT.NONE);
		label_13.setBounds(83, 350, 51, 20);
		label_13.setText("套餐二");
		
		Label label_14 = new Label(this, SWT.NONE);
		label_14.setBounds(83, 482, 51, 20);
		label_14.setText("套餐三");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
