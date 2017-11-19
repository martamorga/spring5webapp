package mm.springframework.spring5webapp.repository

import mm.springframework.spring5webapp.model.Publisher
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component

@Component
interface PublisherRepository : CrudRepository<Publisher, Long>