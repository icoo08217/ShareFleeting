package bc.shareFleeting.domain;

import bc.shareFleeting.domain.role.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder @Getter
@Table(name = "member")
@AllArgsConstructor
@NoArgsConstructor
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

    @Column(nullable = false)
    private LocalDateTime createdDate; // 생성일

    @Column(nullable = false)
    private LocalDateTime modifiedDate; // 수정일

    // 게시물
//    @OneToMany
//    private List<Post> posts = new ArrayList<>();

    public void updateMember(String email , String password, String memberName , LocalDateTime modifiedDate) {
        this.email = email;
        this.password = password;
        this.memberName = memberName;
        this.modifiedDate = modifiedDate;
    }

}
