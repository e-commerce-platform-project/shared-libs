package ru.ivanov.ecommerceplatformproject.sharedlibs.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public record SellerProductDto(
        UUID id,
        String name,
        String description,
        String category,
        BigDecimal price,
        int stockQuantity,
        int reservedQuantity,
        String mainImageUrl,
        List<String> additionalImageUrls
        ) {
}