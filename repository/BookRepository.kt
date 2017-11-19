package mm.springframework.spring5webapp.repository

import mm.springframework.spring5webapp.model.Book
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component

@Component
interface BookRepository : CrudRepository<Book, Long>