package bc.shareFleeting.domain;

import bc.shareFleeting.domain.role.OpenStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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

    private String title;

    private String content;

    private LocalDateTime createdDate;

    private LocalDateTime modifiedDate;

    private OpenStatus status;

//    @ManyToOne
//    private Member member;

    public void updatePost(String title, String content, LocalDateTime modifiedDate) {
        this.title = title;
        this.content = content;
        this.modifiedDate = modifiedDate;
    }
}
