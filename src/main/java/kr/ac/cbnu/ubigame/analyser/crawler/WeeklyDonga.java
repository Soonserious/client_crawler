package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class WeeklyDonga extends AbsCrawler {

	public WeeklyDonga(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "주간동아";
	}
	
	public WeeklyDonga (String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "주간동아";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=view]");
		this.arrayBody.add(" div[id=left_view]");
		this.arrayBody.add(" div[class=text]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
