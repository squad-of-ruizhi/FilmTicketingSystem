package com.yc.one.UI.MainUI;

import com.swtdesigner.SWTResourceManager;
import com.yc.one.Util.InitData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class DaZhenTan extends Composite {
	private Table table;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public DaZhenTan(Composite parent, int style) {
		super(parent, style);
		
		Label label = new Label(this, SWT.NONE);
		label.setImage(SWTResourceManager.getImage(DaZhenTan.class, "/image/16.jpg"));
		label.setBounds(34, 34, 100, 164);
		
		Label label_1 = new Label(this, SWT.NONE);
		label_1.setBounds(200, 50, 95, 20);
		label_1.setText("大侦探皮卡丘");
		
		Label label_2 = new Label(this, SWT.SEPARATOR | SWT.VERTICAL);
		label_2.setBounds(305, 50, 2, 20);
		
		Label label_3 = new Label(this, SWT.NONE);
		label_3.setBounds(322, 50, 45, 20);
		label_3.setText("8.5分");
		
		Label label_4 = new Label(this, SWT.NONE);
		label_4.setBounds(200, 157, 57, 20);
		label_4.setText("104分钟");
		
		Label label_5 = new Label(this, SWT.SEPARATOR | SWT.VERTICAL);
		label_5.setBounds(267, 157, 2, 20);
		
		Label label_6 = new Label(this, SWT.SEPARATOR | SWT.VERTICAL);
		label_6.setBounds(322, 157, 2, 20);
		
		Label label_7 = new Label(this, SWT.NONE);
		label_7.setBounds(275, 157, 30, 20);
		label_7.setText("冒险");
		
		Label label_8 = new Label(this, SWT.NONE);
		label_8.setBounds(339, 157, 85, 20);
		label_8.setText("瑞安·雷诺兹");
		
		Button button = new Button(this, SWT.NONE);
		button.setBounds(493, 10, 98, 30);
		button.setText("返回上一页");
		
		Button button_1 = new Button(this, SWT.NONE);
		button_1.setBounds(493, 62, 98, 30);
		button_1.setText("返回主界面");
		
		table = new Table(this, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(34, 317, 309, 247);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tableColumn_1 = new TableColumn(table, SWT.NONE);
		tableColumn_1.setText("场次");
		tableColumn_1.setResizable(false);
		tableColumn_1.setWidth(100);
		
		TableColumn tableColumn_2 = new TableColumn(table, SWT.NONE);
		tableColumn_2.setText("大厅");
		tableColumn_2.setWidth(106);
		
		TableColumn tableColumn_3 = new TableColumn(table, SWT.NONE);
		tableColumn_3.setText("价格");
		tableColumn_3.setWidth(100);
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText("20：40");
		
		Button button_2 = new Button(this, SWT.NONE);
		button_2.setBounds(34, 251, 98, 30);
		button_2.setText("今天5月25日");
		
		Button button_3 = new Button(this, SWT.NONE);
		button_3.setBounds(138, 251, 98, 30);
		button_3.setText("明天5月26日");
		
		Button button_4 = new Button(this, SWT.NONE);
		button_4.setBounds(245, 251, 98, 30);
		button_4.setText("后天5月27日");
		
		Label label_9 = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_9.setBounds(34, 238, 309, 2);
		
		Label label_10 = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_10.setBounds(34, 297, 309, 2);
		
		TextViewer textViewer = new TextViewer(this, SWT.BORDER);
		StyledText styledText = textViewer.getTextWidget();
		//styledText.setText("0");
		styledText.setBounds(387, 356, 71, 24);
		
		TextViewer textViewer_1 = new TextViewer(this, SWT.BORDER);
		StyledText styledText_1 = textViewer_1.getTextWidget();
		//styledText_1.setText("0");
		styledText_1.setBounds(387, 404, 71, 24);
		
		TextViewer textViewer_2 = new TextViewer(this, SWT.BORDER);
		StyledText styledText_2 = textViewer_2.getTextWidget();
		//styledText_2.setText("0");
		styledText_2.setBounds(387, 454, 71, 24);
		
		Button button_5 = new Button(this, SWT.NONE);
		
		button_5.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 9, SWT.NORMAL));
		button_5.setBounds(476, 534, 98, 30);
		button_5.setText("去选座");
		
		button_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitData.premain.add();
			}
		});

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
