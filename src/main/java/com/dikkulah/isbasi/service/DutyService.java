package com.dikkulah.isbasi.service;

import com.dikkulah.isbasi.model.Duty;
import com.dikkulah.isbasi.repository.DutyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DutyService {

    @Autowired
    private DutyRepository dutyRepository;

    public Duty createDuty(Duty request) {
        return dutyRepository.save(request);
    }

    public List<Duty> getAllDuties() {
        return dutyRepository.findAll();
    }

    public Duty getDutyById(Long id) {
        return dutyRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Duty updateDuty(Long id, Duty request) {
        return dutyRepository.updateById(id,request);
    }

    public Boolean deleteDutyById(Long id) {
        return dutyRepository.deleteById(id);
    }

    public List<Duty> getDutyByIsActive(Boolean isActive) {
        return dutyRepository.findDutiesByIsActive(isActive);
    }
}
