import java.util.Scanner

val scanner: Scanner = Scanner(System.`in`)
var archiveName :String? = null
val archive: MutableMap<String,MutableList<String>> = mutableMapOf()


fun main() {
    menu("Архив.",archive.keys,::articles,::create)
}


fun menu(name:String,items:Iterable<String>,openArticle:(Int) -> Unit,create:(String)->Unit){
    while (true){
        val scanner = Scanner(System.`in`)

        if(name =="Архив.") {
            println("Список архивов:")
        }

        else println("Список заметок:")

        println("0.Создать $name")
        var point = 1

        if(name == "Архив.") {
            items.forEach { println("${point++}.Созданный архив ${it.trim()}") }
        }
        else items.forEach{ println("${point++}.Созданная заметка ${it.take(5)}...")}

        println("$point.Выход")

        while (scanner.hasNext() and !scanner.hasNextInt()){
            println("Введено неверное значение.Вы ввели ${scanner.next()}.Повторите ввод.")
        }

        when(val input = scanner.nextInt()){
            0 -> create(name)
            in 0 until point -> openArticle(input)
            point -> {
                println("Завершение программы заметки.")
                break}
            else -> println("Введено неверное значение.")
        }
    }
}
fun articles(number:Int){
    archiveName = archive.keys.elementAt(number -1)
    println("Открыт архив : $archiveName")
    menu("заметку",archive[archiveName]!!,::showArticle,::create)
}
