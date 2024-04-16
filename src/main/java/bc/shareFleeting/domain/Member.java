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
    private String memberName;

    // 이메일
    private String email;

    // 성별
    private Gender gender;

    // 게시물
    @OneToMany
    private List<Post> posts = new ArrayList<>();

}
