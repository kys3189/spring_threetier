package com.app.threetier.service;

import com.app.threetier.domain.ProdectVO;

import java.util.List;

public interface ProductService {
//    상품 작성
    public void writeProduct(ProdectVO prodectVO);
//    상품 리스트 조회
    public List<ProdectVO> productList();
}
