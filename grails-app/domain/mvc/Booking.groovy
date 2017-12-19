package mvc

import grails.rest.Resource

// @Resource ==> Fur JSON format Service


class Booking {

    Person booker
    Media   media
    Date   date
    //Date returnDate = date+15;

    String toString(){
        Date today = new Date().clearTime();
        if(date+7<=today) {return booker.toString()+" ==> "+media.toString()+" for "+date+" WARNING Media must come back";}
        else {
        return booker.toString()+" ==> "+media.toString()+" for "+date;}
    }

    static constraints = {
        date min: new Date().clearTime(),nullable:false,blank:false

    }
}
