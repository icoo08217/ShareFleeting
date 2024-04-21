package bc.shareFleeting.web.dto;

import bc.shareFleeting.domain.role.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberNewForm {

    private String memberName;

    private String email;

    private String loginId;

    private String password;

    private Gender gender;

}
