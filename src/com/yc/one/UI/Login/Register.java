package com.yc.one.UI.Login;

import com.swtdesigner.SWTResourceManager;
import com.yc.one.Dao.AdminDao;
import com.yc.one.Util.InitData;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;




import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Register {
	
	public static final int H_GAP = 20;
	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_3;
	private boolean isDown = false;
	private int clickX;
	private int clickY;
	private Text text_2;
	private Text text_info;
	private Label lab_username_info;
	private Text text_4;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Register window = new Register();
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
		shell = new Shell(SWT.CLOSE | SWT.MIN);
		shell.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		
		shell.setBackgroundMode(SWT.INHERIT_DEFAULT);
		shell.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 10, SWT.BOLD));
		shell.setImage(SWTResourceManager.getImage(Register.class, "/image/哥哥快给我.jpg"));
		shell.setBackgroundImage(SWTResourceManager.getImage(Register.class, "/image/忘记密码背景.jpg"));
		shell.setSize(511, 645);
		shell.setText("注册账号");
		
//		shell.addMouseMoveListener(new MouseMoveListener() {
//			public void mouseMove(MouseEvent e) {
//				if(isDown){ // 当按下说明用户要拖动界面
//					// 获取光标现在所在的位置
//					int x = e.x;
//					int y = e.y;
//					
//					x = x - clickX;
//					y = y - clickY;
//					
//					shell.setLocation(shell.getLocation().x + x,shell.getLocation().y + y);
//				}
//			}
//		});
//		
//		shell.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseDown(MouseEvent e) {
//				// 说明用户已经是按下鼠标了，要拖动窗口
//				isDown = true;
//				clickX = e.x;
//				clickY = e.y;
//			}
//			@Override
//			public void mouseUp(MouseEvent e) { // 松开鼠标
//				isDown = false;
//			}
//		});

		Rectangle rtl = Display.getDefault().getClientArea();
		shell.setLocation((rtl.width - shell.getSize().x) / 2,(rtl.height - shell.getSize().y) / 2); //居中显示
		
		text = new Text(shell, SWT.BORDER);
		
		text.setBounds(124, 124, 284, 31);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(124, 200, 284, 31);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
//		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNewLabel.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.BOLD));
		lblNewLabel.setBounds(101, 39, 176, 31);
		lblNewLabel.setText("欢迎注册睿智账号\r\n\r\n");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 9, SWT.BOLD));
		lblNewLabel_1.setBounds(124, 77, 202, 20);
		lblNewLabel_1.setText("每一天，乐在观影、乐于睿智");
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(198, 337, 210, 31);
		
		CCombo combo = new CCombo(shell, SWT.BORDER);
		combo.setBounds(124, 337, 68, 31);
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		lblNewLabel_2.setAlignment(SWT.CENTER);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 15, SWT.BOLD));
		lblNewLabel_2.setBounds(42, 117, 76, 45);
		lblNewLabel_2.setText("昵称");
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		lblNewLabel_3.setAlignment(SWT.CENTER);
		lblNewLabel_3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 15, SWT.BOLD));
		lblNewLabel_3.setBounds(42, 200, 76, 45);
		lblNewLabel_3.setText("密码");
		
		Label lblNewLabel_4 = new Label(shell, SWT.NONE);
		lblNewLabel_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		lblNewLabel_4.setAlignment(SWT.CENTER);
		lblNewLabel_4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 15, SWT.BOLD));
		lblNewLabel_4.setBounds(10, 330, 108, 45);
		lblNewLabel_4.setText("手机号码");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		
		btnNewButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		btnNewButton.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 15, SWT.BOLD));
		btnNewButton.setBounds(124, 502, 273, 45);
		btnNewButton.setText("立即注册");
		
		Button btnCheckButton = new Button(shell, SWT.CHECK);
		btnCheckButton.setForeground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		btnCheckButton.setSelection(true);
		btnCheckButton.setBounds(124, 561, 276, 20);
		btnCheckButton.setText("我已同意睿智影城服务协议");
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(124, 267, 284, 31);
		
		Label lblNewLabel_5 = new Label(shell, SWT.NONE);
		lblNewLabel_5.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		lblNewLabel_5.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 15, SWT.BOLD));
		lblNewLabel_5.setBounds(10, 260, 108, 39);
		lblNewLabel_5.setText("确认密码");
		
		Label lblNewLabel_7 = new Label(shell, SWT.NONE);
		lblNewLabel_7.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblNewLabel_7.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 9, SWT.BOLD));
		lblNewLabel_7.setBounds(124, 161, 284, 20);
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setBounds(124, 457, 284, 39);
		
		Label lblNewLabel_6 = new Label(shell, SWT.NONE);
		lblNewLabel_6.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
		lblNewLabel_6.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		lblNewLabel_6.setBounds(10, 415, 267, 39);
		lblNewLabel_6.setText("密保问题：你的爱好是什么？");
		
		Label lblNewLabel_8 = new Label(shell, SWT.NONE);
		lblNewLabel_8.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 15, SWT.BOLD));
		lblNewLabel_8.setForeground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION));
		lblNewLabel_8.setBounds(42, 457, 76, 37);
		lblNewLabel_8.setText("答案");
		
//		text.addFocusListener(new FocusAdapter() {
//			@Override
//			public void focusGained(FocusEvent e) {
//				lab_username_info.setForeground(new Color(null,0,0,0));
//				lab_username_info.setText("用户名必须为6-16位字母、数字！");
//			}
//			@Override
//			public void focusLost(FocusEvent e) {
//				if(text.getText().trim().equals("")){
//					text_info.setForeground(new Color(null,255,0,0));
//					text_info.setText("用户名不能为空！");
//					}else{
//					text_info.setForeground(new Color(null,0,255,0));
//					text_info.setText("用户名格式正确！");
//			}
//			}
//		});
		
		// 当用户点击空白text时
		text.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if(isDown = true){
					lblNewLabel_7.setText("温馨提示:用户名必须为6-16位字母、数字！");
				}
				
			}
		});
		
		// 当点击注册按钮时
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
					String name=text.getText().trim();
					String pwd=text_1.getText().trim();
					String tel=text_3.getText().trim();
					String qst=text_4.getText().trim();

					AdminDao adminDao=new AdminDao();
					int result =adminDao.Register(name,pwd,tel,qst);
					System.out.println(result);
					if(result!=-1){
						InitData.RegisterUserInfo = result;
						InitData.Login= new Login();
						MessageBox mb2 = new MessageBox(shell,SWT.YES | SWT.NO | SWT.CANCEL |SWT.ICON_WORKING);
						mb2.setText("提示");
						mb2.setMessage("注册成功，请登录");
						mb2.open();
						shell.dispose();
						InitData.Login.open();
					}else{
	//
						MessageBox mb = new MessageBox(shell,SWT.YES | SWT.NO | SWT.CANCEL |SWT.ERROR);
						mb.setText("错误提示");
						mb.setMessage("注册失败，所填信息不能为空");
						mb.open();
//						MessageDialog.openError(shell, "错误提示:", "账号或密码错误,请确认正确后重新登录!");
//						MessageDialog.openConfirm(shell, "错误提示:", "账号或密码错误,请确认正确后重新登录!");

					}
				}
			
		});
		

	}
}
