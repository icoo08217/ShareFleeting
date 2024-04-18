package bc.shareFleeting.web.dto;

import bc.shareFleeting.domain.role.OpenStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class PostNewForm {

    // 작성자명
    private String writer;

    // 제목
    private String title;

    // 내용
    private String content;

    // 생성일자
    private LocalDateTime createdDate;

    // 변경일자(생성일자와 동일)
    private LocalDateTime updatedDate;

    private OpenStatus status;
}
