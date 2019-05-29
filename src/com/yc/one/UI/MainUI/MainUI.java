package com.yc.one.UI.MainUI;

import com.yc.one.UI.Login;
import com.yc.one.Util.InitData;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MainUI {
	private boolean isDown = false;
	private int clickX;
	private int clickY;
	protected Shell shell;
	private Composite1 com1 = null;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainUI window = new MainUI();
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
		shell = new Shell(SWT.NONE | SWT.MIN | SWT.CLOSE);
		shell.setSize(600, 600);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		Button button = new Button(shell, SWT.NONE);
		button.setBounds(103, 114, 98, 30);
		button.setText("选票");
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.setBounds(317, 114, 98, 30);
		button_1.setText("切换用户");
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.setBounds(103, 262, 98, 30);
		button_2.setText("退票");
		
		Button button_3 = new Button(shell, SWT.NONE);
		button_3.setBounds(317, 262, 98, 30);
		button_3.setText("退出");
		
		shell.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent e) {
				if (isDown) { // 说明你要拖动
					// 获取光标现在的位置
					int x = e.x;
					int y = e.y;
					
					x = x - clickX;
					y = y - clickY;
					
					shell.setLocation(shell.getLocation().x + x, shell.getLocation().y + y);
				}
			}
		});
		shell.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				isDown = true; // 说明用户已经按下鼠标了，这个时候如果用户移动鼠标，说明是要拖动窗口
				clickX = e.x;
				clickY = e.y;
			}
			@Override
			public void mouseUp(MouseEvent e) {
				isDown = false;
			}
		});
		
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				com1 = new Composite1(shell, SWT.NONE);
			}
		});

		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				InitData.Login=new Login();
				InitData.Login.open();
			}
		});
		
	}
}
