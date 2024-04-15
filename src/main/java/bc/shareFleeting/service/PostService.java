package bc.shareFleeting.service;

import bc.shareFleeting.domain.Post;
import bc.shareFleeting.repository.PostRepository;
import bc.shareFleeting.web.dto.PostNewForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post findById(Long id){
        Optional<Post> post = postRepository.findById(id);
        return post.get();
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post savePost(PostNewForm form) {

        // builder 패턴
        Post newPost = Post.builder()
//                        .id(1L)
                        .title(form.getTitle())
                        .content(form.getContent())
                        .createdDate(form.getCreatedDate())
                        .modifiedDate(form.getCreatedDate())
                        .build();

        return postRepository.save(newPost);
    }
}
