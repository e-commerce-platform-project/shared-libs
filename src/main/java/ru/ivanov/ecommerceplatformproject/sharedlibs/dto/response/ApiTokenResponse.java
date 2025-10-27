package ru.ivanov.ecommerceplatformproject.sharedlibs.dto.response;

import lombok.Builder;

@Builder
public class ApiTokenResponse {
    private final String accessToken;
    private final String refreshToken;
    private final String tokenType = "Bearer";
    private final long expiresIn;

    public ApiTokenResponse(String accessToken, String refreshToken, long expiresIn) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.expiresIn = expiresIn;
    }
}