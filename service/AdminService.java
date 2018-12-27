package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {
	//c
	public void createAdmin(String name,String pass,String auth);
	//r
	public ArrayList<AdminBean> list();
	public ArrayList<AdminBean> findByAuth(String auth);
	public AdminBean findById(String adminNum);
	public int countAdmin();
	public boolean existAdminNum(String adminNum,String pass);
	//u
	public void updatePass(String adminNum,String pass,String newpass);
	public void updateAuth(String adminNum,String newpass);
	//d
	public void deleteAdmin(String adminNum);
}
