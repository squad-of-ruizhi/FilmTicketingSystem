package com.yc.one.UI.Login;

import com.swtdesigner.SWTResourceManager;
import com.yc.one.Dao.AdminDao;
import com.yc.one.Util.InitData;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.*;

import java.util.Map;

public class Recall { //重置密码时的身份检测

	protected Shell shell;
	private Text text;
	private Text text_1;
	private static String account=null;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Recall window = new Recall();
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

	public String getAccount() {

		return account;
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell(SWT.NONE | SWT.MIN | SWT.CLOSE | SWT.MAX);
		shell.setBackgroundMode(SWT.INHERIT_DEFAULT);
		shell.setImage(SWTResourceManager.getImage(Recall.class, "/image/哥哥快给我.jpg"));
		shell.setBackgroundImage(SWTResourceManager.getImage(Recall.class, "/image/手绘.png"));
		shell.setSize(470, 614);
		shell.setText("找回密码");
		
		Rectangle rtl = Display.getDefault().getClientArea();
		shell.setLocation((rtl.width - shell.getSize().x) / 2,(rtl.height - shell.getSize().y) / 2);
		
		Label label = new Label(shell, SWT.NONE);
		label.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		label.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.NORMAL));
		label.setBounds(48, 136, 76, 20);
		label.setText("账号：");
		
		text = new Text(shell, SWT.BORDER);
		text.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		text.setBounds(48, 176, 250, 42);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		lblNewLabel.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.NORMAL));
		lblNewLabel.setBounds(48, 268, 121, 29);
		lblNewLabel.setText("密保问题验证:");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.NORMAL));
		lblNewLabel_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		lblNewLabel_1.setBounds(48, 294, 132, 29);
		lblNewLabel_1.setText("你的爱好是什么");
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		text_1.setBounds(48, 329, 244, 42);
		
		Button btnCheckButton = new Button(shell, SWT.CHECK);
		btnCheckButton.setSelection(true);
		btnCheckButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		btnCheckButton.setBounds(48, 493, 125, 20);
		btnCheckButton.setText("我已阅读并同意");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		btnNewButton.setBounds(173, 493, 152, 20);
		btnNewButton.setText("睿智影城账号安全协议");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		btnNewButton_1.setBounds(122, 412, 137, 42);
		btnNewButton_1.setText("确定");

		btnNewButton_1.addSelectionListener(new SelectionAdapter() { //按下“确定”按钮后进行账户和密保问题的检测来确认身份
			@Override
			public void widgetSelected(SelectionEvent e) {
				String name =text.getText().trim();
				String qst=text_1.getText().trim();
				if(name.equals("")||qst.equals("")){
					MessageBox mb = new MessageBox(shell,SWT.YES | SWT.CANCEL |SWT.ERROR);
					mb.setText("错误提示");
					mb.setMessage("验证信息不能为空");
					mb.open();
				}else {
					account = name;
					AdminDao adminDao = new AdminDao();
					Map<String, String> map = adminDao.Check(name, qst);
					if (map != null) {
						InitData.LoginUserInfo = map;
						InitData.rp = new RePassword();
						shell.dispose();
						InitData.rp.open();
					}
				}

			}
		});


	}


}
