package bc.shareFleeting.web.dto;

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
}
