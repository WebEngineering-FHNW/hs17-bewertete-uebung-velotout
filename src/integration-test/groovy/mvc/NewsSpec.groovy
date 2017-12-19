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

    void "news links to the others pages thanks to the nav bar"() {
        when:"The News page is visited"
        go '/static/News.html'
        then:"The title is Web Engineering - bewertete Uebung."
        title == "Web Engineering - NEWS"

        when: "click on link to Homepage"
        $("a", text: "  ").click()
        then: "Home page is displayed"
        title == "Web Engineering - INDEX"

        when: "click on back link"
        $("a", text: "News").click()
        then: "News page is displayed, again"
        title == "Web Engineering - NEWS"
    }
}
