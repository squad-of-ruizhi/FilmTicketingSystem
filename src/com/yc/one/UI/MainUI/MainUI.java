package com.yc.one.UI.MainUI;

import com.swtdesigner.SWTResourceManager;
import com.yc.one.Dao.AdminDao;
import com.yc.one.UI.PayUIDetails.MovieInfo;
import com.yc.one.Util.InitData;
import com.yc.one.Util.InitInfo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;

public class MainUI {

	protected Shell shell;
	private String moviename;
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
		shell = new Shell(SWT.CLOSE | SWT.MIN | SWT.MAX);
		shell.setImage(SWTResourceManager.getImage(MainUI.class, "/image/『小酒馆』剑与魔法 · 旅途中的休憩时光_109951163674078407.jpg"));
		shell.setSize(1930, 1038);
		shell.setText("睿智影城");
		AdminDao adminDao=new AdminDao();
		
		Rectangle rtl = Display.getDefault().getClientArea();
		shell.setLocation((rtl.width - shell.getSize().x) / 2,(rtl.height - shell.getSize().y) / 2);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setImage(SWTResourceManager.getImage(MainUI.class, adminDao.MovieImage("哥斯拉2：怪兽之王")));
		btnNewButton.setBounds(36, 48, 189, 262);
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setBounds(263, 48, 163, 30);
		btnNewButton_1.setText("哥斯拉2：怪兽之王");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(267, 91, 76, 20);
		lblNewLabel.setText("评分："+adminDao.Points("哥斯拉2：怪兽之王"));
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(263, 117, 115, 20);
		lblNewLabel_1.setText("片长："+adminDao.MovieTime("哥斯拉2：怪兽之王"));
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(267, 143, 76, 20);
		lblNewLabel_2.setText("地区：美国");
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setBounds(267, 169, 159, 20);
		lblNewLabel_3.setText("类型：科幻/灾难/动作");
		
		Label lblNewLabel_4 = new Label(shell, SWT.NONE);
		lblNewLabel_4.setBounds(267, 207, 163, 20);
		lblNewLabel_4.setText("导演：迈克尔·道赫蒂");
		
		Label lblNewLabel_5 = new Label(shell, SWT.NONE);
		lblNewLabel_5.setBounds(267, 233, 216, 20);
		lblNewLabel_5.setText("主演：凯尔·钱德勒/维拉·法梅..");
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.setImage(SWTResourceManager.getImage(MainUI.class, "/image/购票副本.png"));
		btnNewButton_2.setBounds(252, 269, 178, 46);


		// 按钮事件
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				btnNewButton_2.setImage(SWTResourceManager.getImage(MainUI.class,"/image/购票(点击时).png"));
			}

			@Override
			public void mouseUp(MouseEvent e) {
				btnNewButton_2.setImage(SWTResourceManager.getImage(MainUI.class,"/image/购票副本  .png"));
			}
		});

		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitInfo.moviename="哥斯拉2：怪兽之王";
				InitData.movieInfo=new MovieInfo(shell,0);
				InitData.movieInfo.open();
			}
		});
	}

}
