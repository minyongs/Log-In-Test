package com.song.member.controller;

import com.song.member.dto.MemberDTO;
import com.song.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    //회원가입 페이지 출력 요청
    @GetMapping("/member/save")
    public String saverForm() {
        return "save";
    }

    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("MemberController.save");
        System.out.println("memeber DTO = " + memberDTO);
        memberService.save(memberDTO);
        return "index";
    }


}
