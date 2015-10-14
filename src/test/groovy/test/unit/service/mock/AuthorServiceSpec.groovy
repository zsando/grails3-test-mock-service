package test.unit.service.mock

import grails.test.mixin.TestFor
import grails.test.mixin.Mock
import spock.lang.Specification
import grails.plugin.segmentio.SegmentioService

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(AuthorService)
@Mock([BookService,Domain10,Domain11,Domain12,Domain13,Domain14,Domain15,Domain16,Domain17,Domain18,Domain19,Domain20,Domain21,Domain22,Domain23,Domain24,Domain25,Domain26,Domain27,Domain28,Domain29,Domain30])
class AuthorServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        given:
        //        BookService mockBookService = Mock(BookService)
        //        service.bookService = mockBookService
        SegmentioService mockSegmentioService = Mock(SegmentioService)
        
        expect:"fix me"
            true 
    }
}
