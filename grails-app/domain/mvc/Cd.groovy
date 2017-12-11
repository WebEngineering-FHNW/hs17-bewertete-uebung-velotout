package mvc

class Cd extends Media {

    String format

    @Override
    String toString(){ autor+"-"+title+"."+format }
    static constraints = {
        format size:3..20,blank:false
        }

}
