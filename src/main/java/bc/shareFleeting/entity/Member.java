package bc.shareFleeting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Member {

    // id
    @Id @GeneratedValue
    private Long id;

    // 이름
    private String memberName;

    // 이메일
    private String email;
}
