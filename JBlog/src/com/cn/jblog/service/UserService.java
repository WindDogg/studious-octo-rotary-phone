package com.cn.jblog.service;

import com.cn.jblog.model.User;
import com.jfinal.aop.Before;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.plugin.activerecord.tx.Tx;
import com.jfinal.plugin.activerecord.tx.TxConfig;

public class UserService {

	Record rd = new Record();
	private User dao = new User().dao();
	
	@Before(Tx.class)
	public User getUser (String user_Id){
		User user = dao.findById(user_Id);
		return user;
	}
	
	@TxConfig("otherConfigName")
	@Before(Tx.class)
	public boolean saveUser(User user){
		return user.save();
	}
	@TxConfig("otherConfigName")
	@Before(Tx.class)
	public boolean updateUser(User user){
		return user.update();
	}
}
