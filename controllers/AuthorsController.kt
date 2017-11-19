package mm.springframework.spring5webapp.controllers

import mm.springframework.spring5webapp.repository.AuthorRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class AuthorsController {

    @Autowired
    lateinit var authorRepository: AuthorRepository


    @RequestMapping("/authors")
    fun getAuthors(model: Model) {
        model.addAttribute("authors", authorRepository.findAll())
    }

}