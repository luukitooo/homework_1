fun main(args: Array<String>) {

    try {
        val num1: Int = input("შეიყვანეთ პირველი რიცხვი: ").toInt()
        val num2: Int = input("შეიყვანეთ მეორე რიცხვი: ").toInt()

        println("$num1 + $num2 = ${num1 + num2}")

    } catch (e: NumberFormatException) {
        println("თქვენ შეგიძლიათ შემოიყვანოთ მხოლოდ რიცხვები!")
    }

    val choice: String = input("თავიდან ხომ არ ცდიდით? (Y/N): ")

    when (choice.lowercase().trim()) {
        "n" -> println("ნახვამდის.")
        "y" -> main(args)
        else -> println("მოხდა შეცდომა... ცადეთ თავიდან მოგვიანებით!")
    }
}

fun input(text: String): String {
    print(text)
    return readLine() ?: throw NullPointerException()
}