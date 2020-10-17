package com.sbs.example.lolHi.controller.usr;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sbs.example.lolHi.dto.Article;

@Controller
public class ArticleController {
	@RequestMapping("/usr/article/list")
	public String showList() {
		List<Article> articles = new ArrayList<>();
		articles.add(new Article(1, "2020-09-26 17:40:00", "2020-09-26 17:40:01", "제목1", "내용1"));
		articles.add(new Article(2, "2020-09-26 17:40:00", "2020-09-26 17:40:01", "제목2", "내용2"));
		
		return "usr/article/list";
	}
}