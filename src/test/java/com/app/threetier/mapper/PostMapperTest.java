package com.app.threetier.mapper;

import com.app.threetier.domain.PostVO;
import com.app.threetier.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@Slf4j
public class PostMapperTest {

    @Autowired
    private PostService postService;

    @Test
    public void selectAllTest() {
        List<PostVO> posts = postService.getList();
        posts.stream().map(PostVO::toString).forEach(log::info);
    }

    @Test
    public void postReadTest() {
        Long id = 1L;
        Optional<PostVO> post = postService.getPostById(id);
        post.map(PostVO::toString).ifPresent(log::info);
    }
}
