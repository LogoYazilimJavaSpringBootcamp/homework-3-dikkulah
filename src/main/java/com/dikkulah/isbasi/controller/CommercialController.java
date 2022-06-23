package com.dikkulah.isbasi.controller;

import com.dikkulah.isbasi.model.Commercial;
import com.dikkulah.isbasi.service.CommercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/commercial")
public class CommercialController {

    @Autowired
    private CommercialService commercialService;

    @PostMapping
    public Commercial createCommercial(@RequestBody Commercial request) {
        return commercialService.createCommercial(request);
    }

    @GetMapping
    public List<Commercial> getAllCommercials() {
        return commercialService.getAllCommercials();
    }

    @GetMapping(value = "/{id}")
    public Commercial getCommercialById(@PathVariable Long id) {
        return commercialService.getCommercialById(id);
    }

    @PutMapping("/{id}")
    public  Commercial updateCommercial(@PathVariable Long id,@RequestBody Commercial request){
        return commercialService.updateCommercial(id,request);
    }


    @DeleteMapping(value = "/{id}")
    public Boolean deleteCommercialById(@PathVariable Long id) {
        return commercialService.deleteCommercialById(id);
    }


}
