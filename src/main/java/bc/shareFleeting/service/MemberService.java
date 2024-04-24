package bc.shareFleeting.service;

import bc.shareFleeting.domain.Member;
import org.springframework.stereotype.Service;

public interface MemberService {

    // 사용자 정보 생성
    public Member createMember(Member member);
    // 사용자 정보 조회
    public Member findMemberById(long id);
    // 사용자 정보 수정
    public Member updateMember(Member member);
    // 사용자 정보 삭제
    public void deleteMember(long id);
}
