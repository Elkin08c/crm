package com.example.crm.controller

import com.example.crm.dto.LeadDto
import com.example.crm.entity.Lead
import com.example.crm.services.LeadService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/lead")
class LeadController {

    @Autowired
    lateinit var leadService: LeadService

    @GetMapping
    fun getLeads() = leadService.getLeads()

    @PostMapping
    fun save(@RequestBody leadDto: LeadDto): Lead {
        return leadService.save(leadDto)
    }
}
