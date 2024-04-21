package bc.shareFleeting.domain;

import bc.shareFleeting.domain.role.Gender;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "member")
public class Member {

    // id
    @Id @GeneratedValue
    private Long id;

    // 이름
    @Column(nullable = false)
    private String memberName;

    // 이메일
    @Column(nullable = false)
    private String email;

    // 성별
    @Column(nullable = false)
    private Gender gender;

    // 로그인 아이디
    @Column(nullable = false)
    private String loginId;

    // 패쓰워드
    @Column(nullable = false)
    private String password;

    // 게시물
    @OneToMany
    private List<Post> posts = new ArrayList<>();

}
