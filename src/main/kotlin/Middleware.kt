class Middleware {
    private val wrapper = Wrapper()
    private val provider = ActualDataProvider()

    val myValue = wrapper.wrap {
        provider.get()
    }
}