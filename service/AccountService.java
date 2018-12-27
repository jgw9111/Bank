package service;

import java.util.ArrayList;

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
	public String createAccountNum(); // 계좌번호 생성
	// r
	public ArrayList<AccountBean> findByAll();
	public AccountBean findByAccountNum(String accountNum);
	public int countAccountNum();
	public boolean existAccountNum(String accountNum);
	public String findDate(); // 날짜반환
	// u
	public String deposit(String accountNum,int money);
	public String withdraw(String accountNum,int money);
	// d
	public void deleteAccountNum(String accountNum);
	//--------------------------------------------------------------------- ^필수
}
