package bc.shareFleeting.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Post {

    @Id @GeneratedValue
    private Long id;

    private String title;

    private String content;

    private LocalDateTime createdDate;

    private LocalDateTime modifiedDate;
}
