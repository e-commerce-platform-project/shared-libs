package ru.ivanov.ecommerceplatformproject.sharedlibs.dto;

import java.util.List;
import java.util.UUID;

public interface BaseDto {
    UUID id();
    String email();
    List<String> roles();
}