package test.unit.service.mock

import grails.transaction.Transactional

@Transactional
class AuthorService {

    BookService bookService

    def anAuthorship() {
        bookService.aBookishThing()
    }
}
