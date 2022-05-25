package com.project.Campus.service.user;

import com.project.Campus.common.exception.UserAlreadyExistsIdException;
import com.project.Campus.domain.dto.user.UserDeleteDto;
import com.project.Campus.domain.dto.user.UserJoinDto;
import com.project.Campus.domain.dto.user.UserLoginDto;
import com.project.Campus.domain.entity.User;
import com.project.Campus.domain.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User userJoin(UserJoinDto userJoinDto) {
        if (userRepository.findById(userJoinDto.getId()).equals(userJoinDto.getId())) {
            throw new UserAlreadyExistsIdException();
        }

        User user = User.builder()
                .id(userJoinDto.getId())
                .pw(userJoinDto.getPw())
                .name(userJoinDto.getName())
                .phone(userJoinDto.getPhone())
                .build();

        userRepository.save(user);

        return user;
    }

    @Override
    public User userLogin(UserLoginDto userLoginDto) {
        return null;
    }

    @Override 
    public void userDelete(UserDeleteDto userDeleteDto) {

    }

}
