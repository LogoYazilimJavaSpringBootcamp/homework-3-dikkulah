package com.dikkulah.isbasi.repository;

import com.dikkulah.isbasi.model.Duty;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class DutyRepository {
    static final List<Duty> dutyList = new ArrayList<>();

    public Duty save(Duty request) {
        request.setUnitBuyPriceWithKdv(request.getUnitBuyPriceWithOutKdv() + request.getUnitBuyPriceWithOutKdv() * request.getKdvRate() / 100);
        request.setUnitSellPriceWithKdv(request.getUnitSellPriceWithOutKdv() + request.getUnitSellPriceWithOutKdv() * request.getKdvRate() / 100);

        dutyList.add(request);
        return request;
    }

    public List<Duty> findAll() {
        return dutyList;
    }

    public Optional<Duty> findById(Long id) {
        return dutyList.stream().filter(duty -> Objects.equals(duty.getId(), id)).findFirst();
    }

    public Duty updateById(Long id, Duty request) {
        var find = dutyList.stream().filter(duty -> Objects.equals(duty.getId(), id)).findFirst().orElseThrow(RuntimeException::new);
        dutyList.remove(find);
        request.setId(id);
        request.setUnitBuyPriceWithKdv(request.getUnitBuyPriceWithOutKdv() + request.getUnitBuyPriceWithOutKdv() * request.getKdvRate() / 100);
        request.setUnitSellPriceWithKdv(request.getUnitSellPriceWithOutKdv() + request.getUnitSellPriceWithOutKdv() * request.getKdvRate() / 100);

        dutyList.add(request);
        return request;

    }

    public Boolean deleteById(Long id) {
        var find = dutyList.stream().filter(duty -> Objects.equals(duty.getId(), id)).findFirst().orElseThrow(RuntimeException::new);
        return dutyList.remove(find);
    }

    public List<Duty> findDutiesByIsActive(Boolean isActive) {
        return dutyList.stream().filter(duty -> Objects.equals(duty.getIsActive(), isActive)).toList();
    }
}
