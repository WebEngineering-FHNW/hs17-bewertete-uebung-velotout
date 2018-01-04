# WebEngineering Module, Graded Exercise

## Commit Proposal

Matriculation Number:
17-548-157

Project idea short description:
I would like to implement a Grail application that will represent a library-system.
There will be Users, and Medias (Book, E-Book, Cd...) and the system will
allow User to borrow these medias.
Furthermore, each Book will be affected to a library (Place) 
User can borrow Book from differents library, for instance: FHNW Windisch, FHNW Olten...
In addition, I will implement highlighting for user that are too late with their Booking (if someone forget to give the media back...) 
So CRUD for User, Media, Library (Place)

Questions about it:
I thought, I will not implement a login function with password, everybody can have a look to others Booking and update the list. It's allowed?

Don't hesitate,if it's a bad idea i will do the socrative-light project;
 
## Project confirmation

confirmed.

Cool project. It is fully ok to go without authentication and other security features.
Just assume that users are identified before they even reach your system.
Concentrate on the library features. Start small. Extend from there. Always keep it running.
Good luck!


## Project delivery <to be filled by student>

How to start the project: (if other than `grailsw run-app`)
I used an IDE but it will normally work with run-app

How to test the project:  (if other than `grailsw test-app`)
I did some test for my navigation rules (Page "News" ) 
and some test for my BookingController

Project description:      (if other than `/index.html`)
This is a library-system. You can register yourself, and than use CRUD operation of a User-Object.
In addiction I hadded a static page (NEWS) because I wanted to train myself with html.
You can create media (book, cd...) you can borrow these medias.
At the homepage (/) you will find two others hidden pages to list the student who are registred
and a list of all the booking.

External contributions:
I take some part of your lessons (exemple: in Bootstrap the save() function)
and little script example on the net (W3school)

Other comments: 
Unfortunelty I did not highlight the booking which are late
and I removed polymorphism (Media -> Cd, Books...)

I'm particular proud of:
my css-file (style.css and what i had by application.css)
my regex-pattern for input validation

## Project grading 

Description html: I take the root page as the description.
Valid html (with minor issues). Nice use of semantic tags, where the 
nav and header tags are difficult to join with the main layout.
The application works fine.

Functionality:
CRUD and overview functionality for person and book entities and booking relation
(nicely resolved m:n relation into m:1 as explained in the lecture).
Interactive create/edit pages with solid validation.

Engineering:
Commit log is ok (you started a bit late with committing).
Test are minimal. HTML is good. Almost no comments but the code is self-describing.
Naming is ok. Some duplication in the view code but nice use of TagLib.

We already hit the ceiling so I spare the effort to think about extra points.
However, there are some really nice CSS effects at work that would call for "artistic value"!

Congratulations!
You created an interactive, DB-backed, distributed, multi-user web application from scratch
all on your own. You made very good use of Web MVC and used the Grails scaffolding to your
advantage. You modeled the domain well and looked after proper validation.

Total grade: 6.0





