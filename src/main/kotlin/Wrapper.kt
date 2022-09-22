class Wrapper {
    fun <T> wrap(initializer: () -> T): Wrapped<T> {
        return Wrapped { initializer.invoke() }
    }
}

class Wrapped<T>(private val initializer: () -> T) {
    fun get(): T {
        return initializer.invoke()
    }
}