fun main() {

//    var book1 = Book()
//    book1.author = "Hussain"
//    book1.title = "Life and Challenges"
//    book1.yearPublished = 2019

    var book1 = Book("Life and Challenges", "Hussain", 2019, "1st Generation")
    book1.getBookInfo()
}

//class Book(){
//    var title: String = ""
//    var author: String = ""
//    var yearPublished: Int = 0
//}



class Book constructor(var title: String, var author: String, var yearPublished: Int, var genre: String) {
    fun getBookInfo() {
        println("$title, By: $author ($yearPublished) ($genre)")
    }
}