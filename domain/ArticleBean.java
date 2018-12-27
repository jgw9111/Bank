package domain;

public class ArticleBean {
	private int seq; // 글 번호
	private String title,contents,writer,regDate,conpass;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getConpass() {
		return conpass;
	}
	public void setConpass(String conpass) {
		this.conpass = conpass;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String redDate) {
		this.regDate = redDate;
	}
	@Override
	public String toString() {
		return "ArticleBean [seq=" + seq + ", conpass=" + conpass + ", title=" + title + ", contents=" + contents
				+ ", writer=" + writer + ", regDate=" + regDate + "]";
	}
	
}
