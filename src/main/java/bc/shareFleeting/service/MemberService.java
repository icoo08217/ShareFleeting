package bc.shareFleeting.service;

import bc.shareFleeting.domain.Member;
import bc.shareFleeting.web.dto.MemberNewForm;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MemberService {

    // 사용자 정보 생성
    public Member createMember(MemberNewForm member);
    // 사용자 정보 조회
    public Member findMemberById(long id);
    // 사용자 정보 모두 조회
    public List<Member> findMembers();
    // 사용자 정보 수정
    public Member updateMember(Member member);
    // 사용자 정보 삭제
    public void deleteMember(long id);
}
