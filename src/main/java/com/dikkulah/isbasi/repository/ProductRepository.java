package com.dikkulah.isbasi.repository;

import com.dikkulah.isbasi.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class ProductRepository {
    static final List<Product> PRODUCT_LIST = new ArrayList<>();

    public Product save(Product request) {
        request.setUnitBuyPriceWithKdv(request.getUnitBuyPriceWithOutKdv() + request.getUnitBuyPriceWithOutKdv() * request.getKdvRate() / 100);
        request.setUnitSellPriceWithKdv(request.getUnitSellPriceWithOutKdv() + request.getUnitSellPriceWithOutKdv() * request.getKdvRate() / 100);

        PRODUCT_LIST.add(request);
        return request;
    }

    public List<Product> findAll() {
        return PRODUCT_LIST;
    }

    public Optional<Product> findById(Long id) {
        return PRODUCT_LIST.stream().filter(product -> Objects.equals(product.getId(), id)).findFirst();
    }

    public Product updateById(Long id, Product request) {
        var find = PRODUCT_LIST.stream().filter(product -> Objects.equals(product.getId(), id)).findFirst().orElseThrow(RuntimeException::new);
        PRODUCT_LIST.remove(find);
        request.setId(id);
        request.setUnitBuyPriceWithKdv(request.getUnitBuyPriceWithOutKdv() + request.getUnitBuyPriceWithOutKdv() * request.getKdvRate() / 100);
        request.setUnitSellPriceWithKdv(request.getUnitSellPriceWithOutKdv() + request.getUnitSellPriceWithOutKdv() * request.getKdvRate() / 100);

        PRODUCT_LIST.add(request);
        return request;

    }

    public Boolean deleteById(Long id) {
        var find = PRODUCT_LIST.stream().filter(product -> Objects.equals(product.getId(), id)).findFirst().orElseThrow(RuntimeException::new);
        return PRODUCT_LIST.remove(find);
    }

    public List<Product> findByIsActive(Boolean isActive) {
        return PRODUCT_LIST.stream().filter(product -> Objects.equals(product.getIsActive(), isActive)).toList();
    }
}
