import platform.windows.*

actual fun alert(title: String, message: String) {
    MessageBoxW(null, message, title, MB_OK or MB_ICONINFORMATION)
}