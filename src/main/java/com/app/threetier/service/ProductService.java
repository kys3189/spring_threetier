package com.app.threetier.service;

import com.app.threetier.domain.ProdectVO;

import java.util.List;
import java.util.Optional;

public interface ProductService {
//    상품 작성
    public void writeProduct(ProdectVO prodectVO);
//    상품 리스트 조회
    public List<ProdectVO> productList();
//    상품 단일 조회
    public Optional<ProdectVO> selectById(Long id);
}
