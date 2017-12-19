package mvc

class Book {

        String isbnID
        int pages
      String resume
    String editor
    String category
    String title
    String autor
    String origin

    //category
    final static Child  = "KIDS: 12-14"
    final static Adult = "ADULT"
    final static School = "SCHOOL"
    //origin
    final static FHNW_Windisch  = "FHNW Windisch"
    final static FHNW_Olten = "FHNW Olten"
    final static ETH_Zurich = "ETH Zurich"
    final static UNI_Basel = "Universität Basel"
    final static HFU = "Hochschule Furtwangen"

    @Override
    String toString(){ autor+"-"+title+"-"+editor }

        static constraints = {
            title size: 3..30, blank: false
            autor size:3..30,blank:false
            origin blank:false, inList: [FHNW_Windisch, FHNW_Olten, ETH_Zurich, UNI_Basel,HFU]
            editor size:5..20,blank:false
            category inList: [Child, Adult, School],nullable:true
            isbnID unique:true,nullable:true,matches: "[0-9]-[0-9]{4}-[0-9]{4}-[0-9]"
            resume nullable:true,size:10..200,blank:false,matches: "[a-zA-Z0-9ÀÂÇÈÉÊËÎÔÙÛàâçèéêëîôùû\\.\\s\\(\\)\\[\\]\"'\\-,;:\\/!\\?]+"
        }

}
