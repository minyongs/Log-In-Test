package com.song.member.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    //기본페이지 요청 메서드
    @GetMapping("/")
    public String index(){
        return "index";//=> templates 폴더의 index.html 찾아감
    }
}
