package ru.ivanov.ecommerceplatformproject.sharedlibs.dto;

import java.util.UUID;

public record DeliveryAddressDto(
        UUID id,
        String city,
        String street,
        String postalCode
) {
}