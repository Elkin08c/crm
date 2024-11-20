package com.example.crm.dto

import jakarta.validation.constraints.NotBlank

class LeadDto {
    @NotBlank(message = "Lead status is required")
    var leadStatus: String? = null
}
