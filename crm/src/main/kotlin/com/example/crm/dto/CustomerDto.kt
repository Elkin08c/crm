package com.example.crm.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull


class CustomerDto {

    @NotNull(message = "Full name is required")
    @NotBlank(message = "Name is required")
        var fullName: String? = null


    @NotNull(message = "Email is required")
    @NotNull(message = "email is required")
        var email: String? = null

}