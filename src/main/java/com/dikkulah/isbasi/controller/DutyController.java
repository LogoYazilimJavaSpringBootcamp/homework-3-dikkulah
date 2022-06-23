package com.dikkulah.isbasi.controller;

import com.dikkulah.isbasi.model.Duty;
import com.dikkulah.isbasi.service.DutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/duty")
public class DutyController {
    @Autowired
    private DutyService dutyService;

    // Duty kayıt etme
    @PostMapping
    public Duty createDuty(@RequestBody Duty request) {
        return dutyService.createDuty(request);
    }

    //Hepsini listele
    @GetMapping
    public List<Duty> getAllDuties() {
        return dutyService.getAllDuties();
    }

    //id ile arama
    @GetMapping(value = "/{id}")
    public Duty getDutyById(@PathVariable Long id) {
        return dutyService.getDutyById(id);
    }

    //id ile bulup gönderilen body ile update etme
    @PutMapping("/{id}")
    public Duty updateDuty(@PathVariable Long id, @RequestBody Duty request) {
        return dutyService.updateDuty(id, request);
    }

    // id ile silme
    @DeleteMapping(value = "/{id}")
    public Boolean deleteDutyById(@PathVariable Long id) {
        return dutyService.deleteDutyById(id);
    }

    // aktif- pasif listeleme
    @GetMapping(value = "state/{isActive}")
    public List<Duty> getDutyByIsActive(@PathVariable String isActive) {
        return dutyService.getDutyByIsActive(Boolean.valueOf(isActive));
    }

}
