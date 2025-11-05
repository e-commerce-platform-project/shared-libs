package ru.ivanov.ecommerceplatformproject.sharedlibs.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record UserDto(
        UUID id,
        String firstName,
        String lastName,
        String email,
        String phone,
        List<DeliveryAddressDto> deliveryAddresses
) implements Serializable {
}