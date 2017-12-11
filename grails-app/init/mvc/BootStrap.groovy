package mvc

import grails.util.Environment

class BootStrap {

    def init = { servletContext ->
        if (Environment.current == Environment.PRODUCTION) {
            return
        }

        Room windowRoom = save(new Room(name: "1.333", max: 32))
        Room cornerRoom = save(new Room(name: "1.331", max: 42))


        Person dierk = save(new Person(firstName: "Dierk", lastName: "König", student:false,email:"dierk.koenig@fhnw.ch",fakultaet:"ETH Zurich"))
        Media cd01 = save(new Cd(title:"Final Countdown",autor: "Europe",format:"mp3"))
        Book book01 = save(new Book(title:"Final Countdown",autor: "Europe",isbnID: "2-2122-6218-6", pages:"240",
        resume:"Die Geschichte von einem Mann",type:"Physik",editor:"HATIER"))
        Book book02 = save(new Book(title:"Final Book",autor: "Europe",isbnID: "3-2122-6218-6", pages:"240",
                resume:"Die Geschichte von einem Mann",type:"Jung",editor:"HATIER"))
        String isbnID
        int pages
        String resume
        String type
        String editor

        Date today = new Date().clearTime();

        save(new Booking(booker: dierk, media: book01 , date: today - 1, slot: Booking.AM))
        save(new Booking(booker: dierk, media: book02 , date: today,     slot: Booking.AM))
        save(new Booking(booker: dierk, media: cd01, date: today + 1, slot: Booking.AM))


    }

    static save(domainObject) {
        domainObject.save(failOnError: true)
    }

    def destroy = {
    }
}
