package com.zenloww;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return softwareEngineerService.getAllSoftwareEngineer();
    }

    @PostMapping
    public void addEngineers(@RequestBody SoftwareEngineer softwareEngineer){
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
}

