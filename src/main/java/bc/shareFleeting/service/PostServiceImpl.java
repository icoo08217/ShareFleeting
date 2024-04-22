package bc.shareFleeting.service;

import bc.shareFleeting.domain.Post;
import bc.shareFleeting.repository.PostRepository;
import bc.shareFleeting.web.dto.PostNewForm;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Override
    public Post findById(Long id) {
        try {
            return postRepository.findById(id).get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post savePost(PostNewForm form) {
        Post newPost = Post.builder()
                .title(form.getTitle())
                .content(form.getContent())
                .createdDate(form.getCreatedDate())
                .modifiedDate(form.getUpdatedDate())
                .status(form.getStatus())
                .build();

        return postRepository.save(newPost);
    }

    @Override
    public Post updatePost(Long id, PostNewForm form) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(
                        "해당 게시물이 존재하지 않습니다. postId = " + id
                ));
        return post;
    }

    @Override
    public void deletePost(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException(
                        "해당 게시물이 존재하지 않습니다. postId = " + id
                ));

        postRepository.delete(post);
    }
}
