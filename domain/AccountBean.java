package domain;

/**
 * @author Jeong jiwoo
 * @date 2018. 12. 26.
 * @desc 은행계좌 빈객체

 *  */
public class AccountBean {
	private String accountNum, today;
	private int money;
	
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return String.format("[계좌 정보] \n"
				+ "계좌 번호 : %s \n"
				+ "생  성  일 : %s \n"
				+ "현재 잔액 : %s",accountNum,today,money);
	}
	
}
