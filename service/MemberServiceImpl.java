package service;

import domain.MemberBean;

public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;
	int count;
	public MemberServiceImpl() {
		members = new MemberBean[10];
		count = 0;
	}
	
	@Override
	public void join(String id, String name, String ssn, String pass) {
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setName(name);
		member.setSsn(ssn);
		member.setPass(pass);
		members[count] = member;
		count++;
	}

	@Override
	public MemberBean[] findByAll() {
		return members;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int j = 0;
		for(int i = 0; i < count ; i++) {
			if(members[i].getName().equals(name)) {
				j++;
			}
		}
		MemberBean[] beans = new MemberBean[j];
		j = 0;
		for(int i = 0; i < count ; i++) {
			if(members[i].getName().equals(name)) {
				beans[j] = members[i];
				j++;
				if(j==beans.length) {
					break;
				}
			}
		}
		return members;
	}

	@Override
	//find id 
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for(int i=0;i<count;i++) {
		if(members[i].getId().equals(id)) {
			member = members[i];
			break;
			}
		}
		return member;
	}

	@Override 
	//login
	public boolean existMember(String id, String pass) {
		boolean ok = false;
		for(int i=0;i<count;i++) {
		if(members[i].getId().equals(id) && members[i].getPass().equals(pass) ) {
			ok = true;
			break;
			}
		}
		return ok;
		
	}

	@Override
	public int countMember() {
		return count;
	}

	@Override
	public void updatePassword(String id, String pass, String changepass) {
		for(int i=0;i<count;i++) {
			if(existMember(id, pass)) {
				members[i].setPass(changepass);
			}
		}
	}

	@Override
	public void deleteMember(String id, String pass, String ssn) {
		for(int i=0;i<count;i++) {
			if(existMember(id, pass) && members[i].getSsn().equals(ssn)) {
				members[i] = members[count-1];
				members[count-1] = null;
				count --;
				break;
			}
		}
	}

}
