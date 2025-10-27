package ru.ivanov.ecommerceplatformproject.sharedlibs.dto.request;

public record SellerRegistrationRequest(
    String email,
    String password
) {
}