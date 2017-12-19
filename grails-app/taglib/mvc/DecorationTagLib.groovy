package mvc

class DecorationTagLib {
    static defaultEncodeAs = 'raw'
    static namespace = "mvc"

    def decorate = { attributes, body ->
        String sexe = attributes.var
        String sprache = attributes.language
        def decor = "";
        switch (sexe) {
            case ["Feminin"] : decor += "💄 "; break
            case ["Masculin"] : decor += "🚗 "; break

            default: decor = ""
        }
        switch (sprache) {
            case ["French"] : decor += "🇫🇷 "; break
            case ["Deutsch"] : decor += "🇩🇪 "; break
            case ["Italian"] : decor += "🇮🇹"; break
            case ["Englisch"] : decor += "🇬🇧"; break
            case ["Others"] : decor += "❓"; break
            default: decor += ""
        }
        out << decor
        out << body()
        out << decor
    }
}
