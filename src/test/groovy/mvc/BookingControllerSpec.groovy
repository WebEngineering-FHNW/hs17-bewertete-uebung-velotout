package mvc

import grails.test.mixin.Mock;
import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(BookingController)
@Mock(Person)
class BookingControllerSpec extends Specification {

    BookingController controller ;

    def setup() {
        controller = new BookingController()
    }

    void "test search"() {
        when:
        controller.search("Jonas")

        then:
        model.people == [] //test ob es leer ist
    }
}