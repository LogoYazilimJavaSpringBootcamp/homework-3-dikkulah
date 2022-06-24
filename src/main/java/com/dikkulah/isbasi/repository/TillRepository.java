package com.dikkulah.isbasi.repository;

import com.dikkulah.isbasi.model.Till;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class TillRepository {

    private static final List<Till> TILL_LIST = new ArrayList<>();


    public Till save(Till request) {
        TILL_LIST.add(request);
        return request;
    }

    public List<Till> findAll() {
        return TILL_LIST;
    }

    public Optional<Till> finById(Long id) {
        return TILL_LIST.stream().filter(till -> Objects.equals(till.getId(), id)).findFirst();
    }

    public Till updateById(Long id, Till request) {
        var find = TILL_LIST.stream().filter(till -> Objects.equals(till.getId(), id)).findFirst().orElseThrow(RuntimeException::new);
        TILL_LIST.remove(find);
        request.setId(id);
        TILL_LIST.add(request);
        return request;
    }

    public Boolean deleteById(Long id) {
        var find = TILL_LIST.stream().filter(till -> Objects.equals(till.getId(), id)).findFirst().orElseThrow(RuntimeException::new);
        return TILL_LIST.remove(find);
    }

    public List<Till> finByIsActive(Boolean isActive) {
        return TILL_LIST.stream().filter(till -> Objects.equals(till.getIsActive(), isActive)).toList();
    }
}
