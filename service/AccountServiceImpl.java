package service;

import domain.AccountBean;

/**
 * @author Jeong jiwoo
 * @date 2018. 12. 26.
 * @desc 은행계좌 구현객체

 *  */
public class AccountServiceImpl implements AccountService{

	@Override
	public void createAccount(int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AccountBean[] findByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccountNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deposit(int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String id, String pass, String ssn) {
		// TODO Auto-generated method stub
		
	}

}
