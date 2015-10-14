package test.unit.service.mock

import grails.transaction.Transactional
import grails.plugin.segmentio.SegmentioService

@Transactional
class AuthorService {

    BookService bookService

    SegmentioService segmentioService

    def anAuthorship() {
        bookService.aBookishThing()
    }
}
