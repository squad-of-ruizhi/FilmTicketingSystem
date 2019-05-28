package com.yc.one.UI.MainUI;

import com.swtdesigner.SWTResourceManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Label;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

public class MainUI {

	protected Shell shell;
	private Text text;

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
		shell = new Shell();
		shell.setBackgroundMode(SWT.INHERIT_DEFAULT);
		shell.setBackgroundImage(SWTResourceManager.getImage(MainUI.class, "/images/13.png"));
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
		treeItem.setText("复仇者联盟4:终局之战");
		
		TreeItem treeItem_2 = new TreeItem(treeItem, SWT.NONE);
		treeItem_2.setText("9：00");
		
		TreeItem treeItem_3 = new TreeItem(treeItem, SWT.NONE);
		treeItem_3.setText("14：00");
		
		TreeItem treeItem_4 = new TreeItem(treeItem, SWT.NONE);
		treeItem_4.setText("19：00");
		treeItem.setExpanded(true);
		
		TreeItem trtmNewTreeitem = new TreeItem(tree, SWT.NONE);
		trtmNewTreeitem.setText("大侦探皮卡丘");
		
		TreeItem treeItem_1 = new TreeItem(tree, SWT.NONE);
		treeItem_1.setText("一条狗的使命2");
		
		Composite composite_1 = new Composite(sashForm, SWT.NONE);
		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		SashForm sashForm_1 = new SashForm(composite_1, SWT.NONE);
		sashForm_1.setOrientation(SWT.VERTICAL);
		
		Composite composite_2 = new Composite(sashForm_1, SWT.NONE);
		
		Label label = new Label(composite_2, SWT.NONE);
		label.setBounds(28, 0, 35, 20);
		label.setText("详情");
		
		Label label_1 = new Label(composite_2, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_1.setBounds(69, 10, 368, 2);
		
		Label label_2 = new Label(composite_2, SWT.SEPARATOR | SWT.VERTICAL);
		label_2.setBounds(435, 10, 2, 233);
		
		Label label_3 = new Label(composite_2, SWT.SEPARATOR | SWT.VERTICAL);
		label_3.setBounds(10, 10, 2, 233);
		
		Label label_4 = new Label(composite_2, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_4.setBounds(10, 241, 426, 2);
		
		Label label_5 = new Label(composite_2, SWT.NONE);
		label_5.setBounds(38, 26, 76, 20);
		label_5.setText("片名：");
		
		Label label_6 = new Label(composite_2, SWT.NONE);
		label_6.setBounds(38, 52, 125, 125);
		
		Label label_7 = new Label(composite_2, SWT.NONE);
		label_7.setBounds(176, 26, 45, 20);
		label_7.setText("导演：");
		
		Label label_8 = new Label(composite_2, SWT.NONE);
		label_8.setBounds(176, 56, 45, 20);
		label_8.setText("主演：");
		
		Label label_9 = new Label(composite_2, SWT.NONE);
		label_9.setBounds(176, 86, 45, 20);
		label_9.setText("类型：");
		
		Label label_10 = new Label(composite_2, SWT.NONE);
		label_10.setBounds(176, 116, 76, 20);
		label_10.setText("放映时间：");
		
		Label label_11 = new Label(composite_2, SWT.NONE);
		label_11.setBounds(176, 146, 60, 20);
		label_11.setText("原票价：");
		
		Label label_12 = new Label(composite_2, SWT.NONE);
		label_12.setBounds(176, 180, 76, 20);
		label_12.setText("优惠价：");
		
		Label label_13 = new Label(composite_2, SWT.NONE);
		label_13.setImage(SWTResourceManager.getImage(MainUI.class, "/images/1.jpg"));
		label_13.setBounds(591, 10, 100, 100);
		
		Label label_14 = new Label(composite_2, SWT.NONE);
		label_14.setBounds(455, 116, 50, 20);
		label_14.setText("特殊票");
		
		Label label_15 = new Label(composite_2, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_15.setBounds(511, 126, 294, 2);
		
		Label label_16 = new Label(composite_2, SWT.SEPARATOR | SWT.VERTICAL);
		label_16.setBounds(803, 126, 2, 149);
		
		Label label_17 = new Label(composite_2, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_17.setBounds(474, 273, 331, 2);
		
		Label label_18 = new Label(composite_2, SWT.SEPARATOR | SWT.VERTICAL);
		label_18.setBounds(474, 142, 2, 133);
		
		Button button = new Button(composite_2, SWT.RADIO);
		button.setBounds(494, 146, 76, 20);
		button.setText("普通票");
		
		Button button_1 = new Button(composite_2, SWT.RADIO);
		button_1.setBounds(604, 146, 60, 20);
		button_1.setText("赠票");
		
		Button button_2 = new Button(composite_2, SWT.RADIO);
		button_2.setBounds(701, 146, 76, 20);
		button_2.setText("学生票");
		
		Label label_19 = new Label(composite_2, SWT.NONE);
		label_19.setBounds(494, 180, 76, 20);
		label_19.setText("学生折扣：");
		
		Label label_20 = new Label(composite_2, SWT.NONE);
		label_20.setBounds(510, 223, 60, 20);
		label_20.setText("赠送者：");
		
		Combo combo = new Combo(composite_2, SWT.NONE);
		combo.setBounds(576, 177, 186, 26);
		
		text = new Text(composite_2, SWT.BORDER);
		text.setBounds(576, 220, 186, 28);
		
		Label label_21 = new Label(composite_2, SWT.NONE);
		label_21.setBounds(87, 26, 76, 20);
		label_21.setText("复仇者联盟4");
		
		Composite composite_3 = new Composite(sashForm_1, SWT.NONE);
		sashForm_1.setWeights(new int[] {285, 310});
		sashForm.setWeights(new int[] {297, 825});

	}
}
