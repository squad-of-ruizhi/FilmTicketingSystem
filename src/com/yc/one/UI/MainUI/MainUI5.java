package com.yc.one.UI.MainUI;

import com.swtdesigner.SWTResourceManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;

public class MainUI5 {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainUI5 window = new MainUI5();
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
		shell.setBackgroundImage(SWTResourceManager.getImage(MainUI5.class, "/image/白背景.jpg"));
		shell.setSize(1920, 1080);
		shell.setText("SWT Application");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		SashForm sashForm = new SashForm(shell, SWT.NONE);
		sashForm.setOrientation(SWT.VERTICAL);
		
		Composite composite = new Composite(sashForm, SWT.NONE);
		composite.setBackgroundImage(SWTResourceManager.getImage(MainUI5.class, "/image/白背景.jpg"));
		
		Label label = new Label(composite, SWT.NONE);
		label.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/进度.png"));
		label.setBounds(137, 10, 1618, 143);
		
		Composite composite_1 = new Composite(sashForm, SWT.NONE);
		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		SashForm sashForm_1 = new SashForm(composite_1, SWT.NONE);
		
		Composite composite_2 = new Composite(sashForm_1, SWT.NONE);
		composite_2.setBackgroundMode(SWT.INHERIT_DEFAULT);
		composite_2.setBackgroundImage(SWTResourceManager.getImage(MainUI5.class, "/image/白背景.jpg"));
		
		Label label_1 = new Label(composite_2, SWT.NONE);
		label_1.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		label_1.setBounds(183, 32, 48, 41);
		
		Label label_2 = new Label(composite_2, SWT.NONE);
		label_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 18, SWT.NORMAL));
		label_2.setText("可选座位");
		label_2.setBounds(256, 32, 120, 39);
		
		Label label_3 = new Label(composite_2, SWT.NONE);
		label_3.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/已售位.png"));
		label_3.setBounds(570, 32, 48, 41);
		
		Label label_4 = new Label(composite_2, SWT.NONE);
		label_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label_4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 18, SWT.NORMAL));
		label_4.setBounds(638, 34, 120, 39);
		label_4.setText("已售座位");
		
		Label label_5 = new Label(composite_2, SWT.NONE);
		label_5.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/已选位.png"));
		label_5.setBounds(919, 32, 48, 41);
		
		Label label_6 = new Label(composite_2, SWT.NONE);
		label_6.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label_6.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 18, SWT.NORMAL));
		label_6.setBounds(985, 32, 120, 39);
		label_6.setText("已选座位");
		
		Label label_7 = new Label(composite_2, SWT.NONE);
		label_7.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/银幕.png"));
		label_7.setBounds(198, 139, 885, 53);
		
		Label label_8 = new Label(composite_2, SWT.NONE);
		label_8.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label_8.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 18, SWT.NORMAL));
		label_8.setBounds(584, 212, 120, 39);
		label_8.setText("银幕中央");
		
		Button button = new Button(composite_2, SWT.NONE);
		button.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button.setBounds(198, 338, 48, 41);
		
		Button button_1 = new Button(composite_2, SWT.NONE);
		button_1.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_1.setBounds(318, 338, 48, 41);
		
		Button button_2 = new Button(composite_2, SWT.NONE);
		button_2.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_2.setBounds(431, 338, 48, 41);
		
		Button button_3 = new Button(composite_2, SWT.NONE);
		button_3.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_3.setBounds(551, 338, 48, 41);
		
		Button button_4 = new Button(composite_2, SWT.NONE);
		button_4.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_4.setBounds(682, 338, 48, 41);
		
		Button button_5 = new Button(composite_2, SWT.NONE);
		button_5.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_5.setBounds(793, 338, 48, 41);
		
		Button button_6 = new Button(composite_2, SWT.NONE);
		button_6.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_6.setBounds(919, 338, 48, 41);
		
		Button button_7 = new Button(composite_2, SWT.NONE);
		button_7.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_7.setBounds(1035, 338, 48, 41);
		
		Button button_8 = new Button(composite_2, SWT.NONE);
		button_8.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_8.setBounds(198, 426, 48, 41);
		
		Button button_9 = new Button(composite_2, SWT.NONE);
		button_9.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_9.setBounds(318, 426, 48, 41);
		
		Button button_10 = new Button(composite_2, SWT.NONE);
		button_10.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_10.setBounds(431, 426, 48, 41);
		
		Button button_11 = new Button(composite_2, SWT.NONE);
		button_11.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_11.setBounds(551, 426, 48, 41);
		
		Button button_12 = new Button(composite_2, SWT.NONE);
		button_12.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_12.setBounds(682, 426, 48, 41);
		
		Button button_13 = new Button(composite_2, SWT.NONE);
		button_13.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_13.setBounds(793, 426, 48, 41);
		
		Button button_14 = new Button(composite_2, SWT.NONE);
		button_14.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_14.setBounds(919, 426, 48, 41);
		
		Button button_15 = new Button(composite_2, SWT.NONE);
		button_15.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_15.setBounds(1035, 426, 48, 41);
		
		Button button_16 = new Button(composite_2, SWT.NONE);
		button_16.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_16.setBounds(198, 509, 48, 41);
		
		Button button_17 = new Button(composite_2, SWT.NONE);
		button_17.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_17.setBounds(318, 509, 48, 41);
		
		Button button_18 = new Button(composite_2, SWT.NONE);
		button_18.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_18.setBounds(431, 509, 48, 41);
		
		Button button_19 = new Button(composite_2, SWT.NONE);
		button_19.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_19.setBounds(551, 509, 48, 41);
		
		Button button_20 = new Button(composite_2, SWT.NONE);
		button_20.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_20.setBounds(682, 509, 48, 41);
		
		Button button_21 = new Button(composite_2, SWT.NONE);
		button_21.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_21.setBounds(793, 509, 48, 41);
		
		Button button_22 = new Button(composite_2, SWT.NONE);
		button_22.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_22.setBounds(919, 509, 48, 41);
		
		Button button_23 = new Button(composite_2, SWT.NONE);
		button_23.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_23.setBounds(1035, 509, 48, 41);
		
		Button button_24 = new Button(composite_2, SWT.NONE);
		button_24.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_24.setBounds(198, 595, 48, 41);
		
		Button button_25 = new Button(composite_2, SWT.NONE);
		button_25.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_25.setBounds(318, 595, 48, 41);
		
		Button button_26 = new Button(composite_2, SWT.NONE);
		button_26.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_26.setBounds(431, 595, 48, 41);
		
		Button button_27 = new Button(composite_2, SWT.NONE);
		button_27.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_27.setBounds(551, 595, 48, 41);
		
		Button button_28 = new Button(composite_2, SWT.NONE);
		button_28.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_28.setBounds(682, 595, 48, 41);
		
		Button button_29 = new Button(composite_2, SWT.NONE);
		button_29.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_29.setBounds(793, 595, 48, 41);
		
		Button button_30 = new Button(composite_2, SWT.NONE);
		button_30.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_30.setBounds(919, 595, 48, 41);
		
		Button button_31 = new Button(composite_2, SWT.NONE);
		button_31.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_31.setBounds(1035, 595, 48, 41);
		
		Button button_32 = new Button(composite_2, SWT.NONE);
		button_32.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_32.setBounds(198, 680, 48, 41);
		
		Button button_33 = new Button(composite_2, SWT.NONE);
		button_33.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_33.setBounds(318, 680, 48, 41);
		
		Button button_34 = new Button(composite_2, SWT.NONE);
		button_34.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_34.setBounds(431, 680, 48, 41);
		
		Button button_35 = new Button(composite_2, SWT.NONE);
		button_35.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_35.setBounds(551, 680, 48, 41);
		
		Button button_36 = new Button(composite_2, SWT.NONE);
		button_36.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_36.setBounds(682, 680, 48, 41);
		
		Button button_37 = new Button(composite_2, SWT.NONE);
		button_37.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_37.setBounds(793, 680, 48, 41);
		
		Button button_38 = new Button(composite_2, SWT.NONE);
		button_38.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_38.setBounds(919, 680, 48, 41);
		
		Button button_39 = new Button(composite_2, SWT.NONE);
		button_39.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/空位.png"));
		button_39.setBounds(1035, 680, 48, 41);
		
		Label label_9 = new Label(composite_2, SWT.NONE);
		label_9.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label_9.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 18, SWT.NORMAL));
		label_9.setBounds(44, 338, 48, 41);
		label_9.setText("1");
		
		Label label_10 = new Label(composite_2, SWT.NONE);
		label_10.setText("2");
		label_10.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label_10.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 18, SWT.NORMAL));
		label_10.setBounds(44, 426, 48, 41);
		
		Label label_11 = new Label(composite_2, SWT.NONE);
		label_11.setText("3");
		label_11.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label_11.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 18, SWT.NORMAL));
		label_11.setBounds(44, 509, 48, 41);
		
		Label label_12 = new Label(composite_2, SWT.NONE);
		label_12.setText("4");
		label_12.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label_12.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 18, SWT.NORMAL));
		label_12.setBounds(44, 595, 48, 41);
		
		Label label_13 = new Label(composite_2, SWT.NONE);
		label_13.setText("5");
		label_13.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label_13.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 18, SWT.NORMAL));
		label_13.setBounds(44, 680, 48, 41);
		
		Composite composite_3 = new Composite(sashForm_1, SWT.NONE);
		composite_3.setBackgroundMode(SWT.INHERIT_DEFAULT);
		composite_3.setBackgroundImage(SWTResourceManager.getImage(MainUI5.class, "/image/灰.png"));
		
		Label label_14 = new Label(composite_3, SWT.NONE);
		label_14.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/皮卡丘.jpg"));
		label_14.setBounds(63, 48, 188, 264);
		
		Label label_15 = new Label(composite_3, SWT.NONE);
		label_15.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 20, SWT.NORMAL));
		label_15.setBounds(303, 48, 198, 43);
		label_15.setText("大侦探皮卡丘");
		
		Label label_16 = new Label(composite_3, SWT.NONE);
		label_16.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_16.setBounds(303, 116, 253, 30);
		label_16.setText("类型：冒险，奇幻，喜剧");
		
		Label label_17 = new Label(composite_3, SWT.NONE);
		label_17.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_17.setBounds(303, 163, 154, 30);
		label_17.setText("时长：104分钟");
		
		Label label_18 = new Label(composite_3, SWT.NONE);
		label_18.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_18.setBounds(303, 211, 292, 30);
		label_18.setText("影院：睿智影城（南华分店）");
		
		Label label_19 = new Label(composite_3, SWT.NONE);
		label_19.setText("影厅：15号厅（冠名招商中）");
		label_19.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_19.setBounds(63, 362, 292, 30);
		
		Label lbld = new Label(composite_3, SWT.NONE);
		lbld.setText("版本：原版3D");
		lbld.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		lbld.setBounds(63, 408, 292, 30);
		
		Label label_21 = new Label(composite_3, SWT.NONE);
		label_21.setText("场次：");
		label_21.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_21.setBounds(60, 451, 69, 30);
		
		Label label_22 = new Label(composite_3, SWT.NONE);
		label_22.setText("票价：");
		label_22.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_22.setBounds(63, 498, 60, 30);
		
		Label label_20 = new Label(composite_3, SWT.NONE);
		label_20.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		label_20.setText("今天 6月3 14：20");
		label_20.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_20.setBounds(134, 451, 198, 30);
		
		Label label_23 = new Label(composite_3, SWT.NONE);
		label_23.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/分隔线.png"));
		label_23.setBounds(50, 534, 548, 20);
		
		Label label_24 = new Label(composite_3, SWT.NONE);
		label_24.setText("座位：");
		label_24.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_24.setBounds(63, 560, 60, 30);
		
		Label label_25 = new Label(composite_3, SWT.NONE);
		label_25.setText("总价：");
		label_25.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_25.setBounds(63, 641, 60, 30);
		
		Label label_26 = new Label(composite_3, SWT.NONE);
		label_26.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/分隔线.png"));
		label_26.setBounds(50, 677, 548, 20);
		
		Button button_40 = new Button(composite_3, SWT.NONE);
		button_40.setImage(SWTResourceManager.getImage(MainUI5.class, "/image/选座.png"));
		button_40.setBounds(178, 729, 279, 85);
		sashForm_1.setWeights(new int[] {1302, 607});
		sashForm.setWeights(new int[] {157, 883});

	}
}
