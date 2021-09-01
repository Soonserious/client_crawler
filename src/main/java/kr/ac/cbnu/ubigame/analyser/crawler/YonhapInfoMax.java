package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class YonhapInfoMax extends AbsCrawler {

	public YonhapInfoMax(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "연합인포맥스";
	}
	
	public YonhapInfoMax(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "연합인포맥스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=View_Title]");
		this.arrayTitle.add(" div[class=article_info]");
		this.arrayTitle.add(" div[class=article_header]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
