package com.yc.one.UI.MainUI;
import com.swtdesigner.SWTResourceManager;
import com.yc.one.Dao.AdminDao;
import com.yc.one.Util.InitInfo;
import com.yc.one.Util.MySeat;
import com.yc.one.Util.SeatIndex;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;

import java.util.*;
import java.util.List;


public class Seat {

	protected Shell shell;

	private int price=0;	//总票价
	private Label label_24;
	private Label label_25;
	private int index=0; //已选座位号
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Seat window = new Seat();
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
		//保存点击的坐标
		List<MySeat> list = new ArrayList<>();

		shell = new Shell();
		shell.setBackgroundImage(SWTResourceManager.getImage(Seat.class, "/image/白背景.jpg"));
		shell.setSize(1960, 1030);
		shell.setText("选座");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));

		AdminDao adminDao=new AdminDao();

		Rectangle rtl = Display.getDefault().getClientArea();
		shell.setLocation((rtl.width - shell.getSize().x) / 2,(rtl.height - shell.getSize().y) / 2);

		SashForm sashForm = new SashForm(shell, SWT.NONE);
		sashForm.setOrientation(SWT.VERTICAL);

		Composite composite = new Composite(sashForm, SWT.NONE);
		composite.setBackgroundImage(SWTResourceManager.getImage(Seat.class, "/image/白背景.jpg"));

		Label label = new Label(composite, SWT.NONE);
		label.setImage(SWTResourceManager.getImage(Seat.class, "/image/进度.png"));
		label.setBounds(137, 10, 1618, 143);

		Composite composite_1 = new Composite(sashForm, SWT.NONE);
		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));

		SashForm sashForm_1 = new SashForm(composite_1, SWT.NONE);

		Composite composite_2 = new Composite(sashForm_1, SWT.NONE);
		composite_2.setBackgroundMode(SWT.INHERIT_DEFAULT);
		composite_2.setBackgroundImage(SWTResourceManager.getImage(Seat.class, "/image/白背景.jpg"));

		Label label_1 = new Label(composite_2, SWT.NONE);
		label_1.setImage(SWTResourceManager.getImage(Seat.class, "/image/空位.png"));
		label_1.setBounds(183, 32, 48, 41);

		Label label_2 = new Label(composite_2, SWT.NONE);
		label_2.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 18, SWT.NORMAL));
		label_2.setText("可选座位");
		label_2.setBounds(256, 32, 120, 39);

		Label label_3 = new Label(composite_2, SWT.NONE);
		label_3.setImage(SWTResourceManager.getImage(Seat.class, "/image/已售位.png"));
		label_3.setBounds(570, 32, 48, 41);

		Label label_4 = new Label(composite_2, SWT.NONE);
		label_4.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label_4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 18, SWT.NORMAL));
		label_4.setBounds(638, 34, 120, 39);
		label_4.setText("已售座位");

		Label label_5 = new Label(composite_2, SWT.NONE);
		label_5.setImage(SWTResourceManager.getImage(Seat.class, "/image/已选位.png"));
		label_5.setBounds(919, 32, 48, 41);

		Label label_6 = new Label(composite_2, SWT.NONE);
		label_6.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label_6.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 18, SWT.NORMAL));
		label_6.setBounds(985, 32, 120, 39);
		label_6.setText("已选座位");

		Label label_7 = new Label(composite_2, SWT.NONE);
		label_7.setImage(SWTResourceManager.getImage(Seat.class, "/image/银幕.png"));
		label_7.setBounds(198, 139, 885, 53);

		Label label_8 = new Label(composite_2, SWT.NONE);
		label_8.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_DARK_SHADOW));
		label_8.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 18, SWT.NORMAL));
		label_8.setBounds(584, 212, 120, 39);
		label_8.setText("银幕中央");
		Map<Label,MySeat> map = new HashMap<>();


		//座位表输出
		for(int row=1;row<6;row++){
			for(int col=1;col<9;col++){
				Label la = new Label(composite_2, SWT.NONE);
				la.setImage(SWTResourceManager.getImage(Seat.class, "/image/空位.png"));
				la.setBounds(198+120*col, 338+83*row, 48, 41);
				map.put(la,new MySeat(row,col));
				SeatIndex seatNO= new SeatIndex();
				//int index=seatNO.SeatSelected(row,col);	//获取座位号

				la.addMouseListener(new MouseAdapter() {
					private boolean clicked;
					@Override
					public void mouseDown(MouseEvent e) {
						Label l = (Label)e.getSource();
						MySeat mseat = map.get(l);
						if(clicked){
							System.out.println(index);	//测试点4：座位号
							for (int a=0;a<list.size();a++){
								if(mseat.getX()==list.get(a).getX()&&list.get(a).getY()==mseat.getY())
								{list.remove(a);}
							}
							l.setImage(SWTResourceManager.getImage(Seat.class, "/image/空位.png"));


							//座位信息传递
							label_24.setText("座位："+InitInfo.seatlocation);
							clicked = false;
							price=price-50;
							label_25.setText("总价："+price+"元");
							
						}else{
							l.setImage(SWTResourceManager.getImage(Seat.class, "/image/已选位.png"));
							list.add(mseat);
							InitInfo.seatlocation=mseat.getX()+"排"+mseat.getY()+"列";
							System.out.println("测试点6："+mseat.getX()+","+mseat.getY());	//测试点6：座位坐标

							index=seatNO.SeatSelected(mseat.getX(),mseat.getY()); //已选座位号获取
							InitInfo.SeatsSelected=Arrays.toString(seatNO.ArrIn(index));//存入已选座位
							System.out.println(Arrays.toString(seatNO.ArrIn(index)));
							adminDao.SeatIndexUpdate(InitInfo.moviename,InitInfo.SeatsSelected); //将获取的已选座位存入数据库

							label_24.setText("座位："+InitInfo.seatlocation);
							clicked = true;
							price=price+50;
							label_25.setText("总价："+price+"元");
						}
						shell.layout();
					}
				});
			}

		}

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
		composite_3.setBackgroundImage(SWTResourceManager.getImage(Seat.class, "/image/灰.png"));

		Label label_14 = new Label(composite_3, SWT.NONE);
		label_14.setImage(SWTResourceManager.getImage(Seat.class, adminDao.MovieImage(InitInfo.moviename)));
		label_14.setBounds(63, 48, 188, 264);

		Label label_15 = new Label(composite_3, SWT.NONE);
		label_15.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 20, SWT.NORMAL));
		label_15.setBounds(303, 48, 198, 43);
		label_15.setText(InitInfo.moviename);

		Label label_16 = new Label(composite_3, SWT.NONE);
		label_16.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_16.setBounds(303, 116, 300, 30);
		label_16.setText("类型："+adminDao.MovieKind(InitInfo.moviename));

		Label label_17 = new Label(composite_3, SWT.NONE);
		label_17.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_17.setBounds(303, 163, 154, 30);
		label_17.setText("时长："+adminDao.MovieTime(InitInfo.moviename));

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
		label_21.setText("场次：01");
		label_21.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_21.setBounds(60, 451, 100, 30);

		Label label_22 = new Label(composite_3, SWT.NONE);
		label_22.setText("票价：50/张");
		label_22.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_22.setBounds(63, 498, 150, 30);

		Label label_20 = new Label(composite_3, SWT.NONE);
		label_20.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		label_20.setText("");
		label_20.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_20.setBounds(134, 451, 198, 30);

		Label label_23 = new Label(composite_3, SWT.NONE);
		label_23.setImage(SWTResourceManager.getImage(Seat.class, "/image/分隔线.png"));
		label_23.setBounds(50, 534, 548, 20);

		label_24 = new Label(composite_3, SWT.NONE);
		label_24.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_24.setBounds(63, 560, 300, 40);

		label_25 = new Label(composite_3, SWT.NONE);
		//label_25.setText("总价："+price+"元");
		label_25.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 14, SWT.NORMAL));
		label_25.setBounds(63, 641, 150, 30);

		Label label_26 = new Label(composite_3, SWT.NONE);
		label_26.setImage(SWTResourceManager.getImage(Seat.class, "/image/分隔线.png"));
		label_26.setBounds(50, 677, 548, 20);

		Button button_40 = new Button(composite_3, SWT.NONE);
		button_40.setImage(SWTResourceManager.getImage(Seat.class, "/image/选座.png"));
		button_40.setBounds(178, 729, 279, 85);
		sashForm_1.setWeights(new int[] {1302, 607});
		sashForm.setWeights(new int[] {157, 883});

		button_40.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				adminDao.OrderUpdate(InitInfo.account,InitInfo.moviename,price,InitInfo.seatlocation,price/50);
				MessageBox mb = new MessageBox(shell,SWT.YES | SWT.NO | SWT.CANCEL |SWT.ICON_WORKING);
				mb.setText("提示:");
				mb.setMessage("购票成功,请到前台领取票据！");
				mb.open();
				shell.dispose();
			}
		});

	}

}
