package service;

import java.util.ArrayList;

import domain.ArticleBean;

public interface ArticleService {
	//c
	public void createTitle(String title, String contents,String writer,String conpass);
	//r
	public ArrayList<ArticleBean> list();
	public ArrayList<ArticleBean> findTitle(String writer);
	public ArticleBean findBySeq(int seq);
	public String date();
	public int countTitle();
	public boolean existTitle(String title);
	//u
	public void updateContents(String title,String contents, String writer,String conpass, String newContents);
	//d
	public void deleteContents(String title,String writer,String conpass);
}
