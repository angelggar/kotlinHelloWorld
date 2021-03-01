class HelloWorldKt {
    internal object HelloWorldKt {
        @JvmStatic
        fun main(args: Array<String>) {
            var language = "English"
            var language2: String = "Spanish"
            val score = 95
            println("Hello, World!" + language)


            //var one //Error
            var one : Int

            language2 = "2"
            language = "Bye"
            println("Hello, World!" + language)

        }
    }
}