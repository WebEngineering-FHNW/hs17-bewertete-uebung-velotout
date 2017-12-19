package mvc

abstract class Media{

    String title
    String autor
    String origin

    static constraints = {
        title size: 3..30, blank: false
        autor size:3..30,blank:false
        origin blank:false, inList: [FHNW_Windisch, FHNW_Olten, ETH_Zurich, UNI_Basel,HFU]
    }

    @Override
    String toString(){
        return title+ " [" + autor+"]"+"-"+origin;
    }
    final static FHNW_Windisch  = "FHNW Windisch"
    final static FHNW_Olten = "FHNW Olten"
    final static ETH_Zurich = "ETH Zurich"
    final static UNI_Basel = "Universität Basel"
    final static HFU = "Hochschule Furtwangen"
}