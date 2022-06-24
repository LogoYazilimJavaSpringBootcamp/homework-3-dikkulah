package com.dikkulah.isbasi.repository;

import com.dikkulah.isbasi.model.Cheque;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class ChequeRepository {
    private static final List<Cheque> CHEQUE_LIST = new ArrayList<>();

    public Cheque save(Cheque request) {
        CHEQUE_LIST.add(request);
        return request;
    }


    public List<Cheque> findAll() {
        return CHEQUE_LIST;
    }

    public Optional<Cheque> findById(Long id) {
        return CHEQUE_LIST.stream().filter(cheque -> Objects.equals(cheque.getId(), id)).findFirst();
    }

    public Cheque updateById(Long id, Cheque request) {
        var find = CHEQUE_LIST.stream().filter(commercial -> Objects.equals(commercial.getId(), id)).findFirst().orElseThrow(RuntimeException::new);
        CHEQUE_LIST.remove(find);
        request.setId(id);
        CHEQUE_LIST.add(request);
        return request;

    }

    public Boolean deleteById(Long id) {
        var find = CHEQUE_LIST.stream().filter(commercial -> Objects.equals(commercial.getId(), id)).findFirst().orElseThrow(RuntimeException::new);
        return CHEQUE_LIST.remove(find);
    }
}
