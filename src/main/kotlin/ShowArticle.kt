fun showArticle(n:Int){
    while (true){
        val text = archive[archiveName]!!.elementAt(n-1)
        println("Заметка $n.")
        println("Текст заметки: $text")
        println("0.Добавить текст.")
        println("1.Назад.")
        if(scanner.hasNextInt()){
            when(scanner.nextInt()){
                0 -> changeArticle(n-1)
                1 -> break
                else -> println("Данного числа нет повторите ввод.")
            }
        }else {println("Неверный ввод, введите число.")
            scanner.nextLine()}
    }
}
