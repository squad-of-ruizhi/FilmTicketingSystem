package com.yc.one.UI;

import com.swtdesigner.SWTResourceManager;
import com.yc.one.DAO.AdminDao;
import com.yc.one.Util.InitData;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.*;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;



public class RePassword {

	private Shell shell;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			RePassword window = new RePassword();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	void open() {
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
	private void createContents() {
		shell = new Shell(SWT.NONE | SWT.MIN | SWT.CLOSE);
		shell.setImage(SWTResourceManager.getImage(RePassword.class, "/image/RePassword.png"));
		shell.setBackgroundImage(SWTResourceManager.getImage(RePassword.class, "/image/RePassword.png"));
		shell.setBackgroundMode(SWT.INHERIT_DEFAULT);
		shell.setSize(520, 646);
		shell.setText("重置密码");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
		lblNewLabel.setBounds(53, 143, 60, 27);
		lblNewLabel.setText("新密码");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
		lblNewLabel_1.setBounds(44, 227, 80, 27);
		lblNewLabel_1.setText("确认密码");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(168, 133, 231, 42);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(168, 222, 231, 42);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		
		btnNewButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		btnNewButton.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.BOLD));
		btnNewButton.setBounds(147, 361, 212, 42);
		btnNewButton.setText("确定");
		
		// 当用户点击确定按钮时
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String repsd=text_1.getText();
				String compare=text.getText();
				if (compare.equals(repsd)){
					AdminDao adminDao=new AdminDao();
					Recall recall=new Recall();
					String account=recall.getAccount();
					int result=adminDao.Repwd(account,repsd);
					System.out.println(result);
					if(result!=-1){
						InitData.RePsdInfo = result;
						InitData.Login= new Login();
						MessageBox mb2 = new MessageBox(shell,SWT.YES | SWT.CANCEL |SWT.ICON_WORKING);
						mb2.setText("提示");
						mb2.setMessage("密码修改成功，请登录");
						mb2.open();
						shell.dispose();
						InitData.Login.open();
					}else{
						MessageBox mb = new MessageBox(shell,SWT.YES | SWT.CANCEL |SWT.ERROR);
						mb.setText("错误提示");
						mb.setMessage("密码修改失败，所填信息不能为空");
						mb.open();
					}
				}else{
					MessageBox mb2 = new MessageBox(shell,SWT.YES | SWT.NO | SWT.CANCEL |SWT.ERROR);
					mb2.setText("错误提示:");
					mb2.setMessage("密码修改失败，请保持两次密码输入一致");
					mb2.open();


			}
		}

	});

	}
}