import grails.test.mixin.TestFor
import mvc.BookingController
import spock.lang.Specification

@TestFor(BookingController)
class BookingControllerSpec extends Specification {

    void "test search"() {
        when:
        controller.search()

        then:
        title == 'Web Engineering - STUDENT'
    }
}