package bc.shareFleeting.domain;

import bc.shareFleeting.domain.role.OpenStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Post {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private LocalDateTime createdDate;

    @Column(nullable = false)
    private LocalDateTime modifiedDate;

    @Column(nullable = false)
    private OpenStatus status;

//    @ManyToOne
//    private Member member;

    public void updatePost(String title, String content, LocalDateTime modifiedDate) {
        this.title = title;
        this.content = content;
        this.modifiedDate = modifiedDate;
    }
}
