package com.security.backend.domain.dto.response;

import lombok.Builder;

@Builder
public record JwtResponseDto(
        String token
) {
}
