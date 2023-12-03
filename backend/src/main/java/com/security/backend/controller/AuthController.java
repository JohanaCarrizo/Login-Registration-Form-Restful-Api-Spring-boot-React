package com.security.backend.controller;

import com.security.backend.constans.UserConstants;
import com.security.backend.domain.dto.request.NewUserDto;
import com.security.backend.domain.dto.response.JwtResponseDto;
import com.security.backend.domain.useCase.IAuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador para la gestión de autenticación y autorización de usuarios.
 */
@RestController
@RequestMapping(value = UserConstants.BASE_URI)
@RequiredArgsConstructor
public class AuthController {

    private final IAuthService authService;

    @PostMapping(value = "register")
    @ResponseStatus(HttpStatus.CREATED)
    public JwtResponseDto register(@Valid @RequestBody NewUserDto newUserDto){
        return authService.register(newUserDto);
    }
}
