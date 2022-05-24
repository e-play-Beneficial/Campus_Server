package com.project.Campus.domain.dto.user;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class UserDeleteDto {

    @NotNull(message = "비밀번호를 입력하세요")
    private String pw;

}
