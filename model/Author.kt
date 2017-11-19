package mm.springframework.spring5webapp.model

import java.util.*
import javax.persistence.*

@Entity
class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0

    @ManyToMany(mappedBy = "authors")
    var books: Set<Book> = HashSet()

    var firstName: String = ""

    var lastName: String = ""

}



