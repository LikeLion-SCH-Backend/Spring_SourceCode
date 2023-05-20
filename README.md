## Book

```
package com.example.first_lecture.Controller;

import com.example.first_lecture.Entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class BookController {
    private final Book book;

    @ResponseBody
    @GetMapping("/bookInfo")
    public String bookInfo() {
        book.setTitle("토비의 스프링부트");
        return book.getTitle();
    }
}
```

## Book Controller
```
package com.example.first_lecture.Controller;

import com.example.first_lecture.Entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class BookController {
    private final Book book;

    @ResponseBody
    @GetMapping("/bookInfo")
    public String bookInfo() {
        book.setTitle("토비의 스프링부트");
        return book.getTitle();
    }
}
```
