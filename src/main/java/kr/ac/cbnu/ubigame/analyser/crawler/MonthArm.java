package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class MonthArm extends AbsCrawler {

	public MonthArm(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "월간암";
	}
	
	public MonthArm(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "월간암";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=article_body]");
		this.arrayBody.add("html");
	

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[id=section]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
