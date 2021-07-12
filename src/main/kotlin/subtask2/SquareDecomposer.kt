package subtask2

import java.math.BigInteger
import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        var list = mutableListOf<Int>()
        var ch: Long = number.toLong()
        var i: Long = 0
        if(number<4){
            return null
        }
        while (i != ch) {
            list.clear()
            list.add((ch - 1).toInt())
            var sum: BigInteger = BigInteger.valueOf(ch * ch - (ch - 1) * (ch - 1))
            i++
            sum -= BigInteger.valueOf(i * i)
            list.add(i.toInt())
            while (sum != BigInteger.valueOf(0)) {
                list.add(sqrt(sum.toDouble()).toInt())
                sum -= BigInteger.valueOf(sqrt(sum.toDouble()).toLong()) * BigInteger.valueOf(
                    sqrt(
                        sum.toDouble()
                    ).toLong()
                )
            }
            if (list.size.toLong() == list.toSet().size.toLong()) {
                break
            }

        }
        list.sort()
        return list.toTypedArray()
    }
}
