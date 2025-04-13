package com.app.threetier.repository;

import com.app.threetier.domain.ProdectVO;
import com.app.threetier.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductDAO {

    private final ProductMapper productMapper;

//    상품 입력
    public void writeProduct(ProdectVO prodectVO) {
        productMapper.insert(prodectVO);
    }
//    상품 리스트 조회
    public List<ProdectVO> productList() {
        return productMapper.selectAll();
    }

}
