package mvc


class BookingController {
    static scaffold = Booking


    def search(String firstName) {
        List<Person> peopleList = Person.list();
        List<Person> studentList = new ArrayList<Person>();
        for(Person p : peopleList){
            if(p.getStudent()){
                studentList.add(p);
            }
        }
        render view:"search", model:[people: studentList]
    }



}
