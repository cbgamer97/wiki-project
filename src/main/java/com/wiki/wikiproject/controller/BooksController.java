package com.wiki.wikiproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BooksController {

    @GetMapping("/books")
    public String books() {
        return "books";
    }
}
