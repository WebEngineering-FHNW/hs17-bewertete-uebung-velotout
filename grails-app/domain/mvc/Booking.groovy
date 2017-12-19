package mvc

import grails.rest.Resource

// @Resource ==> Fur JSON format Service


class Booking {

    Person booker
    Media   media
    Date   date
    //Date returnDate = date+15;

    String toString(){
       return booker.toString()+" ==> "+media.toString()+" for "+date;
    }

    static constraints = {
        date min: new Date().clearTime(),nullable:false,blank:false

    }
}
