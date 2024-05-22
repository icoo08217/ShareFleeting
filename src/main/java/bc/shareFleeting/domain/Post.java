package bc.shareFleeting.domain;

import bc.shareFleeting.domain.role.OpenStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder @Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class Post extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "post_id")
    private Long id;

    @Column(length = 100 , nullable = false)
    private String title; // 제목

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content; // 내용

    @Column(nullable = false)
    private OpenStatus status; // 비밀글

    @Column(columnDefinition = "integer default 0", nullable = false)
    private int viewCount; // 조회수

    @Column(columnDefinition = "integer default 0", nullable = false)
    private int likesCount; // 좋아요수

    @OneToMany(mappedBy = "post" , cascade = CascadeType.REMOVE , orphanRemoval = true)
    @OrderBy("id asc")
    private List<Comment> comments; // 댓글

//    @OneToMany(mappedBy = "post" , cascade = CascadeType.ALL , orphanRemoval = true)
//    private List<HashTagPostMapping> hashTagPostMappingList; // 해시태그

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member; // 작성자 정보

    public void updatePost(String title, String content, LocalDateTime updatedDate , OpenStatus status) {
        this.title = title;
        this.content = content;
        this.updatedDate = updatedDate;
        this.status = status;
    }
}
