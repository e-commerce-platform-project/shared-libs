package ru.ivanov.ecommerceplatformproject.common.dto.request;

public record SellerRegistrationRequest(
    String email,
    String password
) {
}