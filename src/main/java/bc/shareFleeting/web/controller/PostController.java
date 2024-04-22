package bc.shareFleeting.web.controller;

import bc.shareFleeting.domain.Post;
import bc.shareFleeting.service.PostService;
import bc.shareFleeting.web.dto.PostNewForm;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    /*
        게시물 등록 폼
     */
    @GetMapping("/post/new")
    public String createNewPost(){
        return "post/newForm";
    }

    /*
        게시물 등록 정보 Post
     */
    @PostMapping("/post/new")
    public Post newPost(PostNewForm form) {
        return postService.savePost(form);
    }

    /*
        게시물 상세 페이지
     */
    @GetMapping("/post/{postId}")
    public String getPost(@PathVariable Long postId , Model model) {
        Post post = postService.findById(postId);
        model.addAttribute("post", post);
        return "post/detail";
    }

    /*
        게시물 리스트 페이지
     */
    @GetMapping("/post/all")
    public String getAllPosts(Model model) {
        List<Post> postList = postService.findAll();
        model.addAttribute("postList", postList);
        return "post/list";
    }


}
