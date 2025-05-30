package com.app.threetier.mapper;

import com.app.threetier.domain.PostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {
//    게시글 조회
    public List<PostVO> selectAll();
//    게시물 1개 조회
    public Optional<PostVO> select(Long id);
//    게시글 작성
    public void insert(PostVO postVO);
//    게시글 수정
    public void update(PostVO postVO);
//    게시글 삭제
    public void deleteAll(Long id);
    public void delete(Long id);
}
