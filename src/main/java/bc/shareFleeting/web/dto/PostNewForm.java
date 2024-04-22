package bc.shareFleeting.web.dto;

import bc.shareFleeting.domain.role.OpenStatus;
import lombok.Builder;
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

    @Builder
    public PostNewForm(String writer, String title, String content , LocalDateTime createdDate, LocalDateTime updatedDate, OpenStatus status) {
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.status = status;
    }

    public PostNewForm toEntity() {
        return PostNewForm.builder()
                .writer(writer)
                .title(title)
                .content(content)
                .createdDate(createdDate)
                .updatedDate(updatedDate)
                .status(status)
                .build();
    }
}
