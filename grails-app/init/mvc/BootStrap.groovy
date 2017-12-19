package mvc

import grails.util.Environment

class BootStrap {

    def init = { servletContext ->
        if (Environment.current == Environment.PRODUCTION) {
            return
        }

        Person dierk = save(new Person(firstName: "Dierk", lastName: "König", student:false,email:"dierk.koenig@fhnw.ch",fakultaet:"ETH Zurich"))
        Person jurg = save(new Person(firstName: "Jürg", lastName: "Luthiger", student:false,email:"jurg.luthiger@fhnw.ch",fakultaet:"FHNW Windisch"))
        Person celine = save(new Person(firstName: "Céline", lastName: "Bastady", student:true,email:"celine.bastady@student.fhnw.ch",fakultaet:"FHNW Windisch"))
        Person jonas = save(new Person(firstName: "Jonas", lastName: "Haberkorn", student:true,email:"jonas.16@gmail.com",fakultaet:"FHNW Windisch"))
        Person gabrielle = save(new Person(firstName: "Gabrielle", lastName: "Hure", student:true,email:"gabby@laposte.net",fakultaet:"FHNW Windisch"))
        Person stephane = save(new Person(firstName: "Stéphane", lastName: "Goldstein", student:true,email:"stephane.goldstein@hotmail.fr",fakultaet:"ETH Zurich"))

        Media cd01 = save(new Cd(title:"Final Countdown",autor: "Europe",format:"mp3"))
        Media cd02 = save(new Cd(title:"Highway to hell",autor: "ACDC",format:"mp3"))
        Media cd03 = save(new Cd(title:"Nothing else matters",autor: "Metallica",format:"wav"))
        Media cd04 = save(new Cd(title:"Je te promets",autor: "Johnny",format:"wav"))

        Book book01 = save(new Book(title:"Thérèse Raquin",autor: "Emile Zola",isbnID: "2-2122-6218-1", pages:"330",resume:"Die Geschichte von einem Mann",category:"ADULT",editor:"HATIER"))
        Book book02 = save(new Book(title:"Astérix et Obélix",autor: "Gioscinni",isbnID: "3-2122-6218-2", pages:"240",resume:"Wie immer, werden Asterix und Obelix ein neue Abenteur leben in diesem Kapitel",category:"SCHOOL",editor:"HATIER"))
        Book book03 = save(new Book(title:"Learn how to speak french",autor: "Europe",isbnID: "2-2122-6218-3", pages:"100",resume:"You find the french  people sexy ? We are agree with you. Try our new Method to speak French easily !",category:"SCHOOL",editor:"HATIER"))
        Book book04 = save(new Book(title:"Final Book",autor: "Europe",isbnID: "3-2122-6218-4", pages:"140",resume:"Die Geschichte von einem Mann",category:"KIDS: 12-14",editor:"HATIER"))

        Date today = new Date().clearTime();

        save(new Booking(booker: dierk, media: book01 , date: today + 3))
        save(new Booking(booker: celine, media: book02 , date: today))
        save(new Booking(booker: jurg, media: cd01, date: today + 1))


    }

    static save(domainObject) {
        domainObject.save(failOnError: true)
    }

    def destroy = {
    }
}
