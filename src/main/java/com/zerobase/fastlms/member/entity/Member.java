package com.zerobase.fastlms.member.entity;

import com.zerobase.fastlms.member.service.MemberService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Member implements MemberCode {

    @Id
    private String userId;
    private String userName;
    private String phone;
    private String password;
    private LocalDateTime regDt; // 등록일
    private LocalDateTime udtDt; // 회원정보 수정일

    private boolean emailAuthYn; // 메일 인증여부
    private LocalDateTime emailAuthDt; // 메일 인증날짜
    private String emailAuthKey;

    private String resetPasswordKey;
    private LocalDateTime resetPasswordLimitDt;

    private boolean adminYn; //관리자 판단 여부

    private String userStatus;

    private String zipcode;
    private String addr;
    private String addrDetail;

    private LocalDateTime lastLoginDt;
}

