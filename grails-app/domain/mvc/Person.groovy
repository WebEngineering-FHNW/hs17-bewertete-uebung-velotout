package mvc

class Person {

    String firstName
    String lastName
    boolean student
    String email
    String fakultaet
    //char sexe

    @Override
    String toString(){
        return firstName + " " + lastName
    }

    final static FHNW_Windisch  = "FHNW Windisch"
    final static FHNW_Olten = "FHNW Olten"
    final static ETH_Zurich = "ETH Zurich"
    final static UNI_Basel = "Universität Basel"
    final static HFU = "Hochschule Furtwangen"

    final static masculin = 'M';

    static constraints = {
        firstName size: 3..15, blank: false
        fakultaet inList: [FHNW_Windisch, FHNW_Olten, ETH_Zurich, UNI_Basel,HFU]
        lastName size: 3..15, blank: false
        email email: true, blank: false,unique: true
     //   sexe inList:[masculin,'F','N']

    }
}