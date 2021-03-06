package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class PolyNews extends AbsCrawler {

	public PolyNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "폴리뉴스";
	}
	
	public PolyNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "폴리뉴스";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[class=body cnt_view]");
		this.arrayBody.add(" div[class=row-highlights col-2]");
		this.arrayBody.add(" div[class=body cnt_view]");
		this.arrayBody.add("html");
	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=article-title]");
		this.arrayTitle.add(" div[class=headline col-1]");
		this.arrayTitle.add(" div[class=section-contents]");
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
