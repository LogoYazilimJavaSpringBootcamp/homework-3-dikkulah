package com.dikkulah.isbasi.service;

import com.dikkulah.isbasi.model.Cheque;
import com.dikkulah.isbasi.repository.ChequeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChequeService {

    @Autowired
    private ChequeRepository chequeRepository;

    public Cheque createCheque(Cheque request) {
        return chequeRepository.save(request);
    }

    public List<Cheque> getAllCheques() {
        return chequeRepository.findAll();
    }

    public Cheque getChequeById(Long id) {
        return chequeRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Cheque updateCheque(Long id, Cheque request) {
        return chequeRepository.updateById(id,request);
    }

    public Boolean deleteProductById(Long id) {
        return chequeRepository.deleteById(id);
    }
}
