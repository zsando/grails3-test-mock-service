package test.unit.service.mock

import grails.test.mixin.TestFor
import grails.test.mixin.Mock
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(AuthorService)
@Mock(BookService)
class AuthorServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        given:
        BookService mockBookService = Mock(BookService)
        service.bookService = mockBookService
        
        expect:"fix me"
            true 
    }
}
