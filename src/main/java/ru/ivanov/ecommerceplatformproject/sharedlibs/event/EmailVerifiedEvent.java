package ru.ivanov.ecommerceplatformproject.sharedlibs.event;

public record EmailVerifiedEvent(
    String userId,
    String email
) {
}