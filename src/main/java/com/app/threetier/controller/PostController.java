package com.app.threetier.controller;

import com.app.threetier.domain.MemberVO;
import com.app.threetier.domain.PostVO;
import com.app.threetier.service.PostService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@Slf4j
@RequestMapping("/post/*")
@RequiredArgsConstructor
public class PostController {

//    private final PostService postService;
//    private final HttpSession session;
//    private final PostVO postVO;
//
//    //    포스트 리스트
//    @GetMapping("list")
//    public void goToList(Model model) {
//        model.addAttribute("posts", postService.getList());
//    }
////    포스트 단일 조회
//    @GetMapping("read")
//    public void goToRead(@RequestParam("id") Long id, Model model) {
//        model.addAttribute("post", postService.getPostById(id).orElseThrow(() -> {
//            throw new RuntimeException("Post not found");
//        }));
//    }
////    포스트 작성 이동
//    @GetMapping("write")
//    public void goToWrite(Model model) {
//        model.addAttribute("postVO", new PostVO());
//        model.addAttribute("memberId", ((MemberVO)session.getAttribute("member")).getId());
//    }
////    포스트 작성 확인
//    @PostMapping("write")
//    public RedirectView write(PostVO postVO) {
//        postService.write(postVO);
//        return new RedirectView("/static/css/post/post/list");
//    }
////    포스트 업데이트
//    @GetMapping("edit")
//    public void goToEdit(@RequestParam("id") Long id, Model model) {
//        Long memberId = ((MemberVO)session.getAttribute("member")).getId();
//        PostVO postVO = postService.getPostById(id).orElseThrow(() -> new RuntimeException("Post not found"));
//        model.addAttribute("postVO", postVO);
//        model.addAttribute("memberId", memberId);
//    }
//    @PostMapping("edit")
//    public RedirectView edit(PostVO postVO) {
//        postService.edit(postVO);
//        return new RedirectView("/static/css/post/post/list");
//    }
//    @GetMapping("remove")
//    public RedirectView remove(Long id) {
//        postService.removePost(id);
//        return new RedirectView("/static/css/post/post/list");
//    }
}
