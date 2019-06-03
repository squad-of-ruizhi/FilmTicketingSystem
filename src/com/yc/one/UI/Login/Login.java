package com.yc.one.UI.Login;

import com.swtdesigner.SWTResourceManager;
import com.yc.one.Dao.AdminDao;
import com.yc.one.UI.MainUI.MainUI;
import com.yc.one.Util.InitData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import java.util.Date;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;

import com.ibm.icu.text.SimpleDateFormat;


import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.events.MouseTrackAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.DisposeEvent;
import sun.rmi.runtime.Log;

public class Login {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Label lblNewLabel_2;
	private boolean isDown = false;
	private int clickX;
	private int clickY;

	private static String account = null;
	private String pwd = null;
	

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Login window = new Login();
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

	//获取用户名


	public String getAccount() {
		return account;
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell(SWT.NONE); //无边框
		
		shell.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		shell.setEnabled(true);
		shell.setBackgroundMode(SWT.INHERIT_DEFAULT); // 标签背景透明
		shell.setImage(SWTResourceManager.getImage(Login.class, "/image/1.jpg"));
		shell.setBackgroundImage(SWTResourceManager.getImage(Login.class, "/image/『小酒馆』剑与魔法 · 旅途中的休憩时光_109951163674078407.jpg"));
		shell.setSize(1019, 731);
		shell.setText("睿智影城登录系统");
		
		
		
		shell.addMouseMoveListener(new MouseMoveListener() { // 拖动界面
			public void mouseMove(MouseEvent e) {
				if(isDown){ //说明你要拖动
					// 获取现在光标所在的位置
					int x = e.x;
					int y = e.y;
					
					x = x - clickX;
					y = y - clickY;
					
					shell.setLocation(shell.getLocation().x + x,shell.getLocation().y + y);
				}
			}
		});
		
		shell.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				isDown = true; // 说明用户已经按下鼠标了，说明是要拖动窗口
				clickX = e.x;
				clickY = e.y;
			}
			@Override
			public void mouseUp(MouseEvent e) {
				isDown = false;
			}
		});
		
		Rectangle rtl = Display.getDefault().getClientArea();
		shell.setLocation((rtl.width - shell.getSize().x) / 2,(rtl.height - shell.getSize().y) / 2);
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(377, 283, 236, 42);
		
		text_1 = new Text(shell, SWT.BORDER | SWT.PASSWORD);
		text_1.setBounds(377, 367, 236, 42);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 9, SWT.BOLD));
		
		btnNewButton.setBounds(664, 290, 78, 30);
		btnNewButton.setText("注册账号");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 9, SWT.BOLD));
		btnNewButton_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		
		btnNewButton_1.setBounds(664, 375, 78, 26);
		btnNewButton_1.setText("找回密码");
		
		
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.BOLD));
		btnNewButton_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		btnNewButton_2.setImage(null);
		btnNewButton_2.setBounds(349, 490, 286, 49);
		btnNewButton_2.setText("登录");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		
		lblNewLabel_1.setEnabled(true);
		lblNewLabel_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		lblNewLabel_1.setBounds(217, 141, 188, 20);
		
		lblNewLabel_2 = new Label(shell, SWT.NONE);
		
		lblNewLabel_2.setImage(SWTResourceManager.getImage(Login.class, "/image/btn_close_normal.png"));
		lblNewLabel_2.setBounds(977, 0, 40, 20);
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		
		lblNewLabel_3.setImage(SWTResourceManager.getImage(Login.class, "/image/btn_mini_normal.png"));
		lblNewLabel_3.setBounds(950, 0, 40, 20);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.BOLD));
		lblNewLabel.setBounds(291, 295, 76, 30);
		lblNewLabel.setText("用户名");
		
		Label lblNewLabel_4 = new Label(shell, SWT.NONE);
		lblNewLabel_4.setAlignment(SWT.CENTER);
		lblNewLabel_4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.BOLD));
		lblNewLabel_4.setBounds(291, 375, 55, 31);
		lblNewLabel_4.setText("密码");
		
		Label lblNewLabel_5 = new Label(shell, SWT.NONE);
		lblNewLabel_5.setForeground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblNewLabel_5.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.BOLD | SWT.ITALIC));
		lblNewLabel_5.setBounds(10, 0, 286, 38);
		lblNewLabel_5.setText("睿智影城欢迎您！");
		
		final Label lblNewLabel_6 = new Label(shell, SWT.NONE);
		lblNewLabel_6.setForeground(SWTResourceManager.getColor(SWT.COLOR_INFO_BACKGROUND));
		lblNewLabel_6.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.BOLD));
		lblNewLabel_6.setBounds(10, 34, 236, 41);
		
		Thread thread = new Thread(new Runnable(){ // 线程操作
			public void run(){ //设置时间，格式化输出时间
				while(!shell.isDisposed()){
					Object display;
					lblNewLabel_6.getDisplay().asyncExec(new Runnable(){
						@Override
						public void run() {
							if(!lblNewLabel_6.isDisposed()){
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							String s = sdf.format(new Date());
							lblNewLabel_6.setText(s); // 输出到Label 上	
							}
						}
					});
					try {
						Thread.sleep(1000); //每隔一秒刷新一次
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
			}
			
		});
		thread.start();
		
		
		shell.addDisposeListener(new DisposeListener() {
			@SuppressWarnings("deprecation")
			public void widgetDisposed(DisposeEvent e) {
				thread.stop();
			}
		});
		
		
		lblNewLabel_3.addMouseTrackListener(new MouseTrackAdapter() {
			@Override
			public void mouseHover(MouseEvent e) {
				lblNewLabel_3.setImage(SWTResourceManager.getImage(Login.class, "/image/btn_mini_higlight.png"));
			}
		});

		lblNewLabel_2.addMouseTrackListener(new MouseTrackAdapter() {
			@Override
			public void mouseHover(MouseEvent e) {
				lblNewLabel_2.setImage(SWTResourceManager.getImage(Login.class, "/image/btn_close_higlight.png"));
			}
		});
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) { // 当用户松开在关闭按钮上松开鼠标时
				shell.dispose();
			}
			@Override
			public void mouseDown(MouseEvent e) { // 当用户点击关闭按钮时
				lblNewLabel_2.setImage(SWTResourceManager.getImage(Login.class, "/image/btn_close_down.png"));
			}
		});
		
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) { // 当用户在按钮上松开时
				shell.setMinimized(true);
			}
			@Override
			public void mouseDown(MouseEvent e) { // 按下最小化按钮时
				lblNewLabel_3.setImage(SWTResourceManager.getImage(Login.class,"image/btn_mini_down.png"));
			}
		});
		
		text.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNewLabel_1.setText("");
			}
		});
		
		text_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				lblNewLabel_1.setText("");
			}
		});
		// 当用户点击登录时
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String account = text.getText().trim();
				String pwd = text_1.getText().trim();

				AdminDao adminDao = new AdminDao();
				Map<String,String> map = adminDao.Login(account, pwd);
				System.out.println(map);
				 if(map != null){
					InitData.LoginUserInfo = map;
					InitData.main= new MainUI();
					shell.dispose();
//					main.open(map.get("aname"));
					InitData.main.open();
				}else{
//					lblNewLabel_1.setText("帐号或密码错误!");
					MessageBox mb = new MessageBox(shell,SWT.YES | SWT.NO | SWT.CANCEL |SWT.ERROR);
					mb.setText("错误提示:");
					mb.setMessage("账号或密码错误,请确认正确后重新登录!");
					mb.open();
//					MessageDialog.openError(shell, "错误提示:", "账号或密码错误,请确认正确后重新登录!");
//					MessageDialog.openConfirm(shell, "错误提示:", "账号或密码错误,请确认正确后重新登录!");
					
				}
				
			}
		});
		
		btnNewButton.addSelectionListener(new SelectionAdapter() { // 注册账号
			@Override
			public void widgetSelected(SelectionEvent e) {
//				shell.dispose();
				InitData.register = new Register();
				InitData.register.open();
				
			}
		});
		
		btnNewButton_1.addSelectionListener(new SelectionAdapter() { // 忘记密码
			@Override
			public void widgetSelected(SelectionEvent e) {
//				shell.dispose();
				InitData.rc = new Recall();
				InitData.rc.open();
				
			}
		});
	}
}
