package com.example.jsoup2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class BookerDto {
    private String book_name; // 책이름
    private String img_url; // 이미지url
    private String author; // 저자
    private String publisher; // 출판사
    private String introduction; // 한줄 소개
    private String star; // 별점
    private String pub_date; // 출판일
    private String category; // 카테고리
}
