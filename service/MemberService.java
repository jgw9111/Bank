package service;
import domain.MemberBean;

/**
 * @author Jeong jiwoo
 * @date 2018. 12. 26.
 * @desc 멤버기능구현

 *  
 */
public interface MemberService {
	
	//c
	public void join(String id,String name,String ssn,String pass);
	
	//r
	public MemberBean[] findByAll();
	public MemberBean[] findByName(String name);
	public MemberBean findById(String id);
	public int countMember();
	public boolean existMember(String id, String pass);
	
	//u
	public void updatePassword(String id, String pass, String changepass);
	
	//d
	public void deleteMember(String id, String pass, String ssn);
}
