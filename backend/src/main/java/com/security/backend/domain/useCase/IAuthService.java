package com.security.backend.domain.useCase;

import com.security.backend.domain.dto.request.NewUserDto;
import com.security.backend.domain.dto.response.JwtResponseDto;

public interface IAuthService {

    JwtResponseDto register(NewUserDto newUserDto);
}
