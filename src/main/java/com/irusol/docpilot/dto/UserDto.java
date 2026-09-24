package com.irusol.docpilot.dto;

import com.irusol.docpilot.entity.Role;

public record UserDto(
        Long id,
        String username,
        String email,
        Role role
) {
}
