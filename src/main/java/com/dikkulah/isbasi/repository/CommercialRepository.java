package com.dikkulah.isbasi.repository;

import com.dikkulah.isbasi.model.Commercial;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class CommercialRepository {
    private static final List<Commercial> commercialList = new ArrayList<>();

    public Commercial save(Commercial request) {
        commercialList.add(request);
        return request;
    }

    public List<Commercial> findAll() {
        return commercialList;
    }

    public Optional<Commercial> findById(Long id) {
        return commercialList.stream().filter(commercial -> Objects.equals(commercial.getId(), id)).findFirst();
    }

    public Boolean deleteById(Long id) {
        var find = commercialList.stream().filter(commercial -> Objects.equals(commercial.getId(), id)).findFirst().orElseThrow(RuntimeException::new);
        return commercialList.remove(find);
    }

    public Commercial updateCommercial(Long id, Commercial request) {
        var find = commercialList.stream().filter(commercial -> Objects.equals(commercial.getId(), id)).findFirst().orElseThrow(RuntimeException::new);
        commercialList.remove(find);
        request.setId(id);
        commercialList.add(request);
        return request;
    }

    public List<Commercial> findCommercialByIsActive(Boolean isActive) {
        return commercialList.stream().filter(commercial -> Objects.equals(commercial.getIsActive(), isActive)).toList();
    }
}
