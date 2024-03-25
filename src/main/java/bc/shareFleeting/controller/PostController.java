package bc.shareFleeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    /*
        게시물 하나의 페이지
     */
    @GetMapping("/post")
    public String getPost() {
        return "post/detail";
    }


}
