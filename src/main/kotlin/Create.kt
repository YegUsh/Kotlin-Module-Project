fun create(name: String){
    if(name == "Архив."){
        println("Введите название архива:")
        val n = scanner.nextLine()
        archive[n] = mutableListOf()
    } else{
        println("Введите текст заметки:")
        val article = scanner.nextLine()
        archive[archiveName]!!.add(article)
    }
}