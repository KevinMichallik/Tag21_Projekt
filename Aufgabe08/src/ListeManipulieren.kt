fun main() {
    var list: MutableList<Int> = mutableListOf(0, 1, 2, 3, 4, 5)
    //Implementiere unter diesem Kommentar die in der Aufgabe beschriebene while-Schleife

    var listIndex = 0
    while (listIndex < list.size) {
        var verdoppeln = list[listIndex] * 2
        list[listIndex] = verdoppeln

        listIndex++
    }

    println(list)
}