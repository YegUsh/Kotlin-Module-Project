fun changeArticle(n:Int){
    scanner.nextLine()
    println("Введите новый текст.")
    val text = scanner.nextLine()
    archive[archiveName]!![n] += text
}