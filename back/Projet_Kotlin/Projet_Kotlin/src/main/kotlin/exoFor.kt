fun main() {
    helloFor()

    var phrase: String = "eeeeeeeeAlors,eeee ça eeeegaz !!!eeeeeeee"
    println(sansLesE(phrase))
    println(sansLesEFacto(phrase))
    println("Nombre de 'A' : " + nbA(phrase))
    println(inverser(phrase))
    println(inverserBis(phrase))
}

fun helloFor() {
    println("Hello world !!!")
}

fun sansLesE(phrase: String) : String {
    var resultat: String = ""
    for (c in phrase) {
        if (c != 'e' && c != 'E') {resultat += c}
    }
//    for (c in phrase) {resultat += if (c != 'e' && c != 'E') c else ""}
    return resultat
}
fun sansLesEFacto(phrase: String) : String {
    var resultat: String = ""
    for (c in phrase) {resultat += if (c != 'e' && c != 'E') c else ""}
    return resultat
}

fun nbA(phrase: String) : Int {
    var resultat: Int = 0
    for (c in phrase) {if (c == 'a' || c == 'A') {resultat++}}
    return resultat
}
fun nbALambda(phrase: String) : Int {
    var resultat: Int = 0
    for (c in phrase) {if (c == 'a' || c == 'A') {resultat++}}
    return resultat
}

fun inverser(phrase: String) : String {
    var resultat: String = ""
    for (c in phrase) {resultat = c + resultat}
    return resultat
}
fun inverserBis(phrase: String) : String {
    var resultat: String = ""
    for (i in phrase.length-1 downTo 0) {resultat += phrase[i]}
    return resultat
}