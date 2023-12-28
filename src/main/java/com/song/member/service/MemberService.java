package com.song.member.service;

import com.song.member.dto.MemberDTO;
import com.song.member.entity.MemberEntity;
import com.song.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        //1. dto -> entity 변환
        //2. repository의 save 메서드 호출
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);

    }
}
