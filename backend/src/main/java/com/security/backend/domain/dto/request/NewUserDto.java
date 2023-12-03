package com.security.backend.domain.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record NewUserDto(
        @NotBlank(message = "Name can't be null or empty")
        String name,
        @NotBlank(message = "Email can't be null or empty")
        @Email
        String email,
        @NotBlank(message = "Password can't be null or empty")
        String password
) {
}
