package A1BasicPatterns

class BasicPatterns {
    init {
        main()
    }

    fun main() {
        // Working in patterns branch
        // chceking email changes in the git
        pattern1(10)
    }

    fun pattern1(n: Int) {
        /*Triangle pattern*/
        for (i in 1..n) {
            for (j in 1..i) {
                print("*")
            }
            println()
        }
    }
}