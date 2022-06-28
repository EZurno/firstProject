package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired // 스프링 부트가 미리 생성해놓은 객체를 가져다가 자동연결 원래
    private ArticleRepository articleRepository;// 자바에는 밑에 repositou에 new로 객체를 생성해야되지만 알아서 생성


    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());
        
        // 1 DTO로 변환 @entity();
        Article article = form.toEntity();
        System.out.println(article.toString());// 잘변환 되는지 확인 하기 위해 출력

        //2. Repository에게 Entity를 DB안에 저장하게 함
        Article saved = articleRepository.save(article);
        //ArticleRepository 에 extend로 확장해 save 기능을 사용하게 함.
        System.out.println(saved.toString());
        //save가 잘 작동되는지 확인차 출력


        return "";
    }
}
