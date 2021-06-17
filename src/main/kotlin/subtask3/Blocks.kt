package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when (blockB) {
            Int::class -> blockA.filterIsInstance<Int>().sum()
            String::class -> blockA.filterIsInstance<String>().joinToString("")
            LocalDate::class -> {
                var maxDate: LocalDate = LocalDate.MIN
                blockA.filterIsInstance<LocalDate>().forEach { if (it > maxDate) maxDate = it}
                maxDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }

            else -> ""
        }
    }
}
