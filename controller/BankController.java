package controller;

import javax.swing.JOptionPane;

import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

public class BankController {
	public void start() {
		MemberBean member = null;
		MemberService memberService = new MemberServiceImpl();
		
		while(true) {
		switch(JOptionPane.showInputDialog("[메뉴] \n 0.종료 \n 1.회원가입 \n 2.로그인 \n 3.회원정보 보기\n 4.회원목록 보기 \n 5. 비밀번호 변경 \n 6.회원 탈퇴 \n 7.가입자 수")) {
		
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
			
			}
		}
	}
}
