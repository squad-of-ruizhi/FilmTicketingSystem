package com.yc.one.UI.MainUI;

import com.swtdesigner.SWTResourceManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Button;

public class MainUI4 {

	protected Shell shell;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainUI4 window = new MainUI4();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackgroundMode(SWT.INHERIT_DEFAULT);
		shell.setBackgroundImage(SWTResourceManager.getImage(MainUI4.class, "/image/白背景.jpg"));
		shell.setSize(1020, 880);
		shell.setText("SWT Application");
		
		Label label = new Label(shell, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label.setBounds(20, 20, 261, 30);
		label.setText("在线选座 - 选择观影场次 ");
		
		Label label_1 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setBounds(20, 72, 980, 2);
		
		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.NORMAL));
		label_2.setBounds(20, 98, 188, 30);
		label_2.setText("影片：大侦探皮卡丘");
		
		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.NORMAL));
		label_3.setBounds(20, 151, 261, 27);
		label_3.setText("影院：睿智影城（南华分店）");
		
		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.NORMAL));
		label_4.setBounds(19, 197, 118, 27);
		label_4.setText("日期：今天");
		
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(20, 266, 768, 537);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn.setWidth(124);
		tblclmnNewColumn.setText("放映时间");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn_1.setWidth(117);
		tblclmnNewColumn_1.setText("语言/版本");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn_2.setWidth(114);
		tblclmnNewColumn_2.setText("放映厅");
		
		TableColumn tblclmnNewColumn_3 = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn_3.setWidth(282);
		tblclmnNewColumn_3.setText("原价/睿智购票价");
		
		TableColumn tblclmnNewColumn_4 = new TableColumn(table, SWT.CENTER);
		tblclmnNewColumn_4.setWidth(133);
		tblclmnNewColumn_4.setText("票务代理商");
		
		Button button = new Button(shell, SWT.NONE);
		button.setImage(SWTResourceManager.getImage(MainUI4.class, "/image/购票副本.png"));
		button.setBounds(824, 329, 176, 45);

	}
}
