package bc.shareFleeting.service;

import bc.shareFleeting.domain.Post;
import bc.shareFleeting.web.dto.PostNewForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    // 게시글 조회
    public Post findById(Long id);
    // 게시글 전체 조회
    public List<Post> findAll();
    // 게시글 생성
    public Post savePost(PostNewForm form);
    // 게시글 수정
    public Post updatePost(Long id, PostNewForm form);
    // 게시글 삭제
    public void deletePost(Long id);
}
