package com.yc.one.Util;

import java.util.Map;

import com.yc.one.UI.Login.Login;
import com.yc.one.UI.MainUI.DaZhenTan;
import com.yc.one.UI.MainUI.FuChouZhe;
import com.yc.one.UI.MainUI.GouDeShiMing;
import com.yc.one.UI.MainUI.PreMainUI;
import com.yc.one.UI.Login.RePassword;
import com.yc.one.UI.Login.Recall;
import com.yc.one.UI.Login.Register;
import com.yc.one.UI.PayUI.XuanZuo;
import org.eclipse.swt.custom.StackLayout;


public class InitData {
	
	public static Map<String,String> loginUserInfo;
	public static StackLayout stackLayout = new StackLayout();
	
	public static Map<String,String> LoginUserInfo;
	public static Register register;
	public static PreMainUI premain;
	public static Login Login;
	public static int RegisterUserInfo;
	public static Recall rc;
	public static RePassword rp;
	public static int RePasswordUserInfo;
	public static int RePsdInfo;
	public static DaZhenTan dazhentan = null;
	public static FuChouZhe fuchouzhe = null;
	public static GouDeShiMing goudeshiming = null ;

	public static XuanZuo xuanzuo;
}
