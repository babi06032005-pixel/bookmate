package com.bookmate.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/books")
@CrossOrigin
public class BookController {

    @GetMapping
    public List<String> getBooks() {
        return List.of("Book 1", "Book 2");
    }
}