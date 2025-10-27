package ru.ivanov.ecommerceplatformproject.sharedlibs.dto;

import java.util.List;
import java.util.UUID;

public record SellerDto(
        UUID id,
        String email,
        List<String> roles
) implements BaseDto {
}