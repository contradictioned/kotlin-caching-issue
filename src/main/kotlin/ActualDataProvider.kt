class ActualDataProvider {
    fun get() = VariantA()
}

class VariantA {
    override fun toString() = "instance of A"
}

class VariantB {
    override fun toString() = "instance of B"
}
