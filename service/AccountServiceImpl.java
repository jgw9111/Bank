package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;

/**
 * @author Jeong jiwoo
 * @date 2018. 12. 26.
 * @desc 은행계좌 구현객체
 * 
 */
public class AccountServiceImpl implements AccountService {
	private ArrayList<AccountBean> list;

	public AccountServiceImpl() {
		list = new ArrayList<>();
	}

	@Override
	public void createAccount(int money) {
		AccountBean account = new AccountBean();
		account.setAccountNum(createAccountNum());
		account.setMoney(money);
		account.setToday(findDate());
		list.add(account);
	}

	@Override
	public String createAccountNum() {
		String accountNum = "";
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			if (i != 3) {
				accountNum += random.nextInt(10) + "";
			} else if (i == 3) {
				accountNum += random.nextInt(10) + "-";
			} else if (i == 0) {
				accountNum += random.nextInt(9) + 1;
			}

		}
		return accountNum;
	}

	@Override
	public ArrayList<AccountBean> findByAll() {

		return list;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {
				account = list.get(i);
			}
		}
		return account;
	}

	@Override
	public int countAccountNum() {
		return list.size();
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		boolean ok = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getAccountNum().equals(accountNum)) {
				ok = true;
				break;
			}
		}
		return ok;
	}

	@Override
	public String findDate() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd kk:mm:ss");
		today = sdf.format(date);
		return today;
	}

	@Override
	// 입금하기
	public String deposit(String accountNum,int money) {
		String messege = "";
		int deposit = 0;
		for (int i = 0; i < list.size(); i++) {
			if ( money > 0 && list.get(i).getAccountNum().equals(accountNum)) {
				
				 deposit +=  money;
				
				 list.get(i).setMoney(deposit);
				
				 messege = "입금 완료";
			} else if ( money == 0 ) {
				messege = "!! 입금 실패 : 입금액 확인 !!";
			}
		}

		return messege;
	}

	@Override
	// 출금하기
	public String withdraw(String accountNum,int money) {
		String messege = "";
		int withdraw = 0; 
		for (int i = 0; i < list.size(); i++) {
			if ( money > 0 && list.get(i).getMoney() >= money && list.get(i).getAccountNum().equals(accountNum)) {
				withdraw -= money; 
				list.get(i).setMoney(withdraw);
				messege = "출금 완료";
			} else if ( money == 0 && money > list.get(i).getMoney()) {
				messege = "!! 출금 실패 : 잔고 & 출금액 확인!! ";
			}
		}

		return messege;
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		for(int i = 0 ; i<list.size(); i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				list.remove(i);
			}
		}
	}

}
