package com.yc.one.Util;

import java.util.Map;

import com.yc.one.UI.Login;
import com.yc.one.UI.MainUI.DaZhenTan;
import com.yc.one.UI.MainUI.FuChouZhe;
import com.yc.one.UI.MainUI.GouDeShiMing;
import com.yc.one.UI.MainUI.PreMainUI;
import com.yc.one.UI.RePassword;
import com.yc.one.UI.Recall;
import com.yc.one.UI.Register;
import org.eclipse.swt.custom.StackLayout;



import static com.sun.deploy.trace.TraceLevel.UI;


public class InitData {
	
	public static Map<String,String> loginUserInfo;
	public static StackLayout stackLayout = new StackLayout();
	
	public static Map<String,String> LoginUserInfo;
	public static Register register;
	public static PreMainUI main;
	public static com.yc.one.UI.Login Login;
	public static int RegisterUserInfo;
	public static Recall rc;
	public static RePassword rp;
	public static int RePasswordUserInfo;
	public static int RePsdInfo;
	public static DaZhenTan dazhentan = null;
	public static FuChouZhe fuchouzhe = null;
	public static GouDeShiMing goudeshiming = null ;
	
}
