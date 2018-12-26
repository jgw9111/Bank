package domain;

public class MemberBean {
	private String id, name,ssn,pass;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return pass;
	}
	@Override
	public String toString() {
		return String.format("[회원정보] \n"
				+ "I D : %s \n"
				+ "이 름 : %s \n"
				+ "주민 번호 : %s \n"
				+ "비밀 번호 : %s",id,name,ssn,pass);
	}
}
