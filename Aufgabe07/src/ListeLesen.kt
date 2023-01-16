import kotlin.math.max

fun main () {
    val list : List<String> = listOf("Hallo", "Welt", "!", "Was", "für", "ein", "schöner", "Tag", "!")
    //Erstelle unter diesem Kommentar eine Schleife, die die Liste oben auslesen kann

var listIndex = 0
    while (listIndex < list.size) {
        println(list[listIndex])
        listIndex++
    }

}



