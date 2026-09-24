package com.irusol.docpilot.dto;

public record LoginResponse(
        String accessToken,
        UserDto user
) {
}
