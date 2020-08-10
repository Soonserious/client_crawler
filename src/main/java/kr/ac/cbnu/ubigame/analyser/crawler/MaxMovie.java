package kr.ac.cbnu.ubigame.analyser.crawler;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

import kr.ac.cbnu.ubigame.analyser.common.crawler.AbsCrawler;

public class MaxMovie extends AbsCrawler {

	public MaxMovie(String targetURL) throws IOException {
		super(targetURL);
		// TODO Auto-generated constructor stub
		this.journal = "맥스무비";
	}
	
	public MaxMovie(String url, String searchword, Date finalDate) throws IOException {
		// TODO Auto-generated constructor stub
		super(url,searchword,finalDate);
		this.journal = "맥스무비";
	}

	@Override
	protected void initArrayBody() {
		this.arrayBody.add("html");

	}

	@Override
	protected void initArrayTitle() {
		this.arrayTitle.add(" header[class=entry-header]");
		this.arrayTitle.add(" div[class=in]");
		this.arrayTitle.add(" h3[class=comments-title]");
		this.arrayTitle.add(" div[id=comments]");
		this.arrayTitle.add("title");
	}

	@Override
	public Date timeAdjust() throws ParseException {
		// TODO Auto-generated method stub
		return null;
	}

}
