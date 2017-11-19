package mm.springframework.spring5webapp.repository

import mm.springframework.spring5webapp.model.Author
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component

@Component
interface AuthorRepository : CrudRepository<Author, Long>