package bc.shareFleeting.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "HashTag")
public class HashTag extends BaseEntity{

    @Column(name = "tag_name" , nullable = false)
    private String tagName;

}
