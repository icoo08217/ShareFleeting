package bc.shareFleeting.repository;

import bc.shareFleeting.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member , Long> {
}
