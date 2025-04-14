package com.app.threetier.service;

import com.app.threetier.domain.ProdectVO;
import com.app.threetier.repository.ProductDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
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
    @Override
    public Optional<ProdectVO> selectById(Long id) {
        return productDAO.selectById(id);
    }
}
