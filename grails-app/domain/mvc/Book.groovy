package mvc

class Book extends Media {

        String isbnID
        int pages
        String resume
          String editor
    String category

    final static Child  = "KIDS: 12-14"
    final static Adult = "ADULT"
    final static School = "SCHOOL"


    @Override
    String toString(){ autor+"-"+title+"-"+editor }

        static constraints = {
            editor size:5..20,blank:false
            category inList: [Child, Adult, School],nullable:true
            isbnID unique:true,nullable:true,matches: "[0-9]-[0-9]{4}-[0-9]{4}-[0-9]"
            resume nullable:true,size:10..200,blank:false,matches: "[a-zA-Z0-9ÀÂÇÈÉÊËÎÔÙÛàâçèéêëîôùû\\.\\s\\(\\)\\[\\]\"'\\-,;:\\/!\\?]+"
        }

}