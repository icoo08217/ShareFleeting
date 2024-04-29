package bc.shareFleeting.web.controller;

import bc.shareFleeting.domain.Post;
import bc.shareFleeting.service.PostService;
import bc.shareFleeting.web.dto.PostNewForm;
import bc.shareFleeting.web.dto.PostUpdateForm;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
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
    public @ResponseBody Post newPost(PostNewForm form) {
        return postService.createPost(form);
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
        게시물 수정 폼
     */
    @GetMapping("/post/update/{postId}")
    public String updatePost(@PathVariable Long postId , Model model) {
        Post post = postService.findById(postId);
        model.addAttribute("post", post);
        return "post/updateForm";
    }

    /*
        게시물 수정 데이터 전송
     */
    @PostMapping("/post/update/{postId}")
    public @ResponseBody Post updatePost(@PathVariable Long postId, PostUpdateForm form) {
        return postService.updatePost(postId , form);
    }

    /*
        게시물 삭제
     */
    @DeleteMapping("/post/delete")
    public @ResponseBody ResponseEntity<String> deletePost(@PathVariable Long postId) {
        postService.deletePost(postId);
        return ResponseEntity.ok("post delete success");
    }
}
