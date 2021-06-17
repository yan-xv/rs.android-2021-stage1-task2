package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
       return b.contentEqualsYesNo(a)
    }
    private fun String.contentEqualsYesNo(s: String): String{
        return if (this.contentEquals(s.toUpperCase().filter { this.contains(it) })) "YES" else "NO"
    }
}