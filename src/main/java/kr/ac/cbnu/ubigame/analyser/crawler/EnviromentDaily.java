package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class EnviromentDaily extends AbsCrawler {

	public EnviromentDaily(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "환경일보";

	}
	
	public EnviromentDaily(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "환경일보";
	}

	@Override
	protected void initArrayBody() {
		// TODO Auto-generated method stub
		
		this.arrayBody.add("div[id=articleBody]");
		this.arrayBody.add("div[class=content border-box] >div[id=articleBody]");
		this.arrayBody.add("div[class=content border-box]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add("title");
		this.arrayTitle.add("div[class=aht-title]");
		this.arrayTitle.add("div[class=aht-defalut] > div[class=aht-title] ");
		this.arrayTitle.add("font[class=headline-title]");
		this.arrayTitle.add("div[class=headline border-box] > font[class=headline-title]");

		
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
