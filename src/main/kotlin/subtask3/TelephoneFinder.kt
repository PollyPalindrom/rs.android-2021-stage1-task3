package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        var list = arrayListOf<String>()
        if (number.contains('-')) return null
        number.toCharArray().forEachIndexed { index, c ->
            var chars: Array<Char> = when (c) {
                '0' -> arrayOf('8')
                '1' -> arrayOf('2', '4')
                '2'-> arrayOf('1','3','5')
                '3'-> arrayOf('2','6')
                '4'-> arrayOf('1','5','7')
                '5'-> arrayOf('2','4','6','8')
                '6'-> arrayOf('3','5','9')
                '7'-> arrayOf('4','8')
                '8'-> arrayOf('0','5','7','9')
                else-> arrayOf('6','8')
            }
            chars.forEach {
                var buf: StringBuffer
                buf =StringBuffer(number)
                buf.setCharAt(index,it)
                list.add(buf.toString())
            }
        }
        return list.toTypedArray()
    }
}
