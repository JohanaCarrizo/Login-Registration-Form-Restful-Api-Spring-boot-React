package com.security.backend.domain.service;

import com.security.backend.domain.dto.request.NewUserDto;
import com.security.backend.domain.dto.response.JwtResponseDto;
import com.security.backend.domain.mapper.IUserMapper;
import com.security.backend.domain.useCase.IAuthService;
import com.security.backend.persistance.entity.UserEntity;
import com.security.backend.persistance.repository.IUserRepository;
import com.security.backend.security.JwtAuthenticationProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthService implements IAuthService {

    private final IUserRepository userRepository;
    private final IUserMapper userMapper;
    private final JwtAuthenticationProvider jwtAuthenticationProvider;
    @Override
    public JwtResponseDto register(NewUserDto newUserDto) {

        UserEntity user = userMapper.toEntity(newUserDto);

        userRepository.save(user);

        String token = jwtAuthenticationProvider.generateToken(user);

        return JwtResponseDto.builder()
                .token(token)
                .build();

    }
}
