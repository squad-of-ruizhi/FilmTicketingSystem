package com.yc.one.Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import com.yc.one.Dao.DBHelper;
import com.yc.one.UI.MainUI.MyFilm;
import com.yc.one.Util.InitInfo;
import com.yc.one.Util.MyFilmList;

public class AdminDao {
	public Map<String, String> Login(String account, String pwd) {
		DBHelper db = new com.yc.one.Dao.DBHelper();
		String sql = "select cname, pwd from costumer where cname = ? and pwd = ?";
		List<Map<String, String>> list = db.find(sql, account, pwd);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;

	}

	//注册界面数据写入
	public int Register(String name, String pwd, String tel, String answer) {
		DBHelper dbHelper = new DBHelper();
		String sql = "INSERT INTO costumer (cname,pwd,tel,answer) VALUES (?,?,?,?);";
		int result = dbHelper.update(sql, name, pwd, tel, answer);
		if (result != -1) {
			return result;
		}
		return -1;

	}

	/**
	 * 匹配用户名和安全问题
	 */
	public Map<String, String> Check(String account, String answer) {
		DBHelper db = new DBHelper();
		String sql = "select cname,answer from costumer where cname=? and answer =?";
		List<Map<String, String>> list = db.find(sql, account, answer);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	//重置密码
	public int Repwd(String account, String newpwd) {
		DBHelper dbHelper = new DBHelper();
		String sql = "UPDATE `FilmTicketingSystem`.`costumer` SET `pwd` = ? WHERE (`cname` = ?);";
		int result = dbHelper.update(sql, newpwd, account);
		if (result != -1) {
			return result;
		}
		return -1;
	}

	//读取电影信息
	public String MovieImage(String mname) {  //读取海报图片
		DBHelper dbHelper = new DBHelper();
		String sql = "select imagesource from movie where mname=?;";
		List<Map<String, String>> list = dbHelper.find(sql, mname);
		if (list != null && list.size() > 0) {
			String str = list.get(0).toString();
			str = str.substring(str.indexOf("=") + 1, str.lastIndexOf("}"));
			return str;
		}
		return null;
	}

	public String Money(String mname) {  //读取用户余额
		DBHelper dbHelper = new DBHelper();
		String sql = "select money from costumer where cname=?;";
		List<Map<String, String>> list = dbHelper.find(sql, mname);
		if (list != null && list.size() > 0) {
			String str = list.get(0).toString();
			str = str.substring(str.indexOf("=") + 1, str.lastIndexOf("}"));
			return str;
		}
		return null;
	}

	public String Direction(String mname) {  //读取影片地区
		DBHelper dbHelper = new DBHelper();
		String sql = "select direction from movie where mname=?;";
		List<Map<String, String>> list = dbHelper.find(sql, mname);
		if (list != null && list.size() > 0) {
			String str = list.get(0).toString();
			str = str.substring(str.indexOf("=") + 1, str.lastIndexOf("}"));
			return str;
		}
		return null;
	}

	public String MovieKind(String mname) {  //读取电影类型
		DBHelper dbHelper = new DBHelper();
		String sql = "select kind from movie where mname=?;";
		List<Map<String, String>> list = dbHelper.find(sql, mname);
		if (list != null && list.size() > 0) {
			String str = list.get(0).toString();
			str = str.substring(str.indexOf("=") + 1, str.lastIndexOf("}"));
			return str;
		}
		return null;
	}

	public String MovieActor(String mname) {  //读取电影主演
		DBHelper dbHelper = new DBHelper();
		String sql = "select actor from movie where mname=?;";
		List<Map<String, String>> list = dbHelper.find(sql, mname);
		if (list != null && list.size() > 0) {
			String str = list.get(0).toString();
			str = str.substring(str.indexOf("=") + 1, str.lastIndexOf("}"));
			return str;
		}
		return null;
	}

	public String MovieDirector(String mname) {  //读取电影导演
		DBHelper dbHelper = new DBHelper();
		String sql = "select director from movie where mname=?;";
		List<Map<String, String>> list = dbHelper.find(sql, mname);
		if (list != null && list.size() > 0) {
			String str = list.get(0).toString();
			str = str.substring(str.indexOf("=") + 1, str.lastIndexOf("}"));
			return str;
		}
		return null;
	}

	public String MovieTime(String mname) {  //读取电影导演
		DBHelper dbHelper = new DBHelper();
		String sql = "select time from movie where mname=?;";
		List<Map<String, String>> list = dbHelper.find(sql, mname);
		if (list != null && list.size() > 0) {
			String str = list.get(0).toString();
			str = str.substring(str.indexOf("=") + 1, str.lastIndexOf("}"));
			return str;
		}
		return null;
	}

	//订单信息存储
	public int OrderUpdate(String cname, String mname, int price, String seatlocation, int count) {
		DBHelper dbHelper = new DBHelper();
		String sql = "INSERT INTO myfilm (cname,mname,price,seatlocation,hall,count) VALUES (?,?,?,?,01,?);";
		int result = dbHelper.update(sql, cname, mname, price, seatlocation, count);
		if (result != -1) {
			return result;
		}
		return -1;
	}

	//订单信息输出
	public static List<MyFilmList> OrderOut(String cname) throws Exception {
		DBHelper dbHelper = new DBHelper();
		PreparedStatement pstmt = null;
		Connection conn = null;
		List<MyFilmList> myFilmlist = new ArrayList<MyFilmList>();
		String sql = "select * from myfilm where cname = ?";
		try {
			conn = dbHelper.getConnection();
			pstmt = conn.prepareStatement(sql);
			dbHelper.setValues(pstmt, cname);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {	//获取指定列表数据
				String cnamme = rs.getString("cname");
				String mname = rs.getString("mname");
				System.out.println("测试点1:"+mname);

				int price = rs.getInt("price");
				String seatlocation = rs.getString("seatlocation");
				String hall = rs.getString("hall");
				String date =rs.getString("date");
				int count = rs.getInt("count");
				MyFilmList myFilm = new MyFilmList(mname, price, seatlocation, hall, date, count);
				myFilmlist.add(myFilm);
				InitInfo.moviename=mname;
				//System.out.println("测试点2:"+InitInfo.moviename);
				InitInfo.price=String.valueOf(price);
				InitInfo.seatlocation=seatlocation;
				InitInfo.date=date;
				InitInfo.hall=hall;
				InitInfo.count=String.valueOf(count);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbHelper.closeAll(null, pstmt, conn);
		}
		return myFilmlist;
	}

	/*public String[] OrderDisplay(String cname) {
		AdminDao adminDao = new AdminDao();
		String[] strarray = new String[0];
		try {
			List<MyFilmList> list = adminDao.OrderOut(cname);
			for (int i = 0; i < list.size(); i++) {

				String str = list.get(i).toString();
				str = str.substring(str.indexOf("mn"), str.lastIndexOf("}"));
				strarray = str.split(",", 7);
				String string = Arrays.toString(strarray);
				System.out.println(string);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strarray;
	}*/

}

