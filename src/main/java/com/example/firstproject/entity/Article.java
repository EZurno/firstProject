package com.example.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Article {

    @Id // 대푯값을 지정 like a 주민등록번호
    @GeneratedValue // 차츰 올라가는 자동생성 이노테이션 1,2,3,..
    private Long id;

    @Column // 값을 저장할때 column 값으로 엑셀에 저장
    private String title;

    @Column
    private String content;

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
