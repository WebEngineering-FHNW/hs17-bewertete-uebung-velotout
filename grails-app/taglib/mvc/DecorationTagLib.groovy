package mvc

class DecorationTagLib {
    static defaultEncodeAs = 'raw'
    static namespace = "mvc"

    def decorate = { attributes, body ->
        char sexe = attributes.var
        def decor = "<img src='http://2.bp.blogspot.com/";
        switch (sexe) {
            case ['M'] : decor += "-rnfZUujszZI/UZEFYJ269-I/AAAAAAAADnw/BbB-v_QWo1w/s1600/facebook-frown-emoticon.png'>"; break
            case ['F'] : decor += "-qODY1kxipZ0/Tv5dwDFFntI/AAAAAAAAAjM/cLXT6KEp-bE/s400/sunglasses%2Bemoticon.png'>"; break
            default: decor = ""
        }
        out << decor
        out << body()
        out << decor
    }
}
