package ru.ivanov.ecommerceplatformproject.sharedlibs.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record CartProductDto(
        UUID id,
        String name,
        BigDecimal price,
        String mainImageURL
) {
}