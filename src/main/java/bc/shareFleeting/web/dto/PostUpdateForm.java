package bc.shareFleeting.web.dto;

import bc.shareFleeting.domain.role.OpenStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class PostUpdateForm {

    // 작성자명
    private String writer;

    // 제목
    private String title;

    // 내용
    private String content;

    // 변경일자(생성일자와 동일)
    private LocalDateTime updatedDate;

    private OpenStatus status;

    @Builder
    public PostUpdateForm(String writer, String title, String content , LocalDateTime updatedDate, OpenStatus status) {
        this.writer = writer;
        this.title = title;
        this.content = content;
        this.updatedDate = updatedDate;
        this.status = status;
    }

    public PostUpdateForm toEntity() {
        return PostUpdateForm.builder()
                .writer(writer)
                .title(title)
                .content(content)
                .updatedDate(updatedDate)
                .status(status)
                .build();
    }
}
