package com.yc.one.UI.MainUI;

import com.swtdesigner.SWTResourceManager;
import com.yc.one.Util.InitData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Label;





import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class PreMainUI {
	protected Shell shell;
	protected DaZhenTan fi = null;
	protected FuChouZhe fc = null;
	private Composite composite_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			PreMainUI window = new PreMainUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 * @wbp.parser.entryPoint
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
		shell.setImage(SWTResourceManager.getImage(PreMainUI.class, "/image/哥哥快给我.jpg"));
		shell.setBackgroundMode(SWT.INHERIT_DEFAULT);
		shell.setBackgroundImage(SWTResourceManager.getImage(PreMainUI.class, "/image/白嫖.png"));
		shell.setSize(1143, 660);
		shell.setText("影院售票系统");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Menu menu = new Menu(shell, SWT.BAR);
		shell.setMenuBar(menu);
		
		MenuItem menuItem = new MenuItem(menu, SWT.CASCADE);
		menuItem.setText("购票");
		
		Menu menu_1 = new Menu(menuItem);
		menuItem.setMenu(menu_1);
		
		MenuItem menuItem_2 = new MenuItem(menu_1, SWT.NONE);
		menuItem_2.setText("新放映列表");
		
		MenuItem menuItem_3 = new MenuItem(menu_1, SWT.NONE);
		menuItem_3.setText("继续销售");
		
		MenuItem menuItem_4 = new MenuItem(menu_1, SWT.NONE);
		menuItem_4.setText("保存");
		
		MenuItem menuItem_5 = new MenuItem(menu_1, SWT.NONE);
		menuItem_5.setText("退出");
		
		MenuItem menuItem_1 = new MenuItem(menu, SWT.CASCADE);
		menuItem_1.setText("系统");
		
		Menu menu_2 = new Menu(menuItem_1);
		menuItem_1.setMenu(menu_2);
		
		SashForm sashForm = new SashForm(shell, SWT.NONE);
		
		Composite composite = new Composite(sashForm, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Tree tree = new Tree(composite, SWT.BORDER);
		
		
		TreeItem treeItem = new TreeItem(tree, SWT.NONE);
		treeItem.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.BOLD));
		treeItem.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		treeItem.setText("复仇者联盟4:终局之战");
		
		TreeItem treeItem_2 = new TreeItem(treeItem, SWT.NONE);
		treeItem_2.setText("9：00");
		
		TreeItem treeItem_3 = new TreeItem(treeItem, SWT.NONE);
		treeItem_3.setText("14：00");
		
		TreeItem treeItem_4 = new TreeItem(treeItem, SWT.NONE);
		treeItem_4.setText("19：00");
		
		TreeItem trtmNewTreeitem = new TreeItem(tree, SWT.NONE);
		trtmNewTreeitem.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.BOLD));
		trtmNewTreeitem.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		trtmNewTreeitem.setText("大侦探皮卡丘");
		
		TreeItem treeItem_5 = new TreeItem(trtmNewTreeitem, SWT.NONE);
		treeItem_5.setText("9：00");
		
		TreeItem trtmNewTreeitem_1 = new TreeItem(trtmNewTreeitem, SWT.NONE);
		trtmNewTreeitem_1.setText("14：00");
		trtmNewTreeitem_1.setExpanded(true);
		
		TreeItem trtmNewTreeitem_2 = new TreeItem(trtmNewTreeitem, SWT.NONE);
		trtmNewTreeitem_2.setText("19：00");
		
		TreeItem treeItem_1 = new TreeItem(tree, SWT.NONE);
		treeItem_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 11, SWT.BOLD));
		treeItem_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		treeItem_1.setText("一条狗的使命2");
		
		TreeItem trtmNewTreeitem_3 = new TreeItem(treeItem_1, SWT.NONE);
		trtmNewTreeitem_3.setText("9：00");
		
		TreeItem trtmNewTreeitem_4 = new TreeItem(treeItem_1, SWT.NONE);
		trtmNewTreeitem_4.setText("14：00");
		
		TreeItem trtmNewTreeitem_5 = new TreeItem(treeItem_1, SWT.NONE);
		trtmNewTreeitem_5.setText("19：00");
		
		Composite composite_1 = new Composite(sashForm, SWT.NONE);
		composite_1.setLayout(InitData.stackLayout);
		composite_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		sashForm.setWeights(new int[] {212, 910});
		
		
		tree.addSelectionListener(new SelectionAdapter() { // 当点击树上的某个节点时
			@Override
			public void widgetSelected(SelectionEvent e) {
				TreeItem ti = (TreeItem)e.item;
				String tname = ti.getText().trim();
				
				//先去composite_1下面所有的面板
				if("大侦探皮卡丘".equals(tname)){
					
					if(InitData.dazhentan == null){
						System.out.println("111");
						InitData.dazhentan = new DaZhenTan(composite_1,SWT.NONE);
					}
					fi = new DaZhenTan(composite_1,SWT.NONE);
					InitData.stackLayout.topControl = InitData.dazhentan;
					
				}else if("复仇者联盟：终局之战".equals(tname)){
					System.out.println("222");
					if(InitData.fuchouzhe == null){
						InitData.fuchouzhe = new FuChouZhe(composite_1,SWT.NONE);
					}
					InitData.stackLayout.topControl = InitData.fuchouzhe;
					fc = new FuChouZhe(composite_1,SWT.NONE);
				}
				
				composite_1.layout(); //刷新界面
			}
		});
		

	}
//	public void add(){
//		if(InitData.fuchouzhe == null){
//			InitData.fuchouzhe = new FuChouZhe(composite_1,SWT.NONE);
//		}
//		InitData.stackLayout.topControl = InitData.fuchouzhe;
//		composite_1.layout(); //刷新界面
//	}
}
