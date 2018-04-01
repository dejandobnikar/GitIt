package test.gitit

/**
 * Created by dejandobnikar on 01/04/2018.
 */
class Main {

    companion object Main {

        @JvmStatic fun main(args: Array<String>) {
            System.out.println("test main")
            starPrinter(5)
            letterPrinter("X", 6)
            shrugPrint()
            flipTable()
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

        fun letterPrinter(letter: String, count: Int) {

            if (count < 0) {
                throw IllegalStateException()
            }

            if (letter == null) {
                throw NullPointerException()
            }

            System.out.println("printing letter: $letter($count)")

            for (i in 1..count) {
                for (j in 1..i) {
                    System.out.print("$letter ")
                }
                System.out.println()
            }
        }

        fun shrugPrint() {
            //language=TEXT
            System.out.println()
            System.out.println("¯\\_(ツ)_/¯")
        }

        fun flipTable() {
            System.out.println()
            System.out.println("flipping table...")
            //language=TEXT
            System.out.println("(╯°□°）╯︵ ┻━┻")
        }
    }

}
