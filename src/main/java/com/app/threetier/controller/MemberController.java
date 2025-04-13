package com.app.threetier.controller;

import com.app.threetier.domain.MemberVO;
import com.app.threetier.domain.ProdectVO;
import com.app.threetier.mapper.MemberMapper;
import com.app.threetier.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
@RequestMapping("/member/*")
@Slf4j
@RequiredArgsConstructor
public class MemberController {

    private final MemberMapper memberMapper;
    private final HttpSession session;
    private final MemberService memberService;
    private final MemberVO memberVO;

    //    회원가입
//    포워드
    @GetMapping("join")
    public void goToJoinForm(MemberVO memberVO) {;}
//    회원가입 확인
//    리다이렉트
    @PostMapping("join")
    public RedirectView join(MemberVO memberVO) {
        log.info(memberVO.toString());
        memberMapper.insert(memberVO);
//        return "forword:/member/login"; 포워드
        return new RedirectView("/member/login");
    }

//    로그인
    @GetMapping("login")
    public void goToLogin(MemberVO memberVO) {;}
//    로그인 확인
    @PostMapping("login")
    public RedirectView login(MemberVO memberVO, RedirectAttributes redirectAttributes) {
        Optional<MemberVO> foundMember = memberMapper.select(memberVO);
        log.info("foundMember :{}", foundMember.toString());
        if (foundMember.isPresent()) {
            session.setAttribute("member", foundMember.get());
            session.setAttribute("product", new ProdectVO());
            return new RedirectView("/post/list");
        }
//        session.flash 영역
//        session이 과부화 되므로, session에 flash 영역을 사용하여
//        화면으로 상태 값을 보내고, new Request가 되면 session에 flash값이 새로 주입되며
//        기존 flash값이 사라진다.
//        따라서 과부화의 부담이 줄어든다.
        redirectAttributes.addFlashAttribute("login", false);
        return new RedirectView("/member/login");


    }
//    로그아웃
    @GetMapping("logout")
    public RedirectView logout() {
//        session.removeAttribute("member");
        session.invalidate();
        return new RedirectView("/member/login");
    }

//    회원 탈퇴
    @GetMapping("withdraw")
    public RedirectView withdraw() {
        memberService.withdraw(((MemberVO)session.getAttribute("member")).getId());
        return new RedirectView("/member/login");
    }
}
