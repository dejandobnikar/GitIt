package test.gitit

/**
 * Created by dejandobnikar on 01/04/2018.
 */
class Main {

    companion object Main {

        @JvmStatic fun main(args: Array<String>) {
            System.out.println("test main")
            starPrinter(5)
        }

        fun starPrinter(count: Int) {

            if (count < 0) {
                throw IllegalStateException()
            }

            System.out.println("printing stars: " + count)

            for (i in 1..count) {
                for (j in 1..i) {
                    System.out.print("* ")
                }
                System.out.println()
            }

        }

    }

}
