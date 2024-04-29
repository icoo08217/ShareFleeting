package bc.shareFleeting.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Comment")
public class Comment {

    @Id @GeneratedValue
    private Long id;

    // 댓글 내용
    private String reContent;

    // 작성자
    @ManyToOne
    private Member writer;

    // 생성일
    private LocalDateTime creatDate;

    // 수정일
    private LocalDateTime modifiedDate;
}
