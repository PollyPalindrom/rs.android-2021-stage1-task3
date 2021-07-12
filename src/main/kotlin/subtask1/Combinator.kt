package subtask1

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        var m = 0
        var n = array[1]
        var c = array[0]
        while (m <= n) {
            if ((factorial(n) / c).toLong() == (factorial(m) * factorial(n - m)).toLong()) {
                return m; break//return m
            }
            m++
        }
        return null
    }
    private fun factorial(n: Int): Long = if (n < 2) 1 else n * factorial(n - 1)
}
