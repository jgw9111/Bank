package service;

import java.util.ArrayList;
import java.util.HashMap;

import domain.AdminBean;

public class AdminServiceImpl implements AdminService {
	private HashMap<String, AdminBean> map;
	private int adminSeq;

	public AdminServiceImpl() {
		map = new HashMap<>();
		adminSeq = 1000; // 사원 번호
	}

	@Override
	public void createAdmin(String name, String pass, String auth) {
		AdminBean admin = new AdminBean();
		admin.setAdminNum(String.valueOf(adminSeq));
		admin.setAuth("staff"); // 사원.. default
		admin.setName(name);
		admin.setPass(pass);
		map.put(admin.getAdminNum(), admin);
		adminSeq++;
	}

	@Override
	public ArrayList<AdminBean> list() {
//		ArrayList<AdminBean> c  = (ArrayList<AdminBean>) map.values();
		return (ArrayList<AdminBean>) map.values();
	}

	@Override
	public ArrayList<AdminBean> findByAuth(String auth) {
		// 보류
		return null;
	}

	@Override
	public AdminBean findById(String adminNum) {
		return map.get(adminNum);
	}
	
	@Override
	public int countAdmin() {
		return map.size();
	}

	@Override
	public boolean existAdminNum(String adminNum, String pass) {
		boolean exist = false;
		if (map.containsKey(adminNum)) {
			map.get(adminNum).getPass().equals(pass);
			exist = true;
		}
		return exist;
	}

	@Override
	public void updatePass(String adminNum, String pass, String newpass) {
		if (map.get(adminNum).getPass().equals(pass)) {
			map.get(adminNum).setPass(newpass);
		}
	}

	@Override
	public void updateAuth(String adminNum, String newpass) {

	}

	@Override
	public void deleteAdmin(String adminNum) {
		map.remove(adminNum);
	}

}
