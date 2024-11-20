package com.example.crm.dto

import jakarta.validation.constraints.NotBlank

class ActivityDto {
    @NotBlank(message = "Activity type is required")
    var activityType: String? = null

    var description: String? = null
}
