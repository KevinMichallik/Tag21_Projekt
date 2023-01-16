fun main(){

    val liste1 = listOf<Int>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val liste2: MutableList<Int> = mutableListOf()
    var neueWerte = 1
    while (neueWerte < liste1.size){
        liste2.add(liste1[neueWerte])
        neueWerte = neueWerte +2
    }

    println(liste2)


}