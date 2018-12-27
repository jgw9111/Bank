package controller;

import javax.swing.JOptionPane;

import domain.AccountBean;
import domain.MemberBean;
import service.AccountService;
import service.AccountServiceImpl;
import service.MemberService;
import service.MemberServiceImpl;

public class BankController {
	public void start() {
		MemberBean member = null;
		AccountBean account = null;
		MemberService memberService = new MemberServiceImpl();
		AccountService accountService = new AccountServiceImpl();
		
		while(true) {
		switch(JOptionPane.showInputDialog("[메뉴] \n 0.종료 \n 1.회원가입 \n 2.로그인 \n 3.회원정보 보기\n 4.회원목록 보기 \n 5. 비밀번호 변경 \n 6.회원 탈퇴 \n 7.가입자 수 \n"
				+ "8.계좌 생성 \n 9.계좌 목록 \n 10.계좌번호로 계좌 찾기 \n 11.계좌 개수 \n 12.계좌 유무 조회 \n 13. 입금 \n 14.출금 \n 15.계좌 삭제")) {
		
		case"0":
			JOptionPane.showMessageDialog(null,"시스템 종료..");
			return;
		
		case"1":
			String id = JOptionPane.showInputDialog("ID 입력");
			String name = JOptionPane.showInputDialog("이름 입력");
			String ssn = JOptionPane.showInputDialog("주민번호 입력");
			String pass = JOptionPane.showInputDialog("비밀번호 입력");
			memberService.join(id, name, ssn, pass);
			JOptionPane.showMessageDialog(null,"회원가입 완료." );
			break;
			
		case"2":
			id = JOptionPane.showInputDialog("id 입력");
			pass = JOptionPane.showInputDialog("pw 입력");
			if(memberService.existMember(id, pass)) {
				JOptionPane.showMessageDialog(null, "로그인 성공");
			}else {
				JOptionPane.showMessageDialog(null, "로그인 실패");
			}
			break;
			
		case"3":
			id = JOptionPane.showInputDialog("ID 입력");
			JOptionPane.showMessageDialog(null,memberService.findById(id));
			break;
			
		case"4":
			JOptionPane.showMessageDialog(null,memberService.findByAll());
			break;
			
		case"5":
			id = JOptionPane.showInputDialog("id 입력");
			pass = JOptionPane.showInputDialog("pw 입력");
			String changepass = JOptionPane.showInputDialog("바꿀 비밀번호 입력");
			memberService.updatePassword(id, pass, changepass);
			JOptionPane.showMessageDialog(null, "비밀번호가 변경되었습니다");
			break;
			
		case"6":
			id = JOptionPane.showInputDialog("id 입력");
			pass = JOptionPane.showInputDialog("pw 입력");
			ssn = JOptionPane.showInputDialog("주민번호 입력");
			memberService.deleteMember(id, pass, ssn);
			JOptionPane.showMessageDialog(null, "탈퇴 완료.");
			
			break;
		case"7":
			JOptionPane.showMessageDialog(null,memberService.countMember());
			break;
			
		case"8":
			accountService.createAccount(0);
			JOptionPane.showMessageDialog(null,"계좌 생성 완료");
			break;
		case"9":
			JOptionPane.showMessageDialog(null, accountService.findByAll());
			break;
		case"10":
			String accountNum = JOptionPane.showInputDialog("계좌 입력");
			accountService.findByAccountNum(accountNum);
			break;
		case"11":
			JOptionPane.showMessageDialog(null,accountService.countAccountNum());
			break;
		case"12":
			accountNum = JOptionPane.showInputDialog("계좌 입력");
			if(accountService.existAccountNum(accountNum)) {
				JOptionPane.showMessageDialog(null, "계좌 있음");
			}else {
				JOptionPane.showMessageDialog(null, "계좌 없음");
			}
			break;
		case"13":
			accountNum = JOptionPane.showInputDialog("계좌 입력");
			int money = Integer.parseInt(JOptionPane.showInputDialog("입금액?"));
			accountService.deposit(accountNum, money);
			break;
		case"14":
			accountNum = JOptionPane.showInputDialog("계좌 입력");
			money = Integer.parseInt(JOptionPane.showInputDialog("출금액?"));
			accountService.withdraw(accountNum, money);
			break;
		case"15":
			accountNum = JOptionPane.showInputDialog("계좌 입력");
			accountService.deleteAccountNum(accountNum);
//			JOptionPane.showMessageDialog(null,"계좌 삭제");
			break;
			
	
			}
		}
	}
}
