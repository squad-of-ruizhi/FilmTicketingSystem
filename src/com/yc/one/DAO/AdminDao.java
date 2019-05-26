package com.yc.one.DAO;


import java.util.List;
import java.util.Map;

public class AdminDao {
	public Map<String, String> Login(String account, String pwd) {
		DBHelper db = new DBHelper();
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

	//匹配用户名和安全问题
	public Map<String, String> Check(String account, String answer) {
		DBHelper db = new DBHelper();
		String sql = "select cname,answer from costumer where cname=? and answer =?";
		List<Map<String, String>> list = db.find(sql, account, answer);
		if (list != null) {
			return list.get(0);
		}
		return null;
	}
}

