package mvc

import grails.test.mixin.integration.Integration
import geb.spock.*

/**
 * See http://www.gebish.org/manual/current/ for more instructions
 */
@Integration
class NewsSpec extends GebSpec {

    void "test news is there"() {
        when:"The News page is visited"
        go '/static/News.html'
        then:"The title is Web Engineering ..."
        title == "Web Engineering - NEWS"
    }


}
