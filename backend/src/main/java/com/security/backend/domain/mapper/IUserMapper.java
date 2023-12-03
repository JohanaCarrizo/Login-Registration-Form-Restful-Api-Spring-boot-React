package com.security.backend.domain.mapper;

import com.security.backend.domain.dto.request.NewUserDto;
import com.security.backend.persistance.entity.UserEntity;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public interface IUserMapper {

    UserEntity toEntity(@NotNull NewUserDto userDto);
    NewUserDto toDto(@NotNull UserEntity userEntity);
}
