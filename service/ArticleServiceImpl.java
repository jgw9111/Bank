package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import domain.ArticleBean;

public class ArticleServiceImpl implements ArticleService {
	private HashMap<String, ArticleBean> map;
	private int titleSeq;
	
	public ArticleServiceImpl() {
		map = new HashMap<>();
		titleSeq = 0;
	}
	
	@Override
	public void createTitle(String title, String contents, String writer,String conpass) {
		ArticleBean article = new ArticleBean();
		article.setTitle(title);
		article.setContents(contents);
		article.setWriter(writer);
		article.setConpass(conpass);
		article.setSeq(titleSeq);
		map.put(String.valueOf(article.getSeq()), article);
		titleSeq++;
	}

	@Override
	public ArrayList<ArticleBean> list() {
		
		return null;
	}

	@Override
	public ArrayList<ArticleBean> findTitle(String writer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArticleBean findBySeq(int seq) {
		return map.get(String.valueOf(seq));
	}
	
	@Override
	public String date() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		return sdf.format(date);
	}

	@Override
	public int countTitle() {
		return map.size();
	}

	@Override
	public boolean existTitle(String title) {
		boolean exist = false;
		if(map.containsKey(title) && 
			map.get(title).getTitle().equals(title)){
			exist = true;
		}
		return exist;
	}

	@Override
	public void updateContents(String title, String contents, String writer, String pass, String newContents) {
//		if(map.get(title)) {}
	}

	@Override
	public void deleteContents(String title, String writer, String pass) {
		// TODO Auto-generated method stub
		
	}

	

}
