fun main() {
    helloBeans()

    val randomName = RandomName()
    randomName.add("bobby")
    repeat(10) {
        print(randomName.next() + " ")
    }
    println()
    println("---------------------------------------------------------------------------------------------------------")
    repeat(10) {
        print(randomName.nextDiff() + " ")
    }
    println()
    println("---------------------------------------------------------------------------------------------------------")
    var prenoms = Pair<String, String>("", "")
    repeat(10) {
        prenoms = randomName.next2()
        print(" < " + prenoms.first + " " + prenoms.second + " > ")
    }
}

fun helloBeans() {
    println("Hello world !!!")
}

class RandomName {
    private val prenomList = arrayListOf("Jean-Luc", "Louise", "Evelyne")
    private var lastPrenom: String = ""

    fun add(prenom: String) {
//        if (prenom != null && prenom != "" && prenom.isNotBlank() && !prenomList.contains(prenom)) { prenomList.add(prenom) }
        if (!prenom.isNullOrBlank() && prenom !in prenomList) { prenomList.add(prenom) }
    }
    fun next() : String {
        return prenomList.random()
    }
    fun nextDiff() : String {
        var prenom: String = ""
        do {
            prenom = prenomList.random()
        }
        while (prenom == lastPrenom)
        lastPrenom = prenom
        return prenom
    }
    fun nextDiffBis() : String {
        lastPrenom = prenomList.filter { it != lastPrenom }.random()
        return lastPrenom
    }

    fun next2() : Pair<String, String> {
        return Pair(nextDiff(), nextDiff())
    }
}