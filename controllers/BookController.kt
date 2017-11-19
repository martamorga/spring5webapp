package mm.springframework.spring5webapp.controllers

import mm.springframework.spring5webapp.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class BookController {

    @Autowired
    lateinit var bookRepository: BookRepository


    @RequestMapping("/books")
    fun getBook(model: Model) {
        model.addAttribute("books", bookRepository.findAll())
    }

}



