fun main(args: Array<String>) {
    val model = Middleware()

    // example 1:
    // - run the program, it will terminate normally
    // - then change the type of x below and the returned value of ActualDataProvider.get to VariantB
    // - there is a compile error: Type mismatch: inferred type is VariantA but VariantB was expected
    val x: VariantA = model.myValue.get()


    // example 2:
    // - remove the explicit type annotation from x
    // - change the type of ActualDataProvider.get as you like, the expected string will be printed
    println(x)
}