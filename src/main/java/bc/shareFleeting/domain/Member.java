package bc.shareFleeting.domain;

import bc.shareFleeting.domain.role.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
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

    //

}
