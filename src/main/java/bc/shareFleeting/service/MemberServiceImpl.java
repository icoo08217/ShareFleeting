package bc.shareFleeting.service;

import bc.shareFleeting.domain.Member;
import bc.shareFleeting.repository.MemberRepository;
import bc.shareFleeting.web.dto.MemberNewForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public Member createMember(MemberNewForm form) {
        Member newMember = Member.builder()
                        .memberName(form.getMemberName())
                        .email(form.getEmail())
                        .loginId(form.getLoginId())
                        .password(form.getPassword())
                        .gender(form.getGender())
                        .build();

        newMember.createdDate = LocalDateTime.now();
        newMember.updatedDate = LocalDateTime.now();

        return memberRepository.save(newMember);
    }

    @Override
    public Member findMemberById(long id) {
        return memberRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));
    }

    @Override
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Member updateMember(Member member) {
        Member findMember = memberRepository.findById(member.getId())
                .orElseThrow(() -> new IllegalArgumentException("사용자를 찾을 수 없습니다."));
        findMember.updateMember(member.getEmail(), member.getPassword(), member.getMemberName(), LocalDateTime.now());
        return findMember;
    }

    @Override
    public void deleteMember(long id) {
        Member deletedMember = findMemberById(id);
        memberRepository.delete(deletedMember);
    }
}
