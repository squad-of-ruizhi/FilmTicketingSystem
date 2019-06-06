package com.yc.one.UI.MainUI;

import com.swtdesigner.SWTResourceManager;
import com.yc.one.Util.InitData;
import com.yc.one.Util.InitInfo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;

public class MovieUI {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MovieUI window = new MovieUI();
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
		shell.setBackgroundImage(SWTResourceManager.getImage(MovieUI.class, "/image/白背景.jpg"));
		shell.setSize(1920, 1080);
		shell.setText("SWT Application");
		
		Button button = new Button(shell, SWT.NONE);
		button.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/哥斯拉.jpg"));
		button.setBounds(26, 150, 188, 263);
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.setBounds(246, 150, 120, 30);
		button_1.setText("哥斯拉2:怪兽之王");
		
		Label label = new Label(shell, SWT.NONE);
		label.setBounds(246, 219, 110, 20);
		label.setText("片长：132分钟");
		
		Label label_1 = new Label(shell, SWT.NONE);
		label_1.setBounds(246, 245, 76, 20);
		label_1.setText("地区：美国");
		
		Label label_2 = new Label(shell, SWT.NONE);
		label_2.setBounds(246, 271, 147, 20);
		label_2.setText("类型：科幻/灾难/动作");
		
		Label label_3 = new Label(shell, SWT.NONE);
		label_3.setBounds(246, 298, 142, 20);
		label_3.setText("导演：迈克尔·道赫蒂");
		
		Label label_4 = new Label(shell, SWT.NONE);
		label_4.setBounds(246, 324, 202, 20);
		label_4.setText("主演：凯尔·钱德勒/维拉·法梅..");
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/购票副本.png"));
		button_2.setBounds(246, 368, 176, 45);

		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitInfo.moviename="哥斯拉2:怪兽之王";
				InitData.movieInfo=new MovieInfo(shell,0);
				InitData.movieInfo.open();
			}
		});
		
		Button button_3 = new Button(shell, SWT.NONE);
		button_3.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/皮卡丘.jpg"));
		button_3.setBounds(504, 150, 188, 263);
		
		Button button_4 = new Button(shell, SWT.NONE);
		button_4.setBounds(727, 150, 98, 30);
		button_4.setText("大侦探皮卡丘");
		
		Button button_5 = new Button(shell, SWT.NONE);
		button_5.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/购票副本.png"));
		button_5.setBounds(729, 368, 176, 45);

		button_5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitInfo.moviename="大侦探皮卡丘";
				InitData.movieInfo=new MovieInfo(shell,0);
				InitData.movieInfo.open();
			}
		});
		
		Label label_5 = new Label(shell, SWT.NONE);
		label_5.setBounds(729, 219, 110, 20);
		label_5.setText("片长：104分钟");
		
		Label label_6 = new Label(shell, SWT.NONE);
		label_6.setBounds(729, 245, 76, 20);
		label_6.setText("地区：美国");
		
		Label label_7 = new Label(shell, SWT.NONE);
		label_7.setBounds(729, 271, 147, 20);
		label_7.setText("类型：冒险/奇幻/喜剧");
		
		Label label_8 = new Label(shell, SWT.NONE);
		label_8.setBounds(729, 298, 126, 20);
		label_8.setText("导演：罗伯·莱特曼");
		
		Label label_9 = new Label(shell, SWT.NONE);
		label_9.setBounds(729, 324, 208, 20);
		label_9.setText("主演：瑞安·雷诺兹/贾斯蒂斯..");
		
		Button button_6 = new Button(shell, SWT.NONE);
		button_6.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/何以为家.jpg"));
		button_6.setBounds(969, 150, 188, 263);
		
		Button button_7 = new Button(shell, SWT.NONE);
		button_7.setBounds(1190, 150, 98, 30);
		button_7.setText("何以为家");
		
		Label label_10 = new Label(shell, SWT.NONE);
		label_10.setBounds(1190, 219, 110, 20);
		label_10.setText("片长：116分钟");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(1190, 245, 76, 20);
		lblNewLabel.setText("地区：黎巴嫩/法国/美国");
		
		Label label_11 = new Label(shell, SWT.NONE);
		label_11.setBounds(1190, 271, 76, 20);
		label_11.setText("类型：剧情");
		
		Label lblsamee = new Label(shell, SWT.NONE);
		lblsamee.setBounds(1190, 298, 190, 20);
		lblsamee.setText("导演：娜丁·拉巴基/Samee..");
		
		Label label_12 = new Label(shell, SWT.NONE);
		label_12.setBounds(1190, 324, 208, 20);
		label_12.setText("主演：赞恩·阿尔·拉菲亚/约丹..");
		
		Button button_8 = new Button(shell, SWT.NONE);
		button_8.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/购票副本.png"));
		button_8.setBounds(1190, 368, 176, 45);

		button_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitInfo.moviename="何以为家";
				InitData.movieInfo=new MovieInfo(shell,0);
				InitData.movieInfo.open();
			}
		});
		
		Button button_9 = new Button(shell, SWT.NONE);
		button_9.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/阿拉丁.jpg"));
		button_9.setBounds(1430, 150, 188, 263);
		
		Button button_10 = new Button(shell, SWT.NONE);
		button_10.setBounds(1646, 150, 98, 30);
		button_10.setText("阿拉丁");
		
		Label label_13 = new Label(shell, SWT.NONE);
		label_13.setBounds(1646, 219, 107, 20);
		label_13.setText("片长：128分钟");
		
		Label label_14 = new Label(shell, SWT.NONE);
		label_14.setBounds(1646, 245, 76, 20);
		label_14.setText("地区：美国");
		
		Label label_15 = new Label(shell, SWT.NONE);
		label_15.setBounds(1646, 271, 76, 20);
		label_15.setText("类型：爱情/奇幻/冒险");
		
		Label label_16 = new Label(shell, SWT.NONE);
		label_16.setBounds(1646, 298, 101, 20);
		label_16.setText("导演：盖·里奇");
		
		Label label_17 = new Label(shell, SWT.NONE);
		label_17.setBounds(1646, 324, 209, 20);
		label_17.setText("主演：梅纳·玛索德/娜奥米·斯..");
		
		Button button_11 = new Button(shell, SWT.NONE);
		button_11.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/购票副本.png"));
		button_11.setBounds(1646, 368, 176, 45);

		button_11.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitInfo.moviename="阿拉丁";
				InitData.movieInfo=new MovieInfo(shell,0);
				InitData.movieInfo.open();
			}
		});
		
		Button button_12 = new Button(shell, SWT.NONE);
		button_12.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/五月天.jpg"));
		button_12.setBounds(26, 449, 188, 263);
		
		Button button_13 = new Button(shell, SWT.NONE);
		button_13.setBounds(246, 449, 149, 30);
		button_13.setText("五月天人生无限公司");
		
		Label label_18 = new Label(shell, SWT.NONE);
		label_18.setBounds(246, 518, 110, 20);
		label_18.setText("片长：112分钟");
		
		Label label_19 = new Label(shell, SWT.NONE);
		label_19.setBounds(246, 544, 110, 20);
		label_19.setText("地区：中国台湾");
		
		Label label_20 = new Label(shell, SWT.NONE);
		label_20.setBounds(246, 570, 126, 20);
		label_20.setText("类型：纪录片/音乐");
		
		Label label_21 = new Label(shell, SWT.NONE);
		label_21.setBounds(246, 597, 98, 20);
		label_21.setText("导演：陈奕仁");
		
		Label label_22 = new Label(shell, SWT.NONE);
		label_22.setBounds(246, 623, 202, 20);
		label_22.setText("主演：温尚翊/石锦航/蔡升晏");
		
		Button button_14 = new Button(shell, SWT.NONE);
		button_14.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/购票副本.png"));
		button_14.setBounds(246, 667, 176, 45);

		button_14.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitInfo.moviename="五月天人生无限公司";
				InitData.movieInfo=new MovieInfo(shell,0);
				InitData.movieInfo.open();
			}
		});
		
		Button button_15 = new Button(shell, SWT.NONE);
		button_15.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/一条狗的使命.jpg"));
		button_15.setBounds(504, 449, 188, 263);
		
		Button button_16 = new Button(shell, SWT.NONE);
		button_16.setBounds(729, 449, 110, 30);
		button_16.setText("一条狗的使命2");
		
		Label label_23 = new Label(shell, SWT.NONE);
		label_23.setBounds(729, 518, 110, 20);
		label_23.setText("片长：108分钟");
		
		Label label_24 = new Label(shell, SWT.NONE);
		label_24.setBounds(729, 544, 76, 20);
		label_24.setText("地区：美国");
		
		Label label_25 = new Label(shell, SWT.NONE);
		label_25.setBounds(729, 570, 147, 20);
		label_25.setText("类型：剧情/喜剧/家庭");
		
		Label label_26 = new Label(shell, SWT.NONE);
		label_26.setBounds(729, 597, 133, 20);
		label_26.setText("导演：盖尔·曼库索");
		
		Label label_27 = new Label(shell, SWT.NONE);
		label_27.setBounds(729, 623, 208, 20);
		label_27.setText("主演：丹尼斯·奎德/凯瑟琳·普..");
		
		Button button_17 = new Button(shell, SWT.NONE);
		button_17.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/购票副本.png"));
		button_17.setBounds(729, 667, 176, 45);

		button_17.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitInfo.moviename="一条狗的使命2";
				InitData.movieInfo=new MovieInfo(shell,0);
				InitData.movieInfo.open();
			}
		});
		
		Button button_18 = new Button(shell, SWT.NONE);
		button_18.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/奥特曼.jpg"));
		button_18.setBounds(969, 449, 188, 263);
		
		Button button_19 = new Button(shell, SWT.NONE);
		button_19.setBounds(1190, 449, 191, 30);
		button_19.setText("钢铁飞龙之奥特曼崛起");
		
		Label label_28 = new Label(shell, SWT.NONE);
		label_28.setBounds(1190, 518, 76, 20);
		label_28.setText("片长：91分钟");
		
		Label label_29 = new Label(shell, SWT.NONE);
		label_29.setBounds(1190, 544, 76, 20);
		label_29.setText("地区：中国大陆");
		
		Label label_30 = new Label(shell, SWT.NONE);
		label_30.setBounds(1190, 570, 147, 20);
		label_30.setText("类型：动画/动作/科幻");
		
		Label label_31 = new Label(shell, SWT.NONE);
		label_31.setBounds(1190, 597, 76, 20);
		label_31.setText("导演：王巍");
		
		Label label_32 = new Label(shell, SWT.NONE);
		label_32.setBounds(1190, 623, 76, 20);
		label_32.setText("主演：暂无");
		
		Button button_20 = new Button(shell, SWT.NONE);
		button_20.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/购票副本.png"));
		button_20.setBounds(1187, 667, 176, 45);

		button_20.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitInfo.moviename="钢铁飞龙之奥特曼崛起";
				InitData.movieInfo=new MovieInfo(shell,0);
				InitData.movieInfo.open();
			}
		});
		
		Button button_21 = new Button(shell, SWT.NONE);
		button_21.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/我的影子.jpg"));
		button_21.setBounds(1430, 449, 188, 263);
		
		Button button_22 = new Button(shell, SWT.NONE);
		button_22.setBounds(1646, 449, 120, 30);
		button_22.setText("我的影子在奔跑");
		
		Label label_33 = new Label(shell, SWT.NONE);
		label_33.setBounds(1646, 518, 76, 20);
		label_33.setText("片长：92分钟");
		
		Label label_34 = new Label(shell, SWT.NONE);
		label_34.setBounds(1646, 544, 120, 20);
		label_34.setText("地区：中国大陆");
		
		Label label_35 = new Label(shell, SWT.NONE);
		label_35.setBounds(1646, 570, 147, 20);
		label_35.setText("类型：剧情/儿童/家庭");
		
		Label label_36 = new Label(shell, SWT.NONE);
		label_36.setBounds(1646, 597, 98, 20);
		label_36.setText("导演：方刚亮");
		
		Label label_37 = new Label(shell, SWT.NONE);
		label_37.setBounds(1646, 623, 214, 20);
		label_37.setText("主演：张静初/龙品旭/黎兆丰/..");
		
		Button button_23 = new Button(shell, SWT.NONE);
		button_23.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/购票副本.png"));
		button_23.setBounds(1646, 667, 176, 45);

		button_23.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitInfo.moviename="我的影子在奔跑";
				InitData.movieInfo=new MovieInfo(shell,0);
				InitData.movieInfo.open();
			}
		});
		
		Button button_24 = new Button(shell, SWT.NONE);
		button_24.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/米花之味.jpg"));
		button_24.setBounds(26, 752, 188, 263);
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(527, 43, 695, 45);
		
		Button button_25 = new Button(shell, SWT.NONE);
		button_25.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/搜索.jpg"));
		button_25.setBounds(1263, 43, 100, 45);
		
		Button button_26 = new Button(shell, SWT.NONE);
		button_26.setBounds(246, 752, 98, 30);
		button_26.setText("米花之味");
		
		Label label_38 = new Label(shell, SWT.NONE);
		label_38.setBounds(246, 821, 76, 20);
		label_38.setText("片长：95分钟");
		
		Label label_39 = new Label(shell, SWT.NONE);
		label_39.setBounds(246, 847, 110, 20);
		label_39.setText("地区：中国大陆");
		
		Label label_40 = new Label(shell, SWT.NONE);
		label_40.setBounds(246, 877, 76, 20);
		label_40.setText("类型：剧情");
		
		Label label_41 = new Label(shell, SWT.NONE);
		label_41.setBounds(246, 909, 76, 20);
		label_41.setText("导演：鹏飞");
		
		Label label_42 = new Label(shell, SWT.NONE);
		label_42.setBounds(246, 935, 196, 20);
		label_42.setText("主演：英泽/叶不勒/茶艾南");
		
		Button button_27 = new Button(shell, SWT.NONE);
		button_27.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/购票副本.png"));
		button_27.setBounds(246, 970, 176, 45);

		button_27.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitInfo.moviename="米花之味";
				InitData.movieInfo=new MovieInfo(shell,0);
				InitData.movieInfo.open();
			}
		});
		
		Button button_28 = new Button(shell, SWT.NONE);
		button_28.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/春天的马拉松.jpg"));
		button_28.setBounds(504, 752, 188, 263);
		
		Button button_29 = new Button(shell, SWT.NONE);
		button_29.setBounds(727, 752, 98, 30);
		button_29.setText("春天的马拉松");
		
		Label label_43 = new Label(shell, SWT.NONE);
		label_43.setBounds(729, 831, 76, 20);
		label_43.setText("片长：96分钟");
		
		Label label_44 = new Label(shell, SWT.NONE);
		label_44.setBounds(727, 857, 112, 20);
		label_44.setText("地区：中国大陆");
		
		Label label_45 = new Label(shell, SWT.NONE);
		label_45.setBounds(729, 883, 76, 20);
		label_45.setText("类型：剧情");
		
		Label label_46 = new Label(shell, SWT.NONE);
		label_46.setBounds(727, 909, 112, 20);
		label_46.setText("导演：夏晓昀");
		
		Label label_47 = new Label(shell, SWT.NONE);
		label_47.setBounds(727, 935, 178, 20);
		label_47.setText("主演：张铎/郑昊/杨立新");
		
		Button button_30 = new Button(shell, SWT.NONE);
		button_30.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/购票副本.png"));
		button_30.setBounds(727, 970, 176, 45);

		button_30.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitInfo.moviename="春天的马拉松";
				InitData.movieInfo=new MovieInfo(shell,0);
				InitData.movieInfo.open();
			}
		});
		
		Button button_31 = new Button(shell, SWT.NONE);
		button_31.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/旺扎的雨靴.jpg"));
		button_31.setBounds(969, 752, 188, 263);
		
		Button button_32 = new Button(shell, SWT.NONE);
		button_32.setBounds(1190, 752, 98, 30);
		button_32.setText("旺扎的雨靴");
		
		Label label_48 = new Label(shell, SWT.NONE);
		label_48.setBounds(1190, 831, 98, 20);
		label_48.setText("片长：90分钟");
		
		Label label_49 = new Label(shell, SWT.NONE);
		label_49.setBounds(1190, 857, 110, 20);
		label_49.setText("地区：中国大陆");
		
		Label label_50 = new Label(shell, SWT.NONE);
		label_50.setBounds(1190, 883, 126, 20);
		label_50.setText("类型：剧情/家庭");
		
		Label label_51 = new Label(shell, SWT.NONE);
		label_51.setBounds(1190, 909, 113, 20);
		label_51.setText("导演：拉华加");
		
		Label label_52 = new Label(shell, SWT.NONE);
		label_52.setBounds(1190, 935, 190, 20);
		label_52.setText("主演：周拉多杰/金巴/才多");
		
		Button button_33 = new Button(shell, SWT.NONE);
		button_33.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/购票副本.png"));
		button_33.setBounds(1190, 970, 176, 45);

		button_33.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitInfo.moviename="旺扎的雨靴";
				InitData.movieInfo=new MovieInfo(shell,0);
				InitData.movieInfo.open();
			}
		});
		
		Button button_34 = new Button(shell, SWT.NONE);
		button_34.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/特别追凶.jpg"));
		button_34.setBounds(1430, 752, 188, 263);
		
		Button button_35 = new Button(shell, SWT.NONE);
		button_35.setBounds(1646, 752, 98, 30);
		button_35.setText("特别追凶");
		
		Label label_53 = new Label(shell, SWT.NONE);
		label_53.setBounds(1646, 821, 76, 20);
		label_53.setText("片长：87分钟");
		
		Label label_54 = new Label(shell, SWT.NONE);
		label_54.setBounds(1646, 847, 107, 20);
		label_54.setText("地区：中国大陆");
		
		Label label_55 = new Label(shell, SWT.NONE);
		label_55.setBounds(1646, 877, 76, 20);
		label_55.setText("类型：犯罪");
		
		Label label_56 = new Label(shell, SWT.NONE);
		label_56.setBounds(1646, 909, 98, 20);
		label_56.setText("导演：王启蘅");
		
		Label label_57 = new Label(shell, SWT.NONE);
		label_57.setBounds(1646, 935, 209, 20);
		label_57.setText("主演：周浩东/牛宝军/于心妍");
		
		Button button_36 = new Button(shell, SWT.NONE);
		button_36.setImage(SWTResourceManager.getImage(MovieUI.class, "/image/购票副本.png"));
		button_36.setBounds(1646, 970, 176, 45);

		button_36.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitInfo.moviename="特别追凶";
				InitData.movieInfo=new MovieInfo(shell,0);
				InitData.movieInfo.open();
			}
		});

	}
}
