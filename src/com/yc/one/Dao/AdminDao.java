package com.yc.one.Dao;


import java.util.List;
import java.util.Map;
import com.yc.one.Dao.DBHelper;
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
	*匹配用户名和安全问题
	 */
	public Map<String, String> Check(String account, String answer) {
		DBHelper db = new DBHelper();
		String sql = "select cname,answer from costumer where cname=? and answer =?";
		List<Map<String, String>> list = db.find(sql, account, answer);
		if (list != null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	//重置密码
	public int Repwd(String account,String newpwd){
		DBHelper dbHelper=new DBHelper();
		String sql="UPDATE `FilmTicketingSystem`.`costumer` SET `pwd` = ? WHERE (`cname` = ?);";
		int result = dbHelper.update(sql, newpwd, account);
		if (result != -1) {
			return result;
		}
		return -1;
	}

	//读取电影信息
	public String MovieImage(String mname){  //读取海报图片
		DBHelper dbHelper=new DBHelper();
		String sql="select imagesource from movie where mname=?;";
		List<Map<String, String>> list = dbHelper.find(sql,mname);
		if (list != null && list.size()>0) {
			String str=list.get(0).toString();
			str=str.substring(str.indexOf("=")+1,str.lastIndexOf("}"));
			return str;
		}
		return null;
	}

	public String Money(String mname){  //读取用户余额
		DBHelper dbHelper=new DBHelper();
		String sql="select money from costumer where cname=?;";
		List<Map<String, String>> list = dbHelper.find(sql,mname);
		if (list != null && list.size()>0) {
			String str=list.get(0).toString();
			str=str.substring(str.indexOf("=")+1,str.lastIndexOf("}"));
			return str;
		}
		return null;
	}

	public String Direction(String mname){  //读取影片地区
		DBHelper dbHelper=new DBHelper();
		String sql="select direction from movie where mname=?;";
		List<Map<String, String>> list = dbHelper.find(sql,mname);
		if (list != null && list.size()>0) {
			String str=list.get(0).toString();
			str=str.substring(str.indexOf("=")+1,str.lastIndexOf("}"));
			return str;
		}
		return null;
	}

	public String MovieKind(String mname){  //读取电影类型
		DBHelper dbHelper=new DBHelper();
		String sql="select kind from movie where mname=?;";
		List<Map<String, String>> list = dbHelper.find(sql,mname);
		if (list != null && list.size()>0) {
			String str=list.get(0).toString();
			str=str.substring(str.indexOf("=")+1,str.lastIndexOf("}"));
			return str;
		}
		return null;
	}

	public String MovieActor(String mname){  //读取电影主演
		DBHelper dbHelper=new DBHelper();
		String sql="select actor from movie where mname=?;";
		List<Map<String, String>> list = dbHelper.find(sql,mname);
		if (list != null && list.size()>0) {
			String str=list.get(0).toString();
			str=str.substring(str.indexOf("=")+1,str.lastIndexOf("}"));
			return str;
		}
		return null;
	}

	public String MovieDirector(String mname){  //读取电影导演
		DBHelper dbHelper=new DBHelper();
		String sql="select director from movie where mname=?;";
		List<Map<String, String>> list = dbHelper.find(sql,mname);
		if (list != null && list.size()>0) {
			String str=list.get(0).toString();
			str=str.substring(str.indexOf("=")+1,str.lastIndexOf("}"));
			return str;
		}
		return null;
	}

	public String MovieTime(String mname){  //读取电影导演
		DBHelper dbHelper=new DBHelper();
		String sql="select time from movie where mname=?;";
		List<Map<String, String>> list = dbHelper.find(sql,mname);
		if (list != null && list.size()>0) {
			String str=list.get(0).toString();
			str=str.substring(str.indexOf("=")+1,str.lastIndexOf("}"));
			return str;
		}
		return null;
	}
}

