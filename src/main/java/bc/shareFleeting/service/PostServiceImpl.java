package bc.shareFleeting.service;

import bc.shareFleeting.domain.Post;
import bc.shareFleeting.repository.PostRepository;
import bc.shareFleeting.web.dto.PostNewForm;
import bc.shareFleeting.web.dto.PostUpdateForm;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Override
    public Post findById(Long id) {
        return postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException(
                "해당 게시물이 존재하지 않습니다. postId = " + id));
    }

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Transactional
    @Override
    public Post createPost(PostNewForm form) {
        Post target = Post.builder()
                .title(form.getTitle())
                .content(form.getContent())
                .createdDate(form.getCreatedDate())
                .modifiedDate(form.getUpdatedDate())
                .status(form.getStatus())
                .build();
        return postRepository.save(target);
    }

    @Transactional
    @Override
    public Post updatePost(Long id , PostUpdateForm form) {
        Post target = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(
                        "해당 게시물이 존재하지 않습니다. postId = " + id));
        target.updatePost(form.getTitle(), form.getContent() , form.getUpdatedDate(), form.getStatus());
        return target;
    }

    @Transactional
    @Override
    public void deletePost(Long id) {
        Post target = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(
                        "해당 게시물이 존재하지 않습니다. postId = " + id));
        postRepository.delete(target);
    }
}
