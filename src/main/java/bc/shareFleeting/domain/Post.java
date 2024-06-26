package bc.shareFleeting.domain;

import bc.shareFleeting.domain.role.OpenStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Builder @Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class Post {

    @Id @GeneratedValue
    private Long id;

    @Column(length = 100 , nullable = false)
    private String title; // 제목

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content; // 내용

    @Column(nullable = false)
    private LocalDateTime createdDate; // 생성일

    @Column(nullable = false)
    private LocalDateTime modifiedDate; // 수정일

    @Column(nullable = false)
    private OpenStatus status; // 비밀글

    @Column(nullable = false)
    private int viewCount; // 조회수

//    @ManyToOne
//    private Member member;

    public void updatePost(String title, String content, LocalDateTime modifiedDate , OpenStatus status) {
        this.title = title;
        this.content = content;
        this.modifiedDate = modifiedDate;
        this.status = status;
    }
}
