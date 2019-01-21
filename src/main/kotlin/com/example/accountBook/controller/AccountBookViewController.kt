package com.example.accountBook.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("account") // URL1 => localhost:8080/URL1
class AccountBookViewController() {

    @GetMapping("/book") // URL2 => localhost:8080/URL1/URL2
    fun show(model: Model): String {
        return "account_book_table" // 表示する対象のhtml名
    }
}