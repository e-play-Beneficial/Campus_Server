package com.project.Campus.domain.dto.user;

import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class UserLoginDto {

    private String id;
    private String pw;

}
