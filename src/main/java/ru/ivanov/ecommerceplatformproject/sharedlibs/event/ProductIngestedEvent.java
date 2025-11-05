package ru.ivanov.ecommerceplatformproject.sharedlibs.event;

import ru.ivanov.ecommerceplatformproject.sharedlibs.enums.ProductCategory;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.UUID;

public record ProductIngestedEvent(
        UUID productId,
        UUID sellerId,
        String name,
        String brand,
        String description,
        ProductCategory category,
        BigDecimal price,
        String mainImageUrl,
        List<String> additionalImageUrls,
        Instant occurredAt
) {
}
