import platform.linux.*

actual fun alert(title: String, message: String) {
    println(title)
    println(message)
}
