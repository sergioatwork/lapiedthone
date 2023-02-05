fun main() {
    helloLambda02()
    exo2()
}
fun helloLambda02() {
    println("Hello world !!!")
}

class UserBean(s: String, i: Int) {
    var name: String = ""
    var note: Int = 0
}

fun exo2() {
    var compareUsersByName: (UserBean, UserBean) -> UserBean =
        { u1, u2 -> if (u1.name.lowercase() >= u2.name.lowercase()) u1 else u2 }
    var compareUsersByNote: (UserBean, UserBean) -> UserBean =
        { u1, u2 -> if (u1.note >= u2.note) u1 else u2 }

    val u1 = UserBean("Bob", 19)
    val u2 = UserBean("Toto", 45)
    val u3 = UserBean("Charles", 26)
    println(compareUser(compareUsersByNote, u1, u2, u3))
    println(compareUser(compareUsersByName, u1, u2, u3))
}

inline fun compareUser(compare: (UserBean, UserBean) -> UserBean, u1: UserBean, vararg list: UserBean): UserBean {
    var selectUser = u1
    for (u in list) {
        selectUser = compare(u, selectUser)
    }
    return selectUser
}
