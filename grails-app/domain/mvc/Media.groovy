package mvc

abstract class Media{

    String title
    String autor

    static constraints = {
        title size: 3..30, blank: false
        autor size:3..30,blank:false
    }

    @Override
    String toString(){
        return title+ " [" + autor+"]";
    }

}