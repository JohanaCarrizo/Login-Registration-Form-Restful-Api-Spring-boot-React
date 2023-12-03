package com.security.backend.domain.mapper;

import com.security.backend.domain.dto.request.NewUserDto;
import com.security.backend.persistance.entity.UserEntity;
import com.security.backend.security.RolName;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserMapper implements IUserMapper{

    private final PasswordEncoder passwordEncoder;
    @Override
    public UserEntity toEntity(NewUserDto userDto) {
        return UserEntity.builder()
                .name(userDto.name())
                .email(userDto.email())
                .password(passwordEncoder.encode(userDto.password()))
                .role(RolName.ADMIN)
                .build();
    }

    @Override
    public NewUserDto toDto(UserEntity userEntity) {
        return null;
    }
}
