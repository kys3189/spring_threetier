package com.app.threetier.mapper;

import com.app.threetier.domain.ProdectVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ProductMapper {
//    상품 입력
    public void insert(ProdectVO prodectVO);
//    상품 리스트 조회
    public List<ProdectVO> selectAll();
//    상품 단일 조회
    public Optional<ProdectVO> select(Long id);

}
