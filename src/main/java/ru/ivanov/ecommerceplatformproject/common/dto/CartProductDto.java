package ru.ivanov.ecommerceplatformproject.common.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record CartProductDto(
        UUID id,
        String name,
        BigDecimal price,
        int availableQuantity,
        String mainImageURL
) {
}