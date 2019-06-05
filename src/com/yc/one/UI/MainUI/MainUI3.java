package com.yc.one.UI.MainUI;

import com.swtdesigner.SWTResourceManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

public class MainUI3 {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainUI3 window = new MainUI3();
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
		shell.setBackgroundImage(SWTResourceManager.getImage(MainUI3.class, "/image/白背景.jpg"));
		shell.setSize(1920, 1080);
		shell.setText("SWT Application");
		
		Label label = new Label(shell, SWT.NONE);
		label.setImage(SWTResourceManager.getImage(MainUI3.class, "/image/皮卡丘.jpg"));
		label.setBounds(333, 30, 300, 412);
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setFont(SWTResourceManager.getFont("黑体", 20, SWT.NORMAL));
		label_1.setBounds(1040, 56, 210, 33);
		label_1.setText("大侦探皮卡丘");
		
		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_2.setBounds(786, 115, 244, 33);
		label_2.setText("上映时间：2019-05-10");
		
		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_3.setBounds(786, 154, 204, 32);
		label_3.setText("导演：罗伯·莱特曼");
		
		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_4.setBounds(786, 192, 525, 33);
		label_4.setText("主演： 瑞安·雷诺兹  贾斯蒂斯·史密斯  凯瑟琳·纽顿");
		
		Label label_5 = new Label(shell, SWT.NONE);
		label_5.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_5.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_5.setBounds(786, 234, 232, 33);
		label_5.setText("类型：冒险/奇幻/喜剧");
		
		Label label_6 = new Label(shell, SWT.NONE);
		label_6.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_6.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_6.setBounds(1253, 154, 124, 33);
		label_6.setText("地区：美国");
		
		Label label_7 = new Label(shell, SWT.NONE);
		label_7.setForeground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		label_7.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_7.setBounds(1253, 234, 153, 33);
		label_7.setText("片长：104分钟");
		
		Label label_8 = new Label(shell, SWT.NONE);
		label_8.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_8.setBounds(786, 284, 884, 158);
		label_8.setText("简介：蒂姆·古德曼（贾斯提斯·史密斯 饰） 为寻找下落不明的父亲来到莱姆市，意外\r\n与父亲的前宝可梦搭档大侦探皮卡丘（瑞恩·雷诺兹 配音）相遇，并惊讶地发现自己\r\n是唯一能听懂皮卡丘说话的人类，他们决定组队踏上揭开真相的刺激冒险之路。探案\r\n过程中他们邂逅了各式各样的宝可梦，并意外发现了一个足以毁灭整个宝可梦宇宙的\r\n惊天阴谋。");
		
		Label label_9 = new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_9.setBounds(333, 604, 1300, 2);
		
		Label label_11 = new Label(shell, SWT.NONE);
		label_11.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_11.setBounds(333, 537, 110, 33);
		label_11.setText("购票/排期");
		
		Label label_10 = new Label(shell, SWT.NONE);
		label_10.setImage(SWTResourceManager.getImage(MainUI3.class, "/image/蓝.png"));
		label_10.setBounds(333, 576, 110, 8);
		
		Label label_12 = new Label(shell, SWT.NONE);
		label_12.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_12.setBounds(556, 537, 92, 30);
		label_12.setText("影片剧照");
		
		Label label_13 = new Label(shell, SWT.NONE);
		label_13.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_13.setBounds(754, 537, 92, 30);
		label_13.setText("热门短评");
		
		Label label_14 = new Label(shell, SWT.NONE);
		label_14.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_14.setBounds(333, 664, 917, 177);
		label_14.setText("排期： \t 10:00\t11:20\t11:40\t13:25\t14:20\t15:30\t16:05\t17:35\t18:40\r\n         \t 19:40\t20:30\t21:45");
		
		Button button = new Button(shell, SWT.NONE);
		button.setImage(SWTResourceManager.getImage(MainUI3.class, "/image/购票.png"));
		button.setBounds(1474, 684, 124, 26);

	}
}
