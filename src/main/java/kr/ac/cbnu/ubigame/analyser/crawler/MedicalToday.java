package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class MedicalToday extends AbsCrawler {

	public MedicalToday(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "메디컬투데이";
	}
	
	public MedicalToday(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "메디컬투데이";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=fade_ad_postion]");
		this.arrayBody.add(" div[id=CmAdContent]");
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
