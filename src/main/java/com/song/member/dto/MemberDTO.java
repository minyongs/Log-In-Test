package com.song.member.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//lombok 이 자동으로 getter 와 setter 만들어준다
//NoArgs...이건 생성자를 자동으로 만들어줌 !
@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
}
