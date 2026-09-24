package com.irusol.docpilot.dto;

public record RegisterUserRequest(
        String username,
        String email,
        String password
) {
}
