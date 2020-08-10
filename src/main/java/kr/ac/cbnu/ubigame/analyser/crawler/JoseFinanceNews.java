package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class JoseFinanceNews extends AbsCrawler {

	public JoseFinanceNews(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "조세금융신문";
	}
	
	public JoseFinanceNews(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "조세금융신문";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add(" div[id=news_body_area]");
		this.arrayBody.add(" div[class=cnt_view news_body_area]");
		this.arrayBody.add("html");


	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" div[class=art_top]");
		this.arrayTitle.add(" div[class=arv_001]");
		this.arrayTitle.add(" ul[class=art_list]");
		this.arrayTitle.add("title");


	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
