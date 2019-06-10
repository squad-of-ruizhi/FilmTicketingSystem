package com.yc.one.UI.MainUI;

import com.swtdesigner.SWTResourceManager;
import com.yc.one.Dao.AdminDao;
import com.yc.one.UI.Login.Recall;
import com.yc.one.Util.InitData;
import com.yc.one.Util.InitInfo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class WelcomeUI {
	private IndexUI ix = null;
	private WelcomeUI we = null;
	private MyFilm mf = null;
	protected Shell shell;
	private Composite composite_4;


	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			WelcomeUI window = new WelcomeUI();
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
		shell = new Shell(SWT.NONE | SWT.CLOSE | SWT.MIN | SWT.INHERIT_DEFAULT);
		shell.setImage(SWTResourceManager.getImage(WelcomeUI.class, "/image/『小酒馆』剑与魔法 · 旅途中的休憩时光_109951163674078407.jpg"));
		shell.setSize(1930, 1038);
		shell.setText("欢迎"+ InitInfo.account+"光临睿智影城");
		
		Rectangle rtl = Display.getDefault().getClientArea();
		shell.setLocation((rtl.width - shell.getSize().x) / 2,(rtl.height - shell.getSize().y) / 2);
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem menuItem = new MenuItem(menu, SWT.CASCADE);
		menuItem.setText("用户");
		
		Menu menu_1 = new Menu(menuItem);
		menuItem.setMenu(menu_1);
		
		MenuItem menuItem_3 = new MenuItem(menu_1, SWT.NONE);
		menuItem_3.setText("充值");
		
		MenuItem menuItem_4 = new MenuItem(menu_1, SWT.NONE);
		menuItem_4.addSelectionListener(new SelectionAdapter() { // 修改密码
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitData.rc = new Recall();
				InitData.rc.open();
			}
		});
		menuItem_4.setText("修改密码");
		
		MenuItem menuItem_1 = new MenuItem(menu, SWT.CASCADE);
		menuItem_1.setText("系统");
		
		Menu menu_2 = new Menu(menuItem_1);
		menuItem_1.setMenu(menu_2);
		
		MenuItem menuItem_5 = new MenuItem(menu_2, SWT.NONE);
		menuItem_5.setText("退出系统");
		
		MenuItem menuItem_2 = new MenuItem(menu, SWT.CASCADE);
		menuItem_2.setText("帮助");
		
		Menu menu_3 = new Menu(menuItem_2);
		menuItem_2.setMenu(menu_3);
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		SashForm sashForm = new SashForm(composite, SWT.NONE);
		sashForm.setOrientation(SWT.VERTICAL);
		
		Composite composite_1 = new Composite(sashForm, SWT.NONE);
		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		SashForm sashForm_1 = new SashForm(composite_1, SWT.NONE);
		
		Composite composite_3 = new Composite(sashForm_1, SWT.NONE);
		composite_3.setLayout(null);
		
		Label lblNewLabel = new Label(composite_3, SWT.NONE);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				if(InitData.indexUI == null){
					System.out.println("333");
					InitData.indexUI = new IndexUI(composite_4,SWT.NONE);
				}
				ix = new IndexUI(composite_4,SWT.NONE);
				InitData.stackLayout.topControl = InitData.indexUI;
				composite_4.layout();
			}
			
		});
		lblNewLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblNewLabel.setFont(SWTResourceManager.getFont("华文琥珀", 16, SWT.NORMAL));
		lblNewLabel.setBounds(21, 10, 76, 28);
		lblNewLabel.setText("首页");
		
		Label lblNewLabel_1 = new Label(composite_3, SWT.NONE);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				InitData.movieUI= new MovieUI();
				InitData.movieUI.open();
			}
		});
		lblNewLabel_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblNewLabel_1.setFont(SWTResourceManager.getFont("华文琥珀", 16, SWT.NORMAL));
		lblNewLabel_1.setBounds(0, 53, 117, 35);
		lblNewLabel_1.setText("热门电影");
		
		Label lblNewLabel_2 = new Label(composite_3, SWT.NONE);
		lblNewLabel_2.addMouseListener(new MouseAdapter() {// 点击我的影票
			@Override
			public void mouseDown(MouseEvent e) {
				if(InitData.myFilm== null){
					System.out.println("111");
					InitData.myFilm = new MyFilm(composite_4,SWT.NONE);
				}
				mf = new MyFilm(composite_4,SWT.NONE);
				InitData.stackLayout.topControl = InitData.myFilm;
				System.out.println("222");
				composite_4.layout(); //刷新界面
			}
		});
		
		lblNewLabel_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblNewLabel_2.setFont(SWTResourceManager.getFont("华文琥珀", 16, SWT.NORMAL));
		lblNewLabel_2.setText("我的影票");
		lblNewLabel_2.setBounds(0, 94, 117, 35);
		
		Label lblNewLabel_5 = new Label(composite_3, SWT.NONE);
		lblNewLabel_5.setFont(SWTResourceManager.getFont("华文琥珀", 16, SWT.NORMAL));
		lblNewLabel_5.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblNewLabel_5.setBounds(28, 135, 69, 28);
		lblNewLabel_5.setText("退票");
		
		composite_4 = new Composite(sashForm_1, SWT.NONE);
		composite_4.setLayout(InitData.stackLayout);
		composite_4.setBackgroundMode(SWT.INHERIT_DEFAULT);
		composite_4.setBackgroundImage(SWTResourceManager.getImage(WelcomeUI.class, "/image/复联.jpg"));

		/*Label lblNewLabel_3 = new Label(composite_4, SWT.BORDER);
		lblNewLabel_3.setAlignment(SWT.CENTER);
		lblNewLabel_3.setFont(SWTResourceManager.getFont("华文琥珀", 20, SWT.NORMAL));
		lblNewLabel_3.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		lblNewLabel_3.setBounds(94, 690, 273, 36);
		lblNewLabel_3.setText("欢迎您，"+ InitInfo.account +"！");

		Label lblNewLabel_4 = new Label(composite_4, SWT.NONE);
		lblNewLabel_4.setFont(SWTResourceManager.getFont("华文琥珀", 20, SWT.NORMAL));
		lblNewLabel_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		lblNewLabel_4.setBounds(183, 782, 264, 34);
		lblNewLabel_4.setText("账户余额："+adminDao.Money(InitInfo.account)+"￥");*/
		sashForm_1.setWeights(new int[] {118, 1803});
		
		Composite composite_2 = new Composite(sashForm, SWT.NONE);
		sashForm.setWeights(new int[] {975, 0});

	}
}
