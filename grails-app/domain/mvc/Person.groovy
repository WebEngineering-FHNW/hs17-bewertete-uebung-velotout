package mvc

class Person {

    String firstName
    String lastName
    boolean student
    String email
    String fakultaet


    @Override
    String toString(){
        return firstName + " " + lastName
    }

    final static FHNW_Windisch  = "FHNW Windisch"
    final static FHNW_Olten = "FHNW Olten"
    final static ETH_Zurich = "ETH Zurich"


    static constraints = {
        firstName size: 5..15, blank: false
        fakultaet inList: [FHNW_Windisch, FHNW_Olten, ETH_Zurich]
        lastName size: 5..15, blank: false
        email email: true, blank: false,unique: true

    }
}