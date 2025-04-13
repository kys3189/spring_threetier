package com.app.threetier.service;

import com.app.threetier.domain.ProdectVO;
import com.app.threetier.repository.ProductDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductDAO productDAO;

    @Override
    public void writeProduct(ProdectVO prodectVO) {
        productDAO.writeProduct(prodectVO);
    }
    @Override
    public List<ProdectVO> productList() {
        return productDAO.productList();
    }
}
