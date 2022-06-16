package com.shop.admin.service.Impl;



import java.sql.SQLException;

import com.shop.admin.dao.AdminDao;
import com.shop.admin.dao.daoImpl.AdminDaoImpl;
import com.shop.admin.entity.Admin;
import com.shop.admin.service.AdminService;


public class AdminServiceImpl implements AdminService {
	private AdminDao adminDao = new AdminDaoImpl();
	public Admin login(Admin admin) {
		try {
			return adminDao.find(admin.getAdminname(), admin.getAdminpwd());
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
