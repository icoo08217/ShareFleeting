package bc.shareFleeting.domain;

import bc.shareFleeting.domain.role.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder @Getter
@Table(name = "member")
@AllArgsConstructor
@NoArgsConstructor
public class Member extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "member_id")
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

    // 패스워드
    @Column(nullable = false)
    private String password;

    // 댓글
    @OneToMany
    private List<Comment> commentList;

    // 게시물
    @OneToMany
    private List<Post> posts = new ArrayList<>();

    public void updateMember(String email , String password, String memberName , LocalDateTime updatedDate) {
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.updatedDate = updatedDate;
    }

}
