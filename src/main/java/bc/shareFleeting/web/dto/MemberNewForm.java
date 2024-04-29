package bc.shareFleeting.web.dto;

import bc.shareFleeting.domain.role.Gender;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class MemberNewForm {

    private String memberName;

    private String email;

    private String loginId;

    private String password;

    private Gender gender;

    // 생성일자
    private LocalDateTime createdDate;

    // 변경일자(생성일자와 동일)
    private LocalDateTime updatedDate;

    @Builder
    public MemberNewForm(LocalDateTime createdDate, String email, Gender gender, String loginId, String memberName, String password, LocalDateTime updatedDate) {
        this.createdDate = createdDate;
        this.email = email;
        this.gender = gender;
        this.loginId = loginId;
        this.memberName = memberName;
        this.password = password;
        this.updatedDate = updatedDate;
    }
}
