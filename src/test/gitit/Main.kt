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
            bear(3)
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

        fun bear(count: Int) {
            System.out.println()
            //language=TEXT
            (1..count).forEach( {
                System.out.print("ʕ•ᴥ•ʔ ")
            })
            System.out.println()
        }
    }

}
