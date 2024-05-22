package bc.shareFleeting.web.dto;

import bc.shareFleeting.domain.BaseEntity;
import bc.shareFleeting.domain.role.Gender;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class MemberNewForm extends BaseEntity {

    private String memberName;

    private String email;

    private String loginId;

    private String password;

    private Gender gender;

    @Builder
    public MemberNewForm(String memberName, String email, String loginId, String password, Gender gender, LocalDateTime createdDate,  LocalDateTime updatedDate) {
        this.memberName = memberName;
        this.email = email;
        this.loginId = loginId;
        this.password = password;
        this.gender = gender;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
}
