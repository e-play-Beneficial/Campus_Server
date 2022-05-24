package com.project.Campus.domain.dto.user;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class UserJoinDto {

    private String id;
    private String pw;
    private String name;
    private int phone;


}
