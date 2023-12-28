package com.song.member.entity;

import com.song.member.dto.MemberDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
@Table(name = "member_table")
public class MemberEntity {
    @Id // pk를 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String memeberEmail;

    @Column
    private String memberPassword;

    @Column
    private String memberName;



    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemeberEmail(memberDTO.getMemberEmail());
        memberEntity.setMemberPassword(memberDTO.getMemberPassword());
        memberEntity.setMemberName(memberDTO.getMemberName());
        return memberEntity;
    }
}
