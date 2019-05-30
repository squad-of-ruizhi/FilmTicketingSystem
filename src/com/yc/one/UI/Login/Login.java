package com.yc.one.UI.Login;

import com.swtdesigner.SWTResourceManager;
import com.yc.one.UI.MainUI.PreMainUI;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import java.util.Map;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;

import com.yc.one.DAO.AdminDao;
import com.yc.one.Util.InitData;
public class Login {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Label lblNewLabel_2;
	private boolean isDown = false;
	private int clickX;
	private int clickY;

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

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell(SWT.NONE); //无边框
		shell.setEnabled(true);
		shell.setBackgroundMode(SWT.INHERIT_DEFAULT); // 标签背景透明
		
		shell.setImage(SWTResourceManager.getImage(Login.class, "/image/1.jpg"));
		shell.setSize(new Point(836, 603));
		shell.setBackgroundImage(SWTResourceManager.getImage(Login.class, "/image/3.jpg"));
		shell.setSize(523, 375);
		shell.setText("睿智影城登录系统");
		
		shell.addMouseMoveListener(new MouseMoveListener() { // 拖动界面
			public void mouseMove(MouseEvent e) {
				if(isDown){ //说明你要拖动
					// 获取现在光标所在的位置
					int x = e.x;
					int y = e.y;
					
					x = x - clickX;
					y = y- clickY;
					
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
		text.setBounds(217, 166, 188, 26);
		
		text_1 = new Text(shell, SWT.BORDER | SWT.PASSWORD);
		text_1.setBounds(217, 198, 188, 26);
		
		Button btnCheckButton = new Button(shell, SWT.CHECK);
		btnCheckButton.setBounds(217, 242, 79, 20);
		btnCheckButton.setText("记住密码");
		
		Button btnCheckButton_1 = new Button(shell, SWT.CHECK);
		btnCheckButton_1.setBounds(326, 242, 79, 20);
		btnCheckButton_1.setText("自动登录");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		
		btnNewButton.setBounds(417, 164, 78, 30);
		btnNewButton.setText("注册账号");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		
		btnNewButton_1.setBounds(417, 200, 78, 26);
		btnNewButton_1.setText("忘记密码？");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setImage(SWTResourceManager.getImage(Login.class, "/image/1.jpg"));
		lblNewLabel.setBounds(51, 166, 109, 96);
		
		
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.setImage(null);
		btnNewButton_2.setBounds(217, 268, 188, 30);
		btnNewButton_2.setText("登录");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		
		lblNewLabel_1.setEnabled(true);
		lblNewLabel_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		lblNewLabel_1.setBounds(217, 141, 188, 20);
		
		lblNewLabel_2 = new Label(shell, SWT.NONE);
		
		lblNewLabel_2.setImage(SWTResourceManager.getImage(Login.class, "/image/btn_close_normal.png"));
		lblNewLabel_2.setBounds(481, 0, 40, 20);
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		
		lblNewLabel_3.setImage(SWTResourceManager.getImage(Login.class, "/image/btn_mini_normal.png"));
		lblNewLabel_3.setBounds(446, 0, 40, 20);
		
		
//		lblNewLabel_3.addMouseTrackListener(new MouseTrackAdapter() {
//			@Override
//			public void mouseHover(MouseEvent e) {
//				lblNewLabel_3.setImage(SWTResourceManager.getImage(L.class, "/image/btn_mini_higlight.png"));
//			}
//		});

//		lblNewLabel_2.addMouseTrackListener(new MouseTrackAdapter() {
//			@Override
//			public void mouseHover(MouseEvent e) {
//				lblNewLabel_2.setImage(SWTResourceManager.getImage(L.class, "/image/btn_close_higlight.png"));
//			}
//		});
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
					InitData.premain= new PreMainUI();
					shell.dispose();
//					main.open(map.get("aname"));
					InitData.premain.open();
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
				shell.dispose();
				InitData.register = new Register();
				InitData.register.open();
				
			}
		});
		
		btnNewButton_1.addSelectionListener(new SelectionAdapter() { // 忘记密码
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				InitData.rc = new Recall();
				InitData.rc.open();
				
			}
		});
	}
}
