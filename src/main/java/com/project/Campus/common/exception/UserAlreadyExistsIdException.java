package com.project.Campus.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class UserAlreadyExistsIdException extends RuntimeException{

    public UserAlreadyExistsIdException() {
        super("이미 존재하는 아이디 입니다");
    }

}
