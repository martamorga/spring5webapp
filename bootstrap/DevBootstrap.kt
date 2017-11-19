package mm.springframework.spring5webapp.bootstrap

import mm.springframework.spring5webapp.model.Author
import mm.springframework.spring5webapp.model.Book
import mm.springframework.spring5webapp.model.Publisher
import mm.springframework.spring5webapp.repository.AuthorRepository
import mm.springframework.spring5webapp.repository.BookRepository
import mm.springframework.spring5webapp.repository.PublisherRepository
import org.springframework.context.ApplicationListener
import org.springframework.context.event.ContextRefreshedEvent
import org.springframework.stereotype.Component


@Component
class DevBootstrap(private val authorRepository: AuthorRepository, private val bookRepository: BookRepository, private val publisherRepository: PublisherRepository) : ApplicationListener<ContextRefreshedEvent> {

    override fun onApplicationEvent(contextRefreshedEvent: ContextRefreshedEvent) {
        initData()
    }

    private fun initData() {

        //Eric
        val eric = Author().apply { firstName = "aaaa"; lastName = "ddddmm" }
        val publisherN = Publisher().apply { name = "aaaa"; address = "zamkowa" }

        publisherRepository.save(publisherN)
        authorRepository.save(eric)

        val ddd = Book().apply { title = "aaaa"; isbn = "111"; publisher = publisherN }

        bookRepository.save<Book>(ddd)


    }
}