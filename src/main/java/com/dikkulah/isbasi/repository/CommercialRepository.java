package com.dikkulah.isbasi.repository;

import com.dikkulah.isbasi.model.Commercial;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class CommercialRepository {
    private static final List<Commercial> COMMERCIAL_LIST = new ArrayList<>();

    public Commercial save(Commercial request) {
        COMMERCIAL_LIST.add(request);
        return request;
    }

    public List<Commercial> findAll() {
        return COMMERCIAL_LIST;
    }

    public Optional<Commercial> findById(Long id) {
        return COMMERCIAL_LIST.stream().filter(commercial -> Objects.equals(commercial.getId(), id)).findFirst();
    }

    public Boolean deleteById(Long id) {
        var find = COMMERCIAL_LIST.stream().filter(commercial -> Objects.equals(commercial.getId(), id)).findFirst().orElseThrow(RuntimeException::new);
        return COMMERCIAL_LIST.remove(find);
    }

    public Commercial updateById(Long id, Commercial request) {
        var find = COMMERCIAL_LIST.stream().filter(commercial -> Objects.equals(commercial.getId(), id)).findFirst().orElseThrow(RuntimeException::new);
        COMMERCIAL_LIST.remove(find);
        request.setId(id);
        COMMERCIAL_LIST.add(request);
        return request;
    }

    public List<Commercial> findByIsActive(Boolean isActive) {
        return COMMERCIAL_LIST.stream().filter(commercial -> Objects.equals(commercial.getIsActive(), isActive)).toList();
    }
}
