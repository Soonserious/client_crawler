package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class KNSNewsCommunication extends AbsCrawler {

	public KNSNewsCommunication(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "KNS뉴스통신";
	}

	public KNSNewsCommunication(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal ="KNS뉴스통신";
	}

	@Override
	protected void initArrayBody() {
		// TODO Auto-generated method stub
		this.arrayBody.add("div[id=articleBody]");

	}

	@Override
	protected void initArrayTitle() {
		// TODO Auto-generated method stub
		this.arrayTitle.add("title");

	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}


}
