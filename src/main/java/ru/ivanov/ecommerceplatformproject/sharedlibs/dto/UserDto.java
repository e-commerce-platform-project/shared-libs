package ru.ivanov.ecommerceplatformproject.sharedlibs.dto;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public record UserDto(
        UUID id,
        String firstName,
        String lastName,
        String email,
        List<String> roles
) implements BaseDto, Serializable {
}