package mvc

abstract class Media{

    String title
    String autor

    static constraints = {
        title size: 3..15, blank: false
        autor size:3..20,blank:false
    }
}