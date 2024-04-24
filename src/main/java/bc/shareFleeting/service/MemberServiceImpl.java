package bc.shareFleeting.service;

import bc.shareFleeting.domain.Member;
import bc.shareFleeting.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public Member createMember(Member member) {
        Member savedMember = memberRepository.save(member);
        return savedMember;
    }

    @Override
    public Member findMemberById(long id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));
        return member;
    }

    @Override
    public Member updateMember(Member member) {
        return null;
    }

    @Override
    public void deleteMember(long id) {
        Member deletedMember = findMemberById(id);
        memberRepository.delete(deletedMember);
    }
}
