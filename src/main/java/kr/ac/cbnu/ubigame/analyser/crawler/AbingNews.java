package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class AbingNews extends AbsCrawler {

	public AbingNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "에이빙뉴스";
	}
	
	public AbingNews(String url, String searchword, Date finalDate) throws IOException {
		super(url,searchword,finalDate);
		// TODO Auto-generated constructor stub
		this.journal = "에이빙뉴스";
	}


	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=content]");
		this.arrayBody.add(" div[class=exhibition]");
		this.arrayBody.add(" div[id=news_view]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[id=contents_sub_ll_box]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
