package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class JumpBall extends AbsCrawler {

	public JumpBall(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "점프볼";
	}
	
	public JumpBall(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "점프볼";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=content_area]");
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=news_headline]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
