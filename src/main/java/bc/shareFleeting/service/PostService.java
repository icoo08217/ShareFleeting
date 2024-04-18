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

    // 게시물 1건 조회하기
    public Post findById(Long id){
        try {
            return postRepository.findById(id).get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post savePost(PostNewForm form) {

        // builder 패턴
        Post newPost = Post.builder()
                        .title(form.getTitle())
                        .content(form.getContent())
                        .createdDate(form.getCreatedDate())
                        .modifiedDate(form.getUpdatedDate())
                        .status(form.getStatus())
                        .build();

        return postRepository.save(newPost);
    }

    public Post updatePost(Long id, PostNewForm form) {
        Optional<Post> post = postRepository.findById(id);
        if(post.isPresent()) {
            return post.get();
        } else {
            return null;
        }
    }
}
