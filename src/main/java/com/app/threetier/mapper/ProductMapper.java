package com.app.threetier.mapper;

import com.app.threetier.domain.ProdectVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
//    상품 입력
    public void insert(ProdectVO prodectVO);
//    상품 리스트 조회
    public List<ProdectVO> selectAll();
}
