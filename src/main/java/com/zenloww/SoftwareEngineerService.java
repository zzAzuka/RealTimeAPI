package com.zenloww;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineer() {
        return softwareEngineerRepository.findAll();
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalStateException("ID: " + id.toString() + " not found!"));
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerRepository.save(softwareEngineer);
    }

    public void deleteSoftwareEngineer(Integer id) {
        softwareEngineerRepository.deleteById(id);
    }

    public void updateSoftwareEngineer(Integer id, SoftwareEngineer updatedSWE) {
        SoftwareEngineer updateSWE = softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalStateException("ID: " + id.toString() + " not found!"));
        updateSWE.setName(updatedSWE.getName());
        updateSWE.setTechStack((updatedSWE.getTechStack()));
        softwareEngineerRepository.save(updateSWE);
    }
}
