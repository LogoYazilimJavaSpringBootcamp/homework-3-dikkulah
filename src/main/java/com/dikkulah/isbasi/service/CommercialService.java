package com.dikkulah.isbasi.service;

import com.dikkulah.isbasi.model.Commercial;
import com.dikkulah.isbasi.repository.CommercialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommercialService {
    @Autowired
    private CommercialRepository commercialRepository;

    public Commercial createCommercial(Commercial request) {
        return commercialRepository.save(request);
    }

    public List<Commercial> getAllCommercials() {
        return commercialRepository.findAll();
    }

    public Commercial getCommercialById(Long id) {
        return commercialRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Boolean deleteCommercialById(Long id) {
        return commercialRepository.deleteById(id);
    }

    public Commercial updateCommercial(Long id, Commercial request) {
        return commercialRepository.updateCommercial(id,request);
    }

    public List<Commercial> getCommercialByIsActive(Boolean isActive) {
        return commercialRepository.findCommercialByIsActive(isActive);
    }
}
