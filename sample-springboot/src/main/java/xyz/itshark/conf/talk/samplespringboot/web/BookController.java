package xyz.itshark.conf.talk.samplespringboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import xyz.itshark.conf.talk.samplespringboot.pojo.Book;
import xyz.itshark.conf.talk.samplespringboot.service.BookService;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.List;

@RestController
public class BookController {

    @Resource
    private BookService bookService;

    @RequestMapping(path = "/books")
    public List<Book> getAll() {
        return bookService.getAllBooks();
    }

    @RequestMapping("/admin/book")
    public Book addBook(@RequestParam String title) {
        return bookService.addBook(title);
    }
}
