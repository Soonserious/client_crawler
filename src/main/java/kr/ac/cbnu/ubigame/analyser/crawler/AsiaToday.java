package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class AsiaToday extends AbsCrawler {

	public AsiaToday(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "아시아투데이";
	}

	public AsiaToday(String url, String searchword, Date finalDate) throws IOException {
		super(url,searchword,finalDate);
		// TODO Auto-generated constructor stub
		this.journal = "아시아투데이";
	}
	
	@Override
	protected void initArrayBody() {
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=news_content]");
		this.arrayTitle.add(" div[class=view_con_box01]");
		this.arrayTitle.add("title");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
