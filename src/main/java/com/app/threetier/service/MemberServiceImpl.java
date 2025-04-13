package com.app.threetier.service;

import com.app.threetier.domain.MemberVO;
import com.app.threetier.mapper.MemberMapper;
import com.app.threetier.repository.MemberDAO;
import com.app.threetier.repository.PostDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class MemberServiceImpl implements MemberService {

    private final MemberDAO memberDAO;
    private final PostDAO postDAO;

    @Override
    public void join(MemberVO memberVO) {
        memberDAO.save(memberVO);
    }

    @Override
    public Optional<MemberVO> login(MemberVO memberVO) {
        return memberDAO.findByMemberIdAndMemberPassword(memberVO);
    }

    @Override
//    @Transactional(rollbackFor = {RuntimeException.class, IOException.class})
    public void withdraw(Long id) {
//        게시글도 삭제해야함
        postDAO.deleteAllByMemberId(id);
//        회원 탈퇴
        memberDAO.delete(id);
    }

}
