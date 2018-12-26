package service;

import domain.AccountBean;

/**
 * @author Jeong jiwoo
 * @date 2018. 12. 26.
 * @desc 은행계좌 서비스
 * 
 */
public interface AccountService {

	// c
	public void createAccount(int money);
	// r
	public AccountBean[] findByAll();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccountNum();
	public boolean existAccountNum(String accountNum);

	// u
	public void deposit(int money);
	public void withdraw(int money);
	// d
	public void deleteAccountNum(String id, String pass, String ssn);
}
