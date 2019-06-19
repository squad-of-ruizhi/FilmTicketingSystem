package com.yc.one.UI.MainUI;

import com.swtdesigner.SWTResourceManager;
import com.yc.one.Dao.AdminDao;
import com.yc.one.Util.InitData;
import com.yc.one.Util.InitInfo;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class MovieInfo extends Dialog {

	protected Object result;
	protected Shell shell;
	private boolean isDown = false;
	private int clickX;
	private int clickY;



	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public MovieInfo(Shell parent, int style) {
		super(parent, style);
		setText("电影详情");

	}



	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shell.open();
		shell.layout();
		Display display = getParent().getDisplay();
		shell.setText("近期热门电影");
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shell = new Shell(getParent(), getStyle());
		shell.setSize(1100, 750);
		shell.setText("在线选座");

		shell.addMouseMoveListener(new MouseMoveListener() {
			@Override
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
		AdminDao adminDao=new AdminDao();
		
		Rectangle rtl = Display.getDefault().getClientArea();
		shell.setLocation((rtl.width - shell.getSize().x) / 2,(rtl.height - shell.getSize().y) / 2);
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setImage(SWTResourceManager.getImage(MovieInfo.class,adminDao.MovieImage(InitInfo.moviename)));
		lblNewLabel.setBounds(45, 34, 289, 396);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.BOLD));
		lblNewLabel_1.setBounds(452, 34, 197, 30);
		lblNewLabel_1.setText(InitInfo.moviename);
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 9, SWT.BOLD));
		lblNewLabel_2.setBounds(452, 80, 159, 20);
		lblNewLabel_2.setText("上映时间：");
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 9, SWT.BOLD));
		lblNewLabel_3.setBounds(452, 113, 145, 20);
		lblNewLabel_3.setText("导演："+adminDao.MovieDirector(InitInfo.moviename));
		
		Label lblNewLabel_4 = new Label(shell, SWT.NONE);
		lblNewLabel_4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 9, SWT.BOLD));
		lblNewLabel_4.setBounds(647, 113, 94, 20);
		lblNewLabel_4.setText("地区："+adminDao.Direction(InitInfo.moviename));
		
		Label lblNewLabel_5 = new Label(shell, SWT.NONE);
		lblNewLabel_5.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 9, SWT.BOLD));
		lblNewLabel_5.setBounds(452, 144, 336, 20);
		lblNewLabel_5.setText("主演："+adminDao.MovieActor(InitInfo.moviename));
		
		Label lblNewLabel_6 = new Label(shell, SWT.NONE);
		lblNewLabel_6.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 9, SWT.BOLD));
		lblNewLabel_6.setBounds(452, 170, 159, 20);
		lblNewLabel_6.setText("类型："+adminDao.MovieKind(InitInfo.moviename));
		
		Label lblNewLabel_7 = new Label(shell, SWT.NONE);
		lblNewLabel_7.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 9, SWT.BOLD));
		lblNewLabel_7.setBounds(647, 170, 124, 20);
		lblNewLabel_7.setText("片长："+adminDao.MovieTime(InitInfo.moviename));
		
		Label lblNewLabel_8 = new Label(shell, SWT.NONE);
		lblNewLabel_8.setBounds(465, 222, 570, 220);
		lblNewLabel_8.setText("简介：创世晶石危机一触即发，为了阻止地球毁灭，奥特曼选择了看似平凡的小男孩\r\n\r\n乐乐作为自己的人间体，面对重重挑战，原本调皮捣蛋的小屁孩在奥特曼的引导下，\r\n\r\n成为拯救地球的关键人物，而奥特曼超能力的秘密也逐渐被揭晓……");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		
		btnNewButton.setImage(SWTResourceManager.getImage(MovieInfo.class, "/image/购票.png"));
		btnNewButton.setBounds(887, 539, 98, 30);
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				btnNewButton_1.setImage(SWTResourceManager.getImage(MovieInfo.class,"/image/关闭颜色深.png"));
			}
			@Override
			public void mouseUp(MouseEvent e) {
				btnNewButton_1.setImage(SWTResourceManager.getImage(MovieInfo.class,"/image/关闭颜色浅.png"));
			}
		});
		
		btnNewButton_1.setImage(SWTResourceManager.getImage(MovieInfo.class, "/image/关闭颜色浅.png"));
		btnNewButton_1.setBounds(1068, 0, 32, 31);
		
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				
			}
		});

		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InitData.seat=new Seat();
				InitData.seat.open();
			}
		});

	}
}
