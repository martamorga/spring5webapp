package mm.springframework.spring5webapp.model

import java.util.*
import javax.persistence.*
import javax.persistence.GenerationType.AUTO

@Entity
class Book {
    @Id
    @GeneratedValue(strategy = AUTO)
    var id: Long = 0

    var title: String = ""

    var isbn: String = ""

    @ManyToMany
    @JoinTable(name = "author_book",
            joinColumns = arrayOf(JoinColumn(name = "book_id")),
            inverseJoinColumns = arrayOf(JoinColumn(name = "author_id")))
    var authors: Set<Author> = HashSet()

    @OneToOne
    var publisher: Publisher = Publisher()


}

