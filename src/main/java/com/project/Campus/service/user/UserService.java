package com.project.Campus.service.user;

import com.project.Campus.domain.dto.user.UserDeleteDto;
import com.project.Campus.domain.dto.user.UserJoinDto;
import com.project.Campus.domain.dto.user.UserLoginDto;
import com.project.Campus.domain.entity.User;

public interface UserService {

    User userJoin(UserJoinDto userJoinDto);

    User userLogin(UserLoginDto userLoginDto);

    void userDelete(UserDeleteDto userDeleteDto);

}
