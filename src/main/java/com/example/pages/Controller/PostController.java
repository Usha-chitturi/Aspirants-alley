package com.example.pages.Controller;


import com.example.pages.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public String viewPosts(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "post";
    }
}
